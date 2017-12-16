package com.example.admin.envoychallenge.datasource;

import com.example.admin.envoychallenge.model.GistsResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

/**
 * Created by Admin on 12/14/2017.
 */

public class RetrofitHelper {

    private static final String BASE_URL = "https://api.github.com/";
    private static final String PATH = "gists/public";

    private static Retrofit create() {
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static Call<List<GistsResponse>> getResult() {
        Retrofit mRetrofit = create();
        APIService mApiService = mRetrofit.create(APIService.class);
        return mApiService.getResults();
    }

    interface APIService {
        @GET(PATH)
        Call<List<GistsResponse>> getResults();
    }
}
