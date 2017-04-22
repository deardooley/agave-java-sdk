package org.agave.client;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Settings {

	private static final Logger logger = Logger.getLogger(Settings.class.getName());
	private static final String PROPERTY_FILE = "agave.properties";
	
	private static Properties 		props = new Properties();
	
	public static String			API_BASE_URL;
	public static String			API_VERSION;
	public static String 			SERVICE_ACCOUNT_TENANT_ID;
	public static String 			SERVICE_ACCOUNT_USERNAME;
    public static String 			SERVICE_ACCOUNT_PASSWORD;

    public static String			SERVICE_ACCOUNT_CLIENT_KEY;
    public static String			SERVICE_ACCOUNT_CLIENT_SECRET;
    public static String			SERVICE_ACCOUNT_ACCESS_TOKEN;
    
    public static File				AUTH_CACHE_FILE;
    
    
	static 
	{
		props = loadRuntimeProperties();
		
		SERVICE_ACCOUNT_TENANT_ID = (String) props.getProperty("service.account.tenant.id");
		
		API_BASE_URL = (String) props.getProperty("api.base.url", "https://public.agaveapi.co");
		while (API_BASE_URL.endsWith("/")) {
			API_BASE_URL = API_BASE_URL.substring(0, API_BASE_URL.length()-2);
		}
		
		API_VERSION = (String) props.getProperty("api.version", "v2");
		
		String authCachFilePath = props.getProperty("service.account.auth.cache.file", System.getProperty("user.home") + File.separator + ".agave");
		AUTH_CACHE_FILE = new File(authCachFilePath);
		
		SERVICE_ACCOUNT_ACCESS_TOKEN = (String) props.getProperty("service.account.access.token");

		SERVICE_ACCOUNT_CLIENT_KEY = (String) props.get("service.account.client.key");
		SERVICE_ACCOUNT_CLIENT_SECRET = (String) props.get("service.account.client.secret");
		
		SERVICE_ACCOUNT_USERNAME = (String) props.get("service.account.username");
		SERVICE_ACCOUNT_PASSWORD = (String) props.get("service.account.password");
	}
	
	/**
     * Overlays the runtime environment variables on any auth properties files read 
     * from disk. The environment variables will supersede any properties files. 
     * 
     * @return {@link Properties} object containing the runtime properties
     * to be used by this app.
     */
    public static Properties loadRuntimeProperties()
    {
        Properties props = loadPropertiesFromDisk();
        
        Map<String, String> environment = System.getenv();
        for (String varName : environment.keySet())
        {
            if (varName == null || varName.trim().equals("")) continue;
            
            String propName = varName.toLowerCase().replaceAll("_", ".");
            
            props.remove(propName);
            props.setProperty(propName, environment.get(varName));
        }
        
        return props;
    }

	/**
	 * Reads in an auth cache file from disk. The order of lookup locations is:
	 * <ul>
	 * <li> /run/secrets/SERVICE_ACCOUNT_AUTH_CACHE_FILE </li>
	 * <li> $AGAVE_CACHE_DIR/current </li>
	 * <li> $HOME/.agave/current </li>
	 * </ul>
	 * 
	 * @return
	 */
	public static Properties loadPropertiesFromDisk() {
		Properties props = new Properties();
        try {
            props.load(Settings.class.getClassLoader().getResourceAsStream(PROPERTY_FILE));
        }
        catch (Exception e) {
        	logger.log(Level.SEVERE, "Unable to load embedded agave cache file", e);
            String localCacheDirPath = System.getenv("AGAVE_CACHE_DIR");
            
            File localCacheFile = new File("/run/secrets/SERVICE_ACCOUNT_AUTH_CACHE_FILE");
            
            if (!localCacheFile.exists() && !StringUtil.isBlank(localCacheDirPath)) {
            	localCacheFile = new File(localCacheDirPath + File.separator + "current");
            }
            if (!localCacheFile.exists()) {
            	localCacheFile = new File(System.getProperty("user.home") + File.separator + 
            			".agave" + File.separator + "current");
            }
            
            
            if (localCacheFile.exists()) {
            	FileInputStream in = null;
            	try {
            		in = new FileInputStream(localCacheFile);
            		
            		props.load(in);
            	}
            	catch (IOException e1) {
            		logger.log(Level.SEVERE, 
            				"Unable to load local agave cache file from disk at " + localCacheFile.getAbsolutePath(), 
            				e1);
            	}
            	finally {
            		try { in.close(); } catch (Exception e1) {}
            	}
            }
        }
		return props;
	}
    
}
