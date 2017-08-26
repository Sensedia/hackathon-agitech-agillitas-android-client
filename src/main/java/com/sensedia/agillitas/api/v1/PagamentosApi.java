package com.sensedia.agillitas.api.v1;

import com.sensedia.agillitas.api.v1.client.CollectionFormats.*;



import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.sensedia.agillitas.api.v1.model.MsgErro;
import com.sensedia.agillitas.api.v1.model.Pagamento;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface PagamentosApi {
  /**
   * Pagamento de boletos.
   * &lt;p&gt;Permite o pagamento de boletos.&lt;/p&gt;
   * @param clientId Identificador do cliente utilizado na autenticação. (required)
   * @param accessToken Token de acesso utilizado na autenticação. (required)
   * @param boleto Objeto de requisição (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("pagamentos")
  Call<Void> realizarPagamento(
    @retrofit2.http.Header("client_id") String clientId, @retrofit2.http.Header("access_token") String accessToken, @retrofit2.http.Body Pagamento boleto
  );

}
