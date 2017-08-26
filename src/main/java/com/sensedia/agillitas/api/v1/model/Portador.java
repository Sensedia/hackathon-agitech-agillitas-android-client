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
import com.sensedia.agillitas.api.v1.model.EnderecoPortador;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Portador
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-26T08:53:13.092-03:00")
public class Portador {
  @SerializedName("nome")
  private String nome = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("celular")
  private String celular = null;

  @SerializedName("endereco")
  private EnderecoPortador endereco = null;

  public Portador nome(String nome) {
    this.nome = nome;
    return this;
  }

   /**
   * Nome do portador do cartão.
   * @return nome
  **/
  @ApiModelProperty(example = "João da Silva", value = "Nome do portador do cartão.")
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Portador email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Endereço  de e-mail do portador do cartão.
   * @return email
  **/
  @ApiModelProperty(example = "joao.siva@mail.com", value = "Endereço  de e-mail do portador do cartão.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Portador celular(String celular) {
    this.celular = celular;
    return this;
  }

   /**
   * Numero do telefone celular do portador do cartão.
   * @return celular
  **/
  @ApiModelProperty(example = "011998767654", value = "Numero do telefone celular do portador do cartão.")
  public String getCelular() {
    return celular;
  }

  public void setCelular(String celular) {
    this.celular = celular;
  }

  public Portador endereco(EnderecoPortador endereco) {
    this.endereco = endereco;
    return this;
  }

   /**
   * Get endereco
   * @return endereco
  **/
  @ApiModelProperty(value = "")
  public EnderecoPortador getEndereco() {
    return endereco;
  }

  public void setEndereco(EnderecoPortador endereco) {
    this.endereco = endereco;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Portador portador = (Portador) o;
    return Objects.equals(this.nome, portador.nome) &&
        Objects.equals(this.email, portador.email) &&
        Objects.equals(this.celular, portador.celular) &&
        Objects.equals(this.endereco, portador.endereco);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, email, celular, endereco);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Portador {\n");
    
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    celular: ").append(toIndentedString(celular)).append("\n");
    sb.append("    endereco: ").append(toIndentedString(endereco)).append("\n");
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
