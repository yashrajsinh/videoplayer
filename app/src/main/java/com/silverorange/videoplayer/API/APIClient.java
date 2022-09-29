package com.silverorange.videoplayer.API;

import com.silverorange.videoplayer.Model.MVideoDetails;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

//API to fetch videos
public interface APIClient {
    @GET("videos")
    Call<ArrayList<MVideoDetails>> getPosts();
}
