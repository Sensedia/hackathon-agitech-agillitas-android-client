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
import com.sensedia.agillitas.api.v1.model.CadastroBenificiario;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TransferenciaCadastroBenificiario
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-26T08:53:13.092-03:00")
public class TransferenciaCadastroBenificiario {
  @SerializedName("beneficiario")
  private CadastroBenificiario beneficiario = null;

  public TransferenciaCadastroBenificiario beneficiario(CadastroBenificiario beneficiario) {
    this.beneficiario = beneficiario;
    return this;
  }

   /**
   * Get beneficiario
   * @return beneficiario
  **/
  @ApiModelProperty(value = "")
  public CadastroBenificiario getBeneficiario() {
    return beneficiario;
  }

  public void setBeneficiario(CadastroBenificiario beneficiario) {
    this.beneficiario = beneficiario;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferenciaCadastroBenificiario transferenciaCadastroBenificiario = (TransferenciaCadastroBenificiario) o;
    return Objects.equals(this.beneficiario, transferenciaCadastroBenificiario.beneficiario);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beneficiario);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferenciaCadastroBenificiario {\n");
    
    sb.append("    beneficiario: ").append(toIndentedString(beneficiario)).append("\n");
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

