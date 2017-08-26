/*
 * API Agillitas Cartões Pré-pagos
 * API para manipular recursos relacionadas aos  cartões pré-pagos Agillitas.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.sensedia.agillitas.api.v1.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.sensedia.agillitas.api.v1.model.DetalhamentoExtrato;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ExtratoResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-26T08:53:13.092-03:00")
public class ExtratoResponse {
  @SerializedName("extrato")
  private List<DetalhamentoExtrato> extrato = null;

  public ExtratoResponse extrato(List<DetalhamentoExtrato> extrato) {
    this.extrato = extrato;
    return this;
  }

  public ExtratoResponse addExtratoItem(DetalhamentoExtrato extratoItem) {
    if (this.extrato == null) {
      this.extrato = new ArrayList<DetalhamentoExtrato>();
    }
    this.extrato.add(extratoItem);
    return this;
  }

   /**
   * Get extrato
   * @return extrato
  **/
  @ApiModelProperty(value = "")
  public List<DetalhamentoExtrato> getExtrato() {
    return extrato;
  }

  public void setExtrato(List<DetalhamentoExtrato> extrato) {
    this.extrato = extrato;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtratoResponse extratoResponse = (ExtratoResponse) o;
    return Objects.equals(this.extrato, extratoResponse.extrato);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extrato);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtratoResponse {\n");
    
    sb.append("    extrato: ").append(toIndentedString(extrato)).append("\n");
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

