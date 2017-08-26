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
 * SetTransferencia
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-26T08:53:13.092-03:00")
public class SetTransferencia {
  @SerializedName("idCartao")
  private String idCartao = null;

  @SerializedName("idCartaoDestino")
  private String idCartaoDestino = null;

  @SerializedName("valor")
  private Double valor = null;

  @SerializedName("senha")
  private String senha = null;

  public SetTransferencia idCartao(String idCartao) {
    this.idCartao = idCartao;
    return this;
  }

   /**
   * número identificador referente ao proxy do cartão origem de transferência.
   * @return idCartao
  **/
  @ApiModelProperty(example = "123123123", value = "número identificador referente ao proxy do cartão origem de transferência.")
  public String getIdCartao() {
    return idCartao;
  }

  public void setIdCartao(String idCartao) {
    this.idCartao = idCartao;
  }

  public SetTransferencia idCartaoDestino(String idCartaoDestino) {
    this.idCartaoDestino = idCartaoDestino;
    return this;
  }

   /**
   * número identificador referente ao proxy do cartão destino de transferência.
   * @return idCartaoDestino
  **/
  @ApiModelProperty(example = "2331235523", value = "número identificador referente ao proxy do cartão destino de transferência.")
  public String getIdCartaoDestino() {
    return idCartaoDestino;
  }

  public void setIdCartaoDestino(String idCartaoDestino) {
    this.idCartaoDestino = idCartaoDestino;
  }

  public SetTransferencia valor(Double valor) {
    this.valor = valor;
    return this;
  }

   /**
   * Valor monetário  a ser transferido.
   * @return valor
  **/
  @ApiModelProperty(example = "10.4", value = "Valor monetário  a ser transferido.")
  public Double getValor() {
    return valor;
  }

  public void setValor(Double valor) {
    this.valor = valor;
  }

  public SetTransferencia senha(String senha) {
    this.senha = senha;
    return this;
  }

   /**
   * Senha do cartão.
   * @return senha
  **/
  @ApiModelProperty(example = "12344", value = "Senha do cartão.")
  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetTransferencia setTransferencia = (SetTransferencia) o;
    return Objects.equals(this.idCartao, setTransferencia.idCartao) &&
        Objects.equals(this.idCartaoDestino, setTransferencia.idCartaoDestino) &&
        Objects.equals(this.valor, setTransferencia.valor) &&
        Objects.equals(this.senha, setTransferencia.senha);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idCartao, idCartaoDestino, valor, senha);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetTransferencia {\n");
    
    sb.append("    idCartao: ").append(toIndentedString(idCartao)).append("\n");
    sb.append("    idCartaoDestino: ").append(toIndentedString(idCartaoDestino)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    senha: ").append(toIndentedString(senha)).append("\n");
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

