package Lesson6;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AccuweatherApp {
    public static void main(String[] args) throws IOException {
        OkHttpClient okHttpClient = new OkHttpClient()
                .newBuilder()
                .readTimeout(10, TimeUnit.SECONDS)
                .build();

        HttpUrl url = new HttpUrl.Builder()
                .scheme("http")
                .host("dataservice.accuweather.com")
                .addPathSegments("/forecasts/v1/daily/5day/25123")

                .addQueryParameter("apikey", "Pe26SMT1AX4aAPGB9bXtQxBAzROGfTCM")
                .build();

        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();

        Response response = okHttpClient.newCall(request).execute();

        System.out.println(response.code());
        System.out.println(response.headers());
        //System.out.println(response.body().toString());

        String body = response.body().string();
        System.out.println(body);
    }
}