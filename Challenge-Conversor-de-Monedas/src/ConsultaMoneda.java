import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {

    private static final String API_KEY = "979e8206a6e86bd2be2568df";

    public Monedas buscarMoneda(String moneda_base, String moneda_target) {
        if (moneda_base == null || moneda_base.isEmpty() || moneda_target == null || moneda_target.isEmpty()) {
            throw new IllegalArgumentException("Las monedas base y objetivo no pueden estar vacías");
        }

        HttpClient client = HttpClient.newHttpClient();
        String url = String.format("https://v6.exchangerate-api.com/v6/%s/pair/%s/%s/",
                API_KEY, moneda_base, moneda_target);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() != 200) {
                throw new RuntimeException("Error en la consulta: Código de respuesta " + response.statusCode());
            }

            return new Gson().fromJson(response.body(), Monedas.class);

        } catch (IOException e) {
            throw new RuntimeException("Error de red: " + e.getMessage(), e);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("Operación fue interrumpida", e);
        } catch (JsonSyntaxException e) {
            throw new RuntimeException("Error al parsear la respuesta JSON: " + e.getMessage(), e);
        }
    }
}
