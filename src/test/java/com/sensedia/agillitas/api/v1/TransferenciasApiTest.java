package com.sensedia.agillitas.api.v1;

import com.sensedia.agillitas.api.v1.client.ApiClient;
import com.sensedia.agillitas.api.v1.model.MsgErro;
import com.sensedia.agillitas.api.v1.model.Transferencia;
import com.sensedia.agillitas.api.v1.model.TransferenciaCadastroBenificiario;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TransferenciasApi
 */
public class TransferenciasApiTest {

    private TransferenciasApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(TransferenciasApi.class);
    }

    
    /**
     * Cadastro de beneficiário para Transferencia
     *
     * &lt;p&gt;Permite o cadastro de beneficiário para uma transferencia.&lt;/p&gt;
     */
    @Test
    public void cadastrarBeneficiarioTest() {
        String clientId = null;
        String accessToken = null;
        TransferenciaCadastroBenificiario beneficiario = null;
        // Void response = api.cadastrarBeneficiario(clientId, accessToken, beneficiario);

        // TODO: test validations
    }
    
    /**
     * Transferência de valores entre contas
     *
     * &lt;p&gt;Permite a transferência de valor entre dois cartões pré cadastrados.&lt;/p&gt;
     */
    @Test
    public void transferirTest() {
        String clientId = null;
        String accessToken = null;
        Transferencia transferencia = null;
        // Void response = api.transferir(clientId, accessToken, transferencia);

        // TODO: test validations
    }
    
}
