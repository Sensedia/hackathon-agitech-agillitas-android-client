# TransferenciasApi

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/agillitas/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cadastrarBeneficiario**](TransferenciasApi.md#cadastrarBeneficiario) | **POST** transferencias/cadastros | Cadastro de beneficiário para Transferencia
[**transferir**](TransferenciasApi.md#transferir) | **POST** transferencias | Transferência de valores entre contas


<a name="cadastrarBeneficiario"></a>
# **cadastrarBeneficiario**
> Void cadastrarBeneficiario(clientId, accessToken, beneficiario)

Cadastro de beneficiário para Transferencia

&lt;p&gt;Permite o cadastro de beneficiário para uma transferencia.&lt;/p&gt;

### Example
```java
// Import classes:
//import com.sensedia.agillitas.api.v1.client.ApiException;
//import com.sensedia.agillitas.api.v1.TransferenciasApi;


TransferenciasApi apiInstance = new TransferenciasApi();
String clientId = "clientId_example"; // String | Identificador do cliente utilizado na autenticação.
String accessToken = "accessToken_example"; // String | Token de acesso utilizado na autenticação.
TransferenciaCadastroBenificiario beneficiario = new TransferenciaCadastroBenificiario(); // TransferenciaCadastroBenificiario | Objeto de requisição
try {
    Void result = apiInstance.cadastrarBeneficiario(clientId, accessToken, beneficiario);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransferenciasApi#cadastrarBeneficiario");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Identificador do cliente utilizado na autenticação. |
 **accessToken** | **String**| Token de acesso utilizado na autenticação. |
 **beneficiario** | [**TransferenciaCadastroBenificiario**](TransferenciaCadastroBenificiario.md)| Objeto de requisição |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="transferir"></a>
# **transferir**
> Void transferir(clientId, accessToken, transferencia)

Transferência de valores entre contas

&lt;p&gt;Permite a transferência de valor entre dois cartões pré cadastrados.&lt;/p&gt;

### Example
```java
// Import classes:
//import com.sensedia.agillitas.api.v1.client.ApiException;
//import com.sensedia.agillitas.api.v1.TransferenciasApi;


TransferenciasApi apiInstance = new TransferenciasApi();
String clientId = "clientId_example"; // String | Identificador do cliente utilizado na autenticação.
String accessToken = "accessToken_example"; // String | Token de acesso utilizado na autenticação.
Transferencia transferencia = new Transferencia(); // Transferencia | Objeto de requisição
try {
    Void result = apiInstance.transferir(clientId, accessToken, transferencia);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransferenciasApi#transferir");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Identificador do cliente utilizado na autenticação. |
 **accessToken** | **String**| Token de acesso utilizado na autenticação. |
 **transferencia** | [**Transferencia**](Transferencia.md)| Objeto de requisição |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

