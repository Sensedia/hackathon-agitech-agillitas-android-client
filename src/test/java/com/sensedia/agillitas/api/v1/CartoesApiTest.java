package com.sensedia.agillitas.api.v1;

import com.sensedia.agillitas.api.v1.client.ApiClient;
import com.sensedia.agillitas.api.v1.model.ExtratoResponse;
import org.joda.time.LocalDate;
import com.sensedia.agillitas.api.v1.model.MsgErro;
import com.sensedia.agillitas.api.v1.model.PortadorResponse;
import com.sensedia.agillitas.api.v1.model.Saldo;
import com.sensedia.agillitas.api.v1.model.SetCardStatus;
import com.sensedia.agillitas.api.v1.model.SetNovoCartao;
import com.sensedia.agillitas.api.v1.model.SetSaldo;
import com.sensedia.agillitas.api.v1.model.StatusCartaoResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CartoesApi
 */
public class CartoesApiTest {

    private CartoesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(CartoesApi.class);
    }

    
    /**
     * Consulta o extrato do cartão
     *
     * &lt;p&gt;Permite a consulta dos movimentos por período de um determinado cartão. A janela máxima de observação é de 30 dias, e as datas inicial e final de observação pode ser configuradas, conforme necessidade.&lt;/p&gt;
     */
    @Test
    public void getExtratoTest() {
        String clientId = null;
        String accessToken = null;
        String idCartao = null;
        LocalDate dataInicial = null;
        LocalDate dataFinal = null;
        // ExtratoResponse response = api.getExtrato(clientId, accessToken, idCartao, dataInicial, dataFinal);

        // TODO: test validations
    }
    
    /**
     * Consuta informações do portador do cartão
     *
     * &lt;p&gt;Permite a consulta de informações cadastrais de um determinado portador de cartão.&lt;/p&gt;
     */
    @Test
    public void getPortadorTest() {
        String clientId = null;
        String accessToken = null;
        String idCartao = null;
        // PortadorResponse response = api.getPortador(clientId, accessToken, idCartao);

        // TODO: test validations
    }
    
    /**
     * Consulta o saldo do cartão
     *
     * &lt;p&gt;Permite a consulta do saldo disponível de um determinado cartão.&lt;/p&gt;
     */
    @Test
    public void getSaldoTest() {
        String clientId = null;
        String accessToken = null;
        String idCartao = null;
        // Saldo response = api.getSaldo(clientId, accessToken, idCartao);

        // TODO: test validations
    }
    
    /**
     * Credita ou debita valor da conta de um cartão.
     *
     * &lt;p&gt;Permite creditar ou debitar um valor especifico em um determinado cartão.&lt;/p&gt;&lt;br/&gt;&lt;p class&#x3D;&#39;obs obs-danger&#39;&gt;Este recurso deve ser utilizado somente pelo reseller e quando o credito do cartão for de responsabilidade e propriedade do Reseller.&lt;/p&gt;
     */
    @Test
    public void atualizarSaldoTest() {
        String clientId = null;
        String accessToken = null;
        String idCartao = null;
        SetSaldo saldo = null;
        // Void response = api.atualizarSaldo(clientId, accessToken, idCartao, saldo);

        // TODO: test validations
    }
    
    /**
     * Consulta o status do cartão
     *
     * &lt;p&gt;Permite a consulta do status de um determinado cartão. O status do cartão nos permite saber se o cartão esta ativo, bloqueado, desbloqueado ou cancelado.&lt;/p&gt;
     */
    @Test
    public void getStatusCartaoTest() {
        String clientId = null;
        String accessToken = null;
        String idCartao = null;
        // StatusCartaoResponse response = api.getStatusCartao(clientId, accessToken, idCartao);

        // TODO: test validations
    }
    
    /**
     * Altera status do cartão
     *
     * &lt;p&gt;Permite o bloqueio e desbloqueio de um determinado cartão.&lt;/p&gt;
     */
    @Test
    public void atualizarCartaoStatusTest() {
        String clientId = null;
        String accessToken = null;
        String idCartao = null;
        SetCardStatus status = null;
        // Void response = api.atualizarCartaoStatus(clientId, accessToken, idCartao, status);

        // TODO: test validations
    }
    
    /**
     * Associa um número de proxy de cartão a um portador.
     *
     * &lt;p&gt;Operação responsável por associar um número proxy de cartão a um portador.&lt;/p&gt;&lt;br/&gt; &lt;p&gt;Esse processo de liberação é assíncrono.&lt;/p&gt; 
     */
    @Test
    public void associarCartaoTest() {
        String clientId = null;
        String accessToken = null;
        SetNovoCartao cartao = null;
        // Void response = api.associarCartao(clientId, accessToken, cartao);

        // TODO: test validations
    }
    
}
