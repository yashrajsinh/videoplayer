package com.silverorange.videoplayer.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.gson.Gson;
import com.silverorange.videoplayer.API.APIClient;
import com.silverorange.videoplayer.Model.MVideoDetails;
import com.silverorange.videoplayer.R;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private TextView tvData;
    private ArrayList<String> dataList = new ArrayList<>();
    //fetching data from local database
    String API_URL = "http://192.168.0.163:4000/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Method to fetch local data
        LocalHost();

    }
    //TODO: Method to get data using retro fit
    public void LocalHost() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        APIClient client = retrofit.create(APIClient.class);
        client.getPosts().enqueue(new Callback<ArrayList<MVideoDetails>>() {
            @Override
            public void onResponse(Call<ArrayList<MVideoDetails>> call, Response<ArrayList<MVideoDetails>> response) {
                if (response.code() == 200) {
                    ArrayList<MVideoDetails> videoDetails = response.body();
                    String s = null;
                    //    tvData.setText(videoDetails.get(0));
                    try {
                        JSONArray array = new JSONArray(new Gson().toJson(videoDetails));
                        for (int i = 0; i < array.length(); i++) {

                        }
                        Log.d("Success", "Data " + array);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                } else {
                    Log.d("Error", "" + response.message());
                }
            }

            @Override
            public void onFailure(Call<ArrayList<MVideoDetails>> call, Throwable t) {
                Log.d("Error", t.getMessage());
            }
        });


    }

}
