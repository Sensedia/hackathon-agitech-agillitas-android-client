# PagamentosApi

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/agillitas/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**realizarPagamento**](PagamentosApi.md#realizarPagamento) | **POST** pagamentos | Pagamento de boletos.


<a name="realizarPagamento"></a>
# **realizarPagamento**
> Void realizarPagamento(clientId, accessToken, boleto)

Pagamento de boletos.

&lt;p&gt;Permite o pagamento de boletos.&lt;/p&gt;

### Example
```java
// Import classes:
//import com.sensedia.agillitas.api.v1.client.ApiException;
//import com.sensedia.agillitas.api.v1.PagamentosApi;


PagamentosApi apiInstance = new PagamentosApi();
String clientId = "clientId_example"; // String | Identificador do cliente utilizado na autenticação.
String accessToken = "accessToken_example"; // String | Token de acesso utilizado na autenticação.
Pagamento boleto = new Pagamento(); // Pagamento | Objeto de requisição
try {
    Void result = apiInstance.realizarPagamento(clientId, accessToken, boleto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PagamentosApi#realizarPagamento");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Identificador do cliente utilizado na autenticação. |
 **accessToken** | **String**| Token de acesso utilizado na autenticação. |
 **boleto** | [**Pagamento**](Pagamento.md)| Objeto de requisição |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

