/*
 * Visier User Management APIs
 * Visier APIs for managing users within an organization
 *
 * The version of the OpenAPI document: 22222222.99201.1200
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.UserGroupGetAPIResponseDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * PermissionsToUserGroupForTenantDTO
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PermissionsToUserGroupForTenantDTO {
  public static final String SERIALIZED_NAME_TENANT_CODE = "tenantCode";
  @SerializedName(SERIALIZED_NAME_TENANT_CODE)
  private String tenantCode;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_USER_GROUPS = "userGroups";
  @SerializedName(SERIALIZED_NAME_USER_GROUPS)
  private List<UserGroupGetAPIResponseDTO> userGroups = null;

  public PermissionsToUserGroupForTenantDTO() {
  }

  public PermissionsToUserGroupForTenantDTO tenantCode(String tenantCode) {
    
    
    
    
    this.tenantCode = tenantCode;
    return this;
  }

   /**
   * The unique identifier associated with the tenant.
   * @return tenantCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique identifier associated with the tenant.")

  public String getTenantCode() {
    return tenantCode;
  }


  public void setTenantCode(String tenantCode) {
    
    
    
    this.tenantCode = tenantCode;
  }


  public PermissionsToUserGroupForTenantDTO status(String status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * The state of the permission assignment or removal. Valid values are Succeed or Failed.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The state of the permission assignment or removal. Valid values are Succeed or Failed.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    
    
    
    this.status = status;
  }


  public PermissionsToUserGroupForTenantDTO message(String message) {
    
    
    
    
    this.message = message;
    return this;
  }

   /**
   * A detailed description of the request outcome, if available.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A detailed description of the request outcome, if available.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    
    
    
    this.message = message;
  }


  public PermissionsToUserGroupForTenantDTO userGroups(List<UserGroupGetAPIResponseDTO> userGroups) {
    
    
    
    
    this.userGroups = userGroups;
    return this;
  }

  public PermissionsToUserGroupForTenantDTO addUserGroupsItem(UserGroupGetAPIResponseDTO userGroupsItem) {
    if (this.userGroups == null) {
      this.userGroups = new ArrayList<>();
    }
    this.userGroups.add(userGroupsItem);
    return this;
  }

   /**
   * A list of objects representing user groups and the permissions to assign to or remove from them.
   * @return userGroups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of objects representing user groups and the permissions to assign to or remove from them.")

  public List<UserGroupGetAPIResponseDTO> getUserGroups() {
    return userGroups;
  }


  public void setUserGroups(List<UserGroupGetAPIResponseDTO> userGroups) {
    
    
    
    this.userGroups = userGroups;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the PermissionsToUserGroupForTenantDTO instance itself
   */
  public PermissionsToUserGroupForTenantDTO putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissionsToUserGroupForTenantDTO permissionsToUserGroupForTenantDTO = (PermissionsToUserGroupForTenantDTO) o;
    return Objects.equals(this.tenantCode, permissionsToUserGroupForTenantDTO.tenantCode) &&
        Objects.equals(this.status, permissionsToUserGroupForTenantDTO.status) &&
        Objects.equals(this.message, permissionsToUserGroupForTenantDTO.message) &&
        Objects.equals(this.userGroups, permissionsToUserGroupForTenantDTO.userGroups)&&
        Objects.equals(this.additionalProperties, permissionsToUserGroupForTenantDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantCode, status, message, userGroups, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionsToUserGroupForTenantDTO {\n");
    sb.append("    tenantCode: ").append(toIndentedString(tenantCode)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    userGroups: ").append(toIndentedString(userGroups)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("tenantCode");
    openapiFields.add("status");
    openapiFields.add("message");
    openapiFields.add("userGroups");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PermissionsToUserGroupForTenantDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PermissionsToUserGroupForTenantDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PermissionsToUserGroupForTenantDTO is not found in the empty JSON string", PermissionsToUserGroupForTenantDTO.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("tenantCode") != null && !jsonObj.get("tenantCode").isJsonNull()) && !jsonObj.get("tenantCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenantCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenantCode").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if (jsonObj.get("userGroups") != null && !jsonObj.get("userGroups").isJsonNull()) {
        JsonArray jsonArrayuserGroups = jsonObj.getAsJsonArray("userGroups");
        if (jsonArrayuserGroups != null) {
          // ensure the json data is an array
          if (!jsonObj.get("userGroups").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `userGroups` to be an array in the JSON string but got `%s`", jsonObj.get("userGroups").toString()));
          }

          // validate the optional field `userGroups` (array)
          for (int i = 0; i < jsonArrayuserGroups.size(); i++) {
            UserGroupGetAPIResponseDTO.validateJsonObject(jsonArrayuserGroups.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PermissionsToUserGroupForTenantDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PermissionsToUserGroupForTenantDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PermissionsToUserGroupForTenantDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PermissionsToUserGroupForTenantDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<PermissionsToUserGroupForTenantDTO>() {
           @Override
           public void write(JsonWriter out, PermissionsToUserGroupForTenantDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public PermissionsToUserGroupForTenantDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PermissionsToUserGroupForTenantDTO instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PermissionsToUserGroupForTenantDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PermissionsToUserGroupForTenantDTO
  * @throws IOException if the JSON string is invalid with respect to PermissionsToUserGroupForTenantDTO
  */
  public static PermissionsToUserGroupForTenantDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PermissionsToUserGroupForTenantDTO.class);
  }

 /**
  * Convert an instance of PermissionsToUserGroupForTenantDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
