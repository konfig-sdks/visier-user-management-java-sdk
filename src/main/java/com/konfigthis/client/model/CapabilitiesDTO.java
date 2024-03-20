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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * CapabilitiesDTO
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CapabilitiesDTO {
  public static final String SERIALIZED_NAME_CAPABILITY = "capability";
  @SerializedName(SERIALIZED_NAME_CAPABILITY)
  private String capability;

  public static final String SERIALIZED_NAME_ACCESS_LEVEL = "accessLevel";
  @SerializedName(SERIALIZED_NAME_ACCESS_LEVEL)
  private String accessLevel;

  public static final String SERIALIZED_NAME_VIEW_LEVEL = "viewLevel";
  @SerializedName(SERIALIZED_NAME_VIEW_LEVEL)
  private String viewLevel;

  public CapabilitiesDTO() {
  }

  public CapabilitiesDTO capability(String capability) {
    
    
    
    
    this.capability = capability;
    return this;
  }

   /**
   * The name of the capability.
   * @return capability
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the capability.")

  public String getCapability() {
    return capability;
  }


  public void setCapability(String capability) {
    
    
    
    this.capability = capability;
  }


  public CapabilitiesDTO accessLevel(String accessLevel) {
    
    
    
    
    this.accessLevel = accessLevel;
    return this;
  }

   /**
   * The access level of the profile for the given capability.
   * @return accessLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The access level of the profile for the given capability.")

  public String getAccessLevel() {
    return accessLevel;
  }


  public void setAccessLevel(String accessLevel) {
    
    
    
    this.accessLevel = accessLevel;
  }


  public CapabilitiesDTO viewLevel(String viewLevel) {
    
    
    
    
    this.viewLevel = viewLevel;
    return this;
  }

   /**
   * The view level of the profile for the given capability.
   * @return viewLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The view level of the profile for the given capability.")

  public String getViewLevel() {
    return viewLevel;
  }


  public void setViewLevel(String viewLevel) {
    
    
    
    this.viewLevel = viewLevel;
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
   * @return the CapabilitiesDTO instance itself
   */
  public CapabilitiesDTO putAdditionalProperty(String key, Object value) {
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
    CapabilitiesDTO capabilitiesDTO = (CapabilitiesDTO) o;
    return Objects.equals(this.capability, capabilitiesDTO.capability) &&
        Objects.equals(this.accessLevel, capabilitiesDTO.accessLevel) &&
        Objects.equals(this.viewLevel, capabilitiesDTO.viewLevel)&&
        Objects.equals(this.additionalProperties, capabilitiesDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capability, accessLevel, viewLevel, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapabilitiesDTO {\n");
    sb.append("    capability: ").append(toIndentedString(capability)).append("\n");
    sb.append("    accessLevel: ").append(toIndentedString(accessLevel)).append("\n");
    sb.append("    viewLevel: ").append(toIndentedString(viewLevel)).append("\n");
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
    openapiFields.add("capability");
    openapiFields.add("accessLevel");
    openapiFields.add("viewLevel");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CapabilitiesDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CapabilitiesDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CapabilitiesDTO is not found in the empty JSON string", CapabilitiesDTO.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("capability") != null && !jsonObj.get("capability").isJsonNull()) && !jsonObj.get("capability").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `capability` to be a primitive type in the JSON string but got `%s`", jsonObj.get("capability").toString()));
      }
      if ((jsonObj.get("accessLevel") != null && !jsonObj.get("accessLevel").isJsonNull()) && !jsonObj.get("accessLevel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accessLevel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accessLevel").toString()));
      }
      if ((jsonObj.get("viewLevel") != null && !jsonObj.get("viewLevel").isJsonNull()) && !jsonObj.get("viewLevel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `viewLevel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("viewLevel").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CapabilitiesDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CapabilitiesDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CapabilitiesDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CapabilitiesDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<CapabilitiesDTO>() {
           @Override
           public void write(JsonWriter out, CapabilitiesDTO value) throws IOException {
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
           public CapabilitiesDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CapabilitiesDTO instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CapabilitiesDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CapabilitiesDTO
  * @throws IOException if the JSON string is invalid with respect to CapabilitiesDTO
  */
  public static CapabilitiesDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CapabilitiesDTO.class);
  }

 /**
  * Convert an instance of CapabilitiesDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

