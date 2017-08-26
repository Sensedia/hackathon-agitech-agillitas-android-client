package com.sensedia.agillitas.api.v1;

import com.sensedia.agillitas.api.v1.client.CollectionFormats.*;



import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.sensedia.agillitas.api.v1.model.ExtratoResponse;
import org.joda.time.LocalDate;
import com.sensedia.agillitas.api.v1.model.MsgErro;
import com.sensedia.agillitas.api.v1.model.PortadorResponse;
import com.sensedia.agillitas.api.v1.model.Saldo;
import com.sensedia.agillitas.api.v1.model.SetCardStatus;
import com.sensedia.agillitas.api.v1.model.SetNovoCartao;
import com.sensedia.agillitas.api.v1.model.SetSaldo;
import com.sensedia.agillitas.api.v1.model.StatusCartaoResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface CartoesApi {
  /**
   * Consulta o extrato do cartão
   * &lt;p&gt;Permite a consulta dos movimentos por período de um determinado cartão. A janela máxima de observação é de 30 dias, e as datas inicial e final de observação pode ser configuradas, conforme necessidade.&lt;/p&gt;
   * @param clientId Identificador do cliente utilizado na autenticação. (required)
   * @param accessToken Token de acesso utilizado na autenticação. (required)
   * @param idCartao Número identificador referente ao proxy localizado no verso do cartão. (required)
   * @param dataInicial Data inicial para a consulta (YYYY-MM-DD). (required)
   * @param dataFinal Data final para a consulta (YYYY-MM-DD).. (required)
   * @return Call&lt;ExtratoResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("cartoes/{idCartao}/extrato")
  Call<ExtratoResponse> getExtrato(
    @retrofit2.http.Header("client_id") String clientId, @retrofit2.http.Header("access_token") String accessToken, @retrofit2.http.Path("idCartao") String idCartao, @retrofit2.http.Query("dataInicial") LocalDate dataInicial, @retrofit2.http.Query("dataFinal") LocalDate dataFinal
  );

  /**
   * Consuta informações do portador do cartão
   * &lt;p&gt;Permite a consulta de informações cadastrais de um determinado portador de cartão.&lt;/p&gt;
   * @param clientId Identificador do cliente utilizado na autenticação. (required)
   * @param accessToken Token de acesso utilizado na autenticação. (required)
   * @param idCartao Número identificador referente ao proxy localizado no verso do cartão. (required)
   * @return Call&lt;PortadorResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("cartoes/{idCartao}/portador")
  Call<PortadorResponse> getPortador(
    @retrofit2.http.Header("client_id") String clientId, @retrofit2.http.Header("access_token") String accessToken, @retrofit2.http.Path("idCartao") String idCartao
  );

  /**
   * Consulta o saldo do cartão
   * &lt;p&gt;Permite a consulta do saldo disponível de um determinado cartão.&lt;/p&gt;
   * @param clientId Identificador do cliente utilizado na autenticação. (required)
   * @param accessToken Token de acesso utilizado na autenticação. (required)
   * @param idCartao Número identificador referente ao proxy localizado no verso do cartão. (required)
   * @return Call&lt;Saldo&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("cartoes/{idCartao}/saldo")
  Call<Saldo> getSaldo(
    @retrofit2.http.Header("client_id") String clientId, @retrofit2.http.Header("access_token") String accessToken, @retrofit2.http.Path("idCartao") String idCartao
  );

  /**
   * Credita ou debita valor da conta de um cartão.
   * &lt;p&gt;Permite creditar ou debitar um valor especifico em um determinado cartão.&lt;/p&gt;&lt;br/&gt;&lt;p class&#x3D;&#39;obs obs-danger&#39;&gt;Este recurso deve ser utilizado somente pelo reseller e quando o credito do cartão for de responsabilidade e propriedade do Reseller.&lt;/p&gt;
   * @param clientId Identificador do cliente utilizado na autenticação. (required)
   * @param accessToken Token de acesso utilizado na autenticação. (required)
   * @param idCartao Número identificador referente ao proxy localizado no verso do cartão. (required)
   * @param saldo Objeto de requisição (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("cartoes/{idCartao}/saldo")
  Call<Void> atualizarSaldo(
    @retrofit2.http.Header("client_id") String clientId, @retrofit2.http.Header("access_token") String accessToken, @retrofit2.http.Path("idCartao") String idCartao, @retrofit2.http.Body SetSaldo saldo
  );

  /**
   * Consulta o status do cartão
   * &lt;p&gt;Permite a consulta do status de um determinado cartão. O status do cartão nos permite saber se o cartão esta ativo, bloqueado, desbloqueado ou cancelado.&lt;/p&gt;
   * @param clientId Identificador do cliente utilizado na autenticação. (required)
   * @param accessToken Token de acesso utilizado na autenticação. (required)
   * @param idCartao Número identificador referente ao proxy localizado no verso do cartão. (required)
   * @return Call&lt;StatusCartaoResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("cartoes/{idCartao}/status")
  Call<StatusCartaoResponse> getStatusCartao(
    @retrofit2.http.Header("client_id") String clientId, @retrofit2.http.Header("access_token") String accessToken, @retrofit2.http.Path("idCartao") String idCartao
  );

  /**
   * Altera status do cartão
   * &lt;p&gt;Permite o bloqueio e desbloqueio de um determinado cartão.&lt;/p&gt;
   * @param clientId Identificador do cliente utilizado na autenticação. (required)
   * @param accessToken Token de acesso utilizado na autenticação. (required)
   * @param idCartao Número identificador referente ao proxy localizado no verso do cartão. (required)
   * @param status Objeto de requisição (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("cartoes/{idCartao}/status")
  Call<Void> atualizarCartaoStatus(
    @retrofit2.http.Header("client_id") String clientId, @retrofit2.http.Header("access_token") String accessToken, @retrofit2.http.Path("idCartao") String idCartao, @retrofit2.http.Body SetCardStatus status
  );

  /**
   * Associa um número de proxy de cartão a um portador.
   * &lt;p&gt;Operação responsável por associar um número proxy de cartão a um portador.&lt;/p&gt;&lt;br/&gt; &lt;p&gt;Esse processo de liberação é assíncrono.&lt;/p&gt; 
   * @param clientId Identificador do cliente utilizado na autenticação. (required)
   * @param accessToken Token de acesso utilizado na autenticação. (required)
   * @param cartao Objeto de requisição (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("cartoes")
  Call<Void> associarCartao(
    @retrofit2.http.Header("client_id") String clientId, @retrofit2.http.Header("access_token") String accessToken, @retrofit2.http.Body SetNovoCartao cartao
  );

}
