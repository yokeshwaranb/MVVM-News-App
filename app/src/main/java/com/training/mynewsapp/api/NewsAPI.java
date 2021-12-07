package com.training.mynewsapp.api;

import com.training.mynewsapp.models.NewsResponse;

import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface NewsAPI {

    // default arguments are the need to find a way for thAT
    @GET("v2/top-headlines")
    public Response<NewsResponse> getBreakingNews(
            @Query("country")
                    String countryCode,
            @Query("page")
                    int pageNumber,
            @Query("apiKey")
                    String apiKey
    );

    @GET("v2/top-headlines")
    public Response<NewsResponse> searchForNews(
            @Query("q")
                    String searchQuery,
            @Query("page")
                    int pageNumber,
            @Query("apiKey")
                    String apiKey
    );
}
