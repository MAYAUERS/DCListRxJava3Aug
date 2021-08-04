package com.example.dclistrxjava3aug;

import java.util.HashMap;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiInterface {


    // @POST("API_UAT/BALIC/DCList")
    @POST("Webservice/GetDCList")
    Observable<DCAllResponses> getDCListAPIData(@Body HashMap<String, String> paramHashMap);
    // Call<DCAllResponses> getDCListAPIData(@Body HashMap<String, String> paramHashMap);
}
