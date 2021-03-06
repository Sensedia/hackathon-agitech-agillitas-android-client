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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * EnderecoPortador
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-26T08:53:13.092-03:00")
public class EnderecoPortador {
  @SerializedName("logradouro")
  private String logradouro = null;

  @SerializedName("cidade")
  private String cidade = null;

  @SerializedName("estado")
  private String estado = null;

  @SerializedName("codigoPostal")
  private String codigoPostal = null;

  public EnderecoPortador logradouro(String logradouro) {
    this.logradouro = logradouro;
    return this;
  }

   /**
   * Nome Endereço  do portador do cartão.
   * @return logradouro
  **/
  @ApiModelProperty(example = "Av. das Nações Unidas", value = "Nome Endereço  do portador do cartão.")
  public String getLogradouro() {
    return logradouro;
  }

  public void setLogradouro(String logradouro) {
    this.logradouro = logradouro;
  }

  public EnderecoPortador cidade(String cidade) {
    this.cidade = cidade;
    return this;
  }

   /**
   * Nome cidade do portador do cartão.
   * @return cidade
  **/
  @ApiModelProperty(example = "Pinheiros", value = "Nome cidade do portador do cartão.")
  public String getCidade() {
    return cidade;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  public EnderecoPortador estado(String estado) {
    this.estado = estado;
    return this;
  }

   /**
   * Sigla do estado do portador do cartão.
   * @return estado
  **/
  @ApiModelProperty(example = "SP", value = "Sigla do estado do portador do cartão.")
  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public EnderecoPortador codigoPostal(String codigoPostal) {
    this.codigoPostal = codigoPostal;
    return this;
  }

   /**
   * Código de endereçamento postal do portador do cartão.
   * @return codigoPostal
  **/
  @ApiModelProperty(example = "05425070", value = "Código de endereçamento postal do portador do cartão.")
  public String getCodigoPostal() {
    return codigoPostal;
  }

  public void setCodigoPostal(String codigoPostal) {
    this.codigoPostal = codigoPostal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnderecoPortador enderecoPortador = (EnderecoPortador) o;
    return Objects.equals(this.logradouro, enderecoPortador.logradouro) &&
        Objects.equals(this.cidade, enderecoPortador.cidade) &&
        Objects.equals(this.estado, enderecoPortador.estado) &&
        Objects.equals(this.codigoPostal, enderecoPortador.codigoPostal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logradouro, cidade, estado, codigoPostal);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnderecoPortador {\n");
    
    sb.append("    logradouro: ").append(toIndentedString(logradouro)).append("\n");
    sb.append("    cidade: ").append(toIndentedString(cidade)).append("\n");
    sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
    sb.append("    codigoPostal: ").append(toIndentedString(codigoPostal)).append("\n");
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

