# CartoesApi

All URIs are relative to *https://api-visa.sensedia.com/sandbox/visa/agillitas/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getExtrato**](CartoesApi.md#getExtrato) | **GET** cartoes/{idCartao}/extrato | Consulta o extrato do cartão
[**getPortador**](CartoesApi.md#getPortador) | **GET** cartoes/{idCartao}/portador | Consuta informações do portador do cartão
[**getSaldo**](CartoesApi.md#getSaldo) | **GET** cartoes/{idCartao}/saldo | Consulta o saldo do cartão
[**atualizarSaldo**](CartoesApi.md#atualizarSaldo) | **PUT** cartoes/{idCartao}/saldo | Credita ou debita valor da conta de um cartão.
[**getStatusCartao**](CartoesApi.md#getStatusCartao) | **GET** cartoes/{idCartao}/status | Consulta o status do cartão
[**atualizarCartaoStatus**](CartoesApi.md#atualizarCartaoStatus) | **PUT** cartoes/{idCartao}/status | Altera status do cartão
[**associarCartao**](CartoesApi.md#associarCartao) | **POST** cartoes | Associa um número de proxy de cartão a um portador.


<a name="getExtrato"></a>
# **getExtrato**
> ExtratoResponse getExtrato(clientId, accessToken, idCartao, dataInicial, dataFinal)

Consulta o extrato do cartão

&lt;p&gt;Permite a consulta dos movimentos por período de um determinado cartão. A janela máxima de observação é de 30 dias, e as datas inicial e final de observação pode ser configuradas, conforme necessidade.&lt;/p&gt;

### Example
```java
// Import classes:
//import com.sensedia.agillitas.api.v1.client.ApiException;
//import com.sensedia.agillitas.api.v1.CartoesApi;


CartoesApi apiInstance = new CartoesApi();
String clientId = "clientId_example"; // String | Identificador do cliente utilizado na autenticação.
String accessToken = "accessToken_example"; // String | Token de acesso utilizado na autenticação.
String idCartao = "idCartao_example"; // String | Número identificador referente ao proxy localizado no verso do cartão.
LocalDate dataInicial = new LocalDate(); // LocalDate | Data inicial para a consulta (YYYY-MM-DD).
LocalDate dataFinal = new LocalDate(); // LocalDate | Data final para a consulta (YYYY-MM-DD)..
try {
    ExtratoResponse result = apiInstance.getExtrato(clientId, accessToken, idCartao, dataInicial, dataFinal);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartoesApi#getExtrato");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Identificador do cliente utilizado na autenticação. |
 **accessToken** | **String**| Token de acesso utilizado na autenticação. |
 **idCartao** | **String**| Número identificador referente ao proxy localizado no verso do cartão. |
 **dataInicial** | **LocalDate**| Data inicial para a consulta (YYYY-MM-DD). |
 **dataFinal** | **LocalDate**| Data final para a consulta (YYYY-MM-DD).. |

### Return type

[**ExtratoResponse**](ExtratoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPortador"></a>
# **getPortador**
> PortadorResponse getPortador(clientId, accessToken, idCartao)

Consuta informações do portador do cartão

&lt;p&gt;Permite a consulta de informações cadastrais de um determinado portador de cartão.&lt;/p&gt;

### Example
```java
// Import classes:
//import com.sensedia.agillitas.api.v1.client.ApiException;
//import com.sensedia.agillitas.api.v1.CartoesApi;


CartoesApi apiInstance = new CartoesApi();
String clientId = "clientId_example"; // String | Identificador do cliente utilizado na autenticação.
String accessToken = "accessToken_example"; // String | Token de acesso utilizado na autenticação.
String idCartao = "idCartao_example"; // String | Número identificador referente ao proxy localizado no verso do cartão.
try {
    PortadorResponse result = apiInstance.getPortador(clientId, accessToken, idCartao);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartoesApi#getPortador");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Identificador do cliente utilizado na autenticação. |
 **accessToken** | **String**| Token de acesso utilizado na autenticação. |
 **idCartao** | **String**| Número identificador referente ao proxy localizado no verso do cartão. |

### Return type

[**PortadorResponse**](PortadorResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSaldo"></a>
# **getSaldo**
> Saldo getSaldo(clientId, accessToken, idCartao)

Consulta o saldo do cartão

&lt;p&gt;Permite a consulta do saldo disponível de um determinado cartão.&lt;/p&gt;

### Example
```java
// Import classes:
//import com.sensedia.agillitas.api.v1.client.ApiException;
//import com.sensedia.agillitas.api.v1.CartoesApi;


CartoesApi apiInstance = new CartoesApi();
String clientId = "clientId_example"; // String | Identificador do cliente utilizado na autenticação.
String accessToken = "accessToken_example"; // String | Token de acesso utilizado na autenticação.
String idCartao = "idCartao_example"; // String | Número identificador referente ao proxy localizado no verso do cartão.
try {
    Saldo result = apiInstance.getSaldo(clientId, accessToken, idCartao);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartoesApi#getSaldo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Identificador do cliente utilizado na autenticação. |
 **accessToken** | **String**| Token de acesso utilizado na autenticação. |
 **idCartao** | **String**| Número identificador referente ao proxy localizado no verso do cartão. |

### Return type

[**Saldo**](Saldo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="atualizarSaldo"></a>
# **atualizarSaldo**
> Void atualizarSaldo(clientId, accessToken, idCartao, saldo)

Credita ou debita valor da conta de um cartão.

&lt;p&gt;Permite creditar ou debitar um valor especifico em um determinado cartão.&lt;/p&gt;&lt;br/&gt;&lt;p class&#x3D;&#39;obs obs-danger&#39;&gt;Este recurso deve ser utilizado somente pelo reseller e quando o credito do cartão for de responsabilidade e propriedade do Reseller.&lt;/p&gt;

### Example
```java
// Import classes:
//import com.sensedia.agillitas.api.v1.client.ApiException;
//import com.sensedia.agillitas.api.v1.CartoesApi;


CartoesApi apiInstance = new CartoesApi();
String clientId = "clientId_example"; // String | Identificador do cliente utilizado na autenticação.
String accessToken = "accessToken_example"; // String | Token de acesso utilizado na autenticação.
String idCartao = "idCartao_example"; // String | Número identificador referente ao proxy localizado no verso do cartão.
SetSaldo saldo = new SetSaldo(); // SetSaldo | Objeto de requisição
try {
    Void result = apiInstance.atualizarSaldo(clientId, accessToken, idCartao, saldo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartoesApi#atualizarSaldo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Identificador do cliente utilizado na autenticação. |
 **accessToken** | **String**| Token de acesso utilizado na autenticação. |
 **idCartao** | **String**| Número identificador referente ao proxy localizado no verso do cartão. |
 **saldo** | [**SetSaldo**](SetSaldo.md)| Objeto de requisição |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStatusCartao"></a>
# **getStatusCartao**
> StatusCartaoResponse getStatusCartao(clientId, accessToken, idCartao)

Consulta o status do cartão

&lt;p&gt;Permite a consulta do status de um determinado cartão. O status do cartão nos permite saber se o cartão esta ativo, bloqueado, desbloqueado ou cancelado.&lt;/p&gt;

### Example
```java
// Import classes:
//import com.sensedia.agillitas.api.v1.client.ApiException;
//import com.sensedia.agillitas.api.v1.CartoesApi;


CartoesApi apiInstance = new CartoesApi();
String clientId = "clientId_example"; // String | Identificador do cliente utilizado na autenticação.
String accessToken = "accessToken_example"; // String | Token de acesso utilizado na autenticação.
String idCartao = "idCartao_example"; // String | Número identificador referente ao proxy localizado no verso do cartão.
try {
    StatusCartaoResponse result = apiInstance.getStatusCartao(clientId, accessToken, idCartao);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartoesApi#getStatusCartao");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Identificador do cliente utilizado na autenticação. |
 **accessToken** | **String**| Token de acesso utilizado na autenticação. |
 **idCartao** | **String**| Número identificador referente ao proxy localizado no verso do cartão. |

### Return type

[**StatusCartaoResponse**](StatusCartaoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="atualizarCartaoStatus"></a>
# **atualizarCartaoStatus**
> Void atualizarCartaoStatus(clientId, accessToken, idCartao, status)

Altera status do cartão

&lt;p&gt;Permite o bloqueio e desbloqueio de um determinado cartão.&lt;/p&gt;

### Example
```java
// Import classes:
//import com.sensedia.agillitas.api.v1.client.ApiException;
//import com.sensedia.agillitas.api.v1.CartoesApi;


CartoesApi apiInstance = new CartoesApi();
String clientId = "clientId_example"; // String | Identificador do cliente utilizado na autenticação.
String accessToken = "accessToken_example"; // String | Token de acesso utilizado na autenticação.
String idCartao = "idCartao_example"; // String | Número identificador referente ao proxy localizado no verso do cartão.
SetCardStatus status = new SetCardStatus(); // SetCardStatus | Objeto de requisição
try {
    Void result = apiInstance.atualizarCartaoStatus(clientId, accessToken, idCartao, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartoesApi#atualizarCartaoStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Identificador do cliente utilizado na autenticação. |
 **accessToken** | **String**| Token de acesso utilizado na autenticação. |
 **idCartao** | **String**| Número identificador referente ao proxy localizado no verso do cartão. |
 **status** | [**SetCardStatus**](SetCardStatus.md)| Objeto de requisição |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="associarCartao"></a>
# **associarCartao**
> Void associarCartao(clientId, accessToken, cartao)

Associa um número de proxy de cartão a um portador.

&lt;p&gt;Operação responsável por associar um número proxy de cartão a um portador.&lt;/p&gt;&lt;br/&gt; &lt;p&gt;Esse processo de liberação é assíncrono.&lt;/p&gt; 

### Example
```java
// Import classes:
//import com.sensedia.agillitas.api.v1.client.ApiException;
//import com.sensedia.agillitas.api.v1.CartoesApi;


CartoesApi apiInstance = new CartoesApi();
String clientId = "clientId_example"; // String | Identificador do cliente utilizado na autenticação.
String accessToken = "accessToken_example"; // String | Token de acesso utilizado na autenticação.
SetNovoCartao cartao = new SetNovoCartao(); // SetNovoCartao | Objeto de requisição
try {
    Void result = apiInstance.associarCartao(clientId, accessToken, cartao);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CartoesApi#associarCartao");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Identificador do cliente utilizado na autenticação. |
 **accessToken** | **String**| Token de acesso utilizado na autenticação. |
 **cartao** | [**SetNovoCartao**](SetNovoCartao.md)| Objeto de requisição |

### Return type

[**Void**](.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

