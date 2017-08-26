package com.sensedia.agillitas.api.v1;

import com.sensedia.agillitas.api.v1.client.CollectionFormats.*;



import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.sensedia.agillitas.api.v1.model.MsgErro;
import com.sensedia.agillitas.api.v1.model.Transferencia;
import com.sensedia.agillitas.api.v1.model.TransferenciaCadastroBenificiario;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface TransferenciasApi {
  /**
   * Cadastro de beneficiário para Transferencia
   * &lt;p&gt;Permite o cadastro de beneficiário para uma transferencia.&lt;/p&gt;
   * @param clientId Identificador do cliente utilizado na autenticação. (required)
   * @param accessToken Token de acesso utilizado na autenticação. (required)
   * @param beneficiario Objeto de requisição (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("transferencias/cadastros")
  Call<Void> cadastrarBeneficiario(
    @retrofit2.http.Header("client_id") String clientId, @retrofit2.http.Header("access_token") String accessToken, @retrofit2.http.Body TransferenciaCadastroBenificiario beneficiario
  );

  /**
   * Transferência de valores entre contas
   * &lt;p&gt;Permite a transferência de valor entre dois cartões pré cadastrados.&lt;/p&gt;
   * @param clientId Identificador do cliente utilizado na autenticação. (required)
   * @param accessToken Token de acesso utilizado na autenticação. (required)
   * @param transferencia Objeto de requisição (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("transferencias")
  Call<Void> transferir(
    @retrofit2.http.Header("client_id") String clientId, @retrofit2.http.Header("access_token") String accessToken, @retrofit2.http.Body Transferencia transferencia
  );

}
