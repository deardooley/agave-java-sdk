package org.agave.client.model;

import java.util.Objects;

import org.agave.client.model.Gender;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A user profile describing an actual user.
 */
@ApiModel(description = "A user profile describing an actual user.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T09:43:56.622Z")
public class Profile {
  @SerializedName("city")
  private String city = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("department")
  private String department = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("fax")
  private String fax = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("gender")
  private Gender gender = null;

  @SerializedName("institution")
  private String institution = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("position")
  private String position = null;

  @SerializedName("researchArea")
  private String researchArea = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("username")
  private String username = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("uuid")
  private String uuid = null;

  public Profile city(String city) {
    this.city = city;
    return this;
  }

   /**
   * The city of the user
   * @return city
  **/
  @ApiModelProperty(value = "The city of the user")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Profile country(String country) {
    this.country = country;
    return this;
  }

   /**
   * The country of the user
   * @return country
  **/
  @ApiModelProperty(value = "The country of the user")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Profile department(String department) {
    this.department = department;
    return this;
  }

   /**
   * The institutional department of the user
   * @return department
  **/
  @ApiModelProperty(value = "The institutional department of the user")
  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public Profile email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The unique email address of the user
   * @return email
  **/
  @ApiModelProperty(required = true, value = "The unique email address of the user")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Profile fax(String fax) {
    this.fax = fax;
    return this;
  }

   /**
   * The fax number of the user
   * @return fax
  **/
  @ApiModelProperty(value = "The fax number of the user")
  public String getFax() {
    return fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }

  public Profile firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * The first name of the user
   * @return firstName
  **/
  @ApiModelProperty(value = "The first name of the user")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Profile gender(Gender gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @ApiModelProperty(value = "")
  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

  public Profile institution(String institution) {
    this.institution = institution;
    return this;
  }

   /**
   * The home institution of the user
   * @return institution
  **/
  @ApiModelProperty(value = "The home institution of the user")
  public String getInstitution() {
    return institution;
  }

  public void setInstitution(String institution) {
    this.institution = institution;
  }

  public Profile lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * The last name of the user
   * @return lastName
  **/
  @ApiModelProperty(value = "The last name of the user")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Profile phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * The phone number of the user
   * @return phone
  **/
  @ApiModelProperty(value = "The phone number of the user")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Profile position(String position) {
    this.position = position;
    return this;
  }

   /**
   * The position of employment of the user
   * @return position
  **/
  @ApiModelProperty(value = "The position of employment of the user")
  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public Profile researchArea(String researchArea) {
    this.researchArea = researchArea;
    return this;
  }

   /**
   * The primary area of research of the user
   * @return researchArea
  **/
  @ApiModelProperty(value = "The primary area of research of the user")
  public String getResearchArea() {
    return researchArea;
  }

  public void setResearchArea(String researchArea) {
    this.researchArea = researchArea;
  }

  public Profile state(String state) {
    this.state = state;
    return this;
  }

   /**
   * The state of the user
   * @return state
  **/
  @ApiModelProperty(value = "The state of the user")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Profile username(String username) {
    this.username = username;
    return this;
  }

   /**
   * The unique username of the user
   * @return username
  **/
  @ApiModelProperty(required = true, value = "The unique username of the user")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Profile password(String password) {
    this.password = password;
    return this;
  }

   /**
   * The password to set for this profile
   * @return password
  **/
  @ApiModelProperty(value = "The password to set for this profile")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Profile uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * The uuid of the user
   * @return uuid
  **/
  @ApiModelProperty(required = true, value = "The uuid of the user")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Profile profile = (Profile) o;
    return Objects.equals(this.city, profile.city) &&
        Objects.equals(this.country, profile.country) &&
        Objects.equals(this.department, profile.department) &&
        Objects.equals(this.email, profile.email) &&
        Objects.equals(this.fax, profile.fax) &&
        Objects.equals(this.firstName, profile.firstName) &&
        Objects.equals(this.gender, profile.gender) &&
        Objects.equals(this.institution, profile.institution) &&
        Objects.equals(this.lastName, profile.lastName) &&
        Objects.equals(this.phone, profile.phone) &&
        Objects.equals(this.position, profile.position) &&
        Objects.equals(this.researchArea, profile.researchArea) &&
        Objects.equals(this.state, profile.state) &&
        Objects.equals(this.username, profile.username) &&
        Objects.equals(this.password, profile.password) &&
        Objects.equals(this.uuid, profile.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, country, department, email, fax, firstName, gender, institution, lastName, phone, position, researchArea, state, username, password, uuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Profile {\n");
    
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    institution: ").append(toIndentedString(institution)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    researchArea: ").append(toIndentedString(researchArea)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

