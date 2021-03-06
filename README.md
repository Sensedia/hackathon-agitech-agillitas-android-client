# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation & Usage

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

After the client library is installed/deployed, you can use it in your Maven project by adding the following to your *pom.xml*:

```xml
<dependency>
    <groupId>com.sensedia</groupId>
    <artifactId>agillitas-android-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>

```

## Author

## Exemplo

###### Dependências

```
    compile 'com.google.code.gson:gson:2.8.0'
    compile "com.squareup.retrofit2:retrofit:2.3.0"
    compile("com.squareup.retrofit2:converter-gson:2.3.0") {
        exclude module: 'com.google.code.gson'
    }
    compile "com.squareup.retrofit2:converter-scalars:2.3.0"
    compile "com.squareup.okhttp3:logging-interceptor:3.6.0"
    compile group: 'joda-time', name: 'joda-time', version: '2.9.9'
```

###### Click do Botão
```
btSaldo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                task();
            }
        });
```

###### Método que realiza a requisição
```
    public Response<Saldo> saldoCartao() throws IOException {
        ApiClient api = new ApiClient();
        CartoesApi apiInstance = api.createService(CartoesApi.class);
        String clientId = "client_id"; // String | Identificador do cliente utilizado na autenticação.
        String accessToken = "access_token"; // String | Token de acesso utilizado na autenticação.
        String idCartao = "idCartao_example"; // String | Número identificador referente ao proxy localizado no verso do cartão.
        Call<Saldo> request = apiInstance.getSaldo(clientId, accessToken, idCartao);
        Response<Saldo> response = request.execute();
        return response;
    }
```
###### Task para executar a requisição
```
 public void task() {

        new AsyncTask<Void, Void, Void>() {

            Response<Saldo> response;

            @Override
            protected Void doInBackground(Void... params) {
                try {
                    response = saldoCartao();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return null;
            }

            @Override
            protected void onPostExecute(Void voids) {
                try {
                    String msg;
                    if (response.isSuccessful()) {
                        Saldo saldo = response.body();
                        Log.i("agitech", saldo.toString());
                        msg = "Saldo : " + saldo.getSaldo();
                    } else {
                        Log.i("agitech", response.errorBody().toString());
                        msg = "Erro : " + response.errorBody().string();
                    }
                    Toast toast = Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG);
                    toast.show();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }.execute();
    }
```



