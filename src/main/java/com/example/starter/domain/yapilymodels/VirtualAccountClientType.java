/*
 * Yapily API
 * The Yapily API enables connections between your application and users' banks. For more information check out our [documentation](https://docs.yapily.com/).<br><br>In particular, make sure to view our [Getting Started](https://docs.yapily.com/pages/home/getting-started/) steps if this is your first time here.<br><br>While testing the API, our list of [sandbox credentials](https://docs.yapily.com/pages/key-concepts/sandbox-credentials/) maybe useful.
 *
 * The version of the OpenAPI document: 2.14.0
 * Contact: support@yapily.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.example.starter.domain.yapilymodels;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * Gets or Sets VirtualAccountClientType
 */
@JsonAdapter(VirtualAccountClientType.Adapter.class)
public enum VirtualAccountClientType {
  
  INDIVIDUAL("INDIVIDUAL"),
  
  BUSINESS("BUSINESS");

  private String value;

  VirtualAccountClientType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static VirtualAccountClientType fromValue(String value) {
    for (VirtualAccountClientType b : VirtualAccountClientType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<VirtualAccountClientType> {
    @Override
    public void write(final JsonWriter jsonWriter, final VirtualAccountClientType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public VirtualAccountClientType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return VirtualAccountClientType.fromValue(value);
    }
  }
}

