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
import com.konfigthis.client.model.AssignRevokePermissionByPermissionDTO;
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
 * The permissions organized by tenant.
 */
@ApiModel(description = "The permissions organized by tenant.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AssignRevokePermissionByTenantDTO {
  public static final String SERIALIZED_NAME_TENANT_CODE = "tenantCode";
  @SerializedName(SERIALIZED_NAME_TENANT_CODE)
  private String tenantCode;

  public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  private List<AssignRevokePermissionByPermissionDTO> permissions = null;

  /**
   * The state of the permission assignment. Valid values are Succeed or Failed.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
 public enum StatusEnum {
    UNKNOWN("Unknown"),
    
    SUCCEED("Succeed"),
    
    FAILED("Failed");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public AssignRevokePermissionByTenantDTO() {
  }

  public AssignRevokePermissionByTenantDTO tenantCode(String tenantCode) {
    
    
    
    
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


  public AssignRevokePermissionByTenantDTO permissions(List<AssignRevokePermissionByPermissionDTO> permissions) {
    
    
    
    
    this.permissions = permissions;
    return this;
  }

  public AssignRevokePermissionByTenantDTO addPermissionsItem(AssignRevokePermissionByPermissionDTO permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * A list of objects representing the assigned or removed permissions.
   * @return permissions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of objects representing the assigned or removed permissions.")

  public List<AssignRevokePermissionByPermissionDTO> getPermissions() {
    return permissions;
  }


  public void setPermissions(List<AssignRevokePermissionByPermissionDTO> permissions) {
    
    
    
    this.permissions = permissions;
  }


  public AssignRevokePermissionByTenantDTO status(StatusEnum status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * The state of the permission assignment. Valid values are Succeed or Failed.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The state of the permission assignment. Valid values are Succeed or Failed.")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    
    
    
    this.status = status;
  }


  public AssignRevokePermissionByTenantDTO message(String message) {
    
    
    
    
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
   * @return the AssignRevokePermissionByTenantDTO instance itself
   */
  public AssignRevokePermissionByTenantDTO putAdditionalProperty(String key, Object value) {
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
    AssignRevokePermissionByTenantDTO assignRevokePermissionByTenantDTO = (AssignRevokePermissionByTenantDTO) o;
    return Objects.equals(this.tenantCode, assignRevokePermissionByTenantDTO.tenantCode) &&
        Objects.equals(this.permissions, assignRevokePermissionByTenantDTO.permissions) &&
        Objects.equals(this.status, assignRevokePermissionByTenantDTO.status) &&
        Objects.equals(this.message, assignRevokePermissionByTenantDTO.message)&&
        Objects.equals(this.additionalProperties, assignRevokePermissionByTenantDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantCode, permissions, status, message, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssignRevokePermissionByTenantDTO {\n");
    sb.append("    tenantCode: ").append(toIndentedString(tenantCode)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
    openapiFields.add("permissions");
    openapiFields.add("status");
    openapiFields.add("message");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AssignRevokePermissionByTenantDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AssignRevokePermissionByTenantDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AssignRevokePermissionByTenantDTO is not found in the empty JSON string", AssignRevokePermissionByTenantDTO.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("tenantCode") != null && !jsonObj.get("tenantCode").isJsonNull()) && !jsonObj.get("tenantCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenantCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenantCode").toString()));
      }
      if (jsonObj.get("permissions") != null && !jsonObj.get("permissions").isJsonNull()) {
        JsonArray jsonArraypermissions = jsonObj.getAsJsonArray("permissions");
        if (jsonArraypermissions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("permissions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `permissions` to be an array in the JSON string but got `%s`", jsonObj.get("permissions").toString()));
          }

          // validate the optional field `permissions` (array)
          for (int i = 0; i < jsonArraypermissions.size(); i++) {
            AssignRevokePermissionByPermissionDTO.validateJsonObject(jsonArraypermissions.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AssignRevokePermissionByTenantDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AssignRevokePermissionByTenantDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AssignRevokePermissionByTenantDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AssignRevokePermissionByTenantDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<AssignRevokePermissionByTenantDTO>() {
           @Override
           public void write(JsonWriter out, AssignRevokePermissionByTenantDTO value) throws IOException {
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
           public AssignRevokePermissionByTenantDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AssignRevokePermissionByTenantDTO instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AssignRevokePermissionByTenantDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AssignRevokePermissionByTenantDTO
  * @throws IOException if the JSON string is invalid with respect to AssignRevokePermissionByTenantDTO
  */
  public static AssignRevokePermissionByTenantDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AssignRevokePermissionByTenantDTO.class);
  }

 /**
  * Convert an instance of AssignRevokePermissionByTenantDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

