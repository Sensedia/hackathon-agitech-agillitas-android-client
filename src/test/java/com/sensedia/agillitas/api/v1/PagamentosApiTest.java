package com.sensedia.agillitas.api.v1;

import com.sensedia.agillitas.api.v1.client.ApiClient;
import com.sensedia.agillitas.api.v1.model.MsgErro;
import com.sensedia.agillitas.api.v1.model.Pagamento;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PagamentosApi
 */
public class PagamentosApiTest {

    private PagamentosApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(PagamentosApi.class);
    }

    
    /**
     * Pagamento de boletos.
     *
     * &lt;p&gt;Permite o pagamento de boletos.&lt;/p&gt;
     */
    @Test
    public void realizarPagamentoTest() {
        String clientId = null;
        String accessToken = null;
        Pagamento boleto = null;
        // Void response = api.realizarPagamento(clientId, accessToken, boleto);

        // TODO: test validations
    }
    
}
