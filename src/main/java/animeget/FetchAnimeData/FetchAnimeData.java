package main.java.animeget.FetchAnimeData;

import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


public class FetchAnimeData {

    private final String year;
    private final String season;
    private final String API_BASE_URL = "https://api.moemoe.tokyo/anime/v1/master/";
    private Response response;
    

    public FetchAnimeData(String year ,String season) {
        this.year = year;
        this.season = season;
    }

    public String fetch() throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
            .url(this.API_BASE_URL + "/" + this.year + "/" + this.season)
            .build();
        response = client.newCall(request).execute();
        return response.body().string();
    }
}