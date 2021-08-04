package com.example.dclistrxjava3aug;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashMap;


import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;


public class MainActivity extends AppCompatActivity {


    Button button;
    TextView textView;

    CompositeDisposable compositeDisposable = new CompositeDisposable();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.text_show);
        button=findViewById(R.id.but_click);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // CallAPI();
                CallApiRx();
            }
        });

    }

   /* private void CallAPI(){

       *//* UserName:"BALIC_Service",
                Password:"Pass@1234",
                ClientCode:"BALIC",
                Pincode:"400072",
                state:"maharashtra",
                city:"mumbai",
                range:"10"*//*


        HashMap hashMap=new HashMap();
        hashMap.put("UserName","BALIC_Service");
        hashMap.put("Password","Pass@1234");
        hashMap.put("ClientCode","BALIC");
        hashMap.put("Pincode","400072");
        hashMap.put("state","maharashtra");
        hashMap.put("city","mumbai");
        hashMap.put("range","10");

        ApiInterface apiInterface=ApiClient.getRetrofit().create(ApiInterface.class);

        Call<DCAllResponses> call= apiInterface.getDCListAPIData(hashMap);
       call.enqueue(new Callback<DCAllResponses>() {
           @Override
           public void onResponse(Call<DCAllResponses> call, Response<DCAllResponses> response) {

               textView.setText(response.body().getStatus().toString());
           }

           @Override
           public void onFailure(Call<DCAllResponses> call, Throwable t) {
            textView.setText(t.getMessage());
           }
       });

    }*/

    private void CallApiRx(){
        HashMap hashMap=new HashMap();
        hashMap.put("UserName","BALIC_Service");
        hashMap.put("Password","Pass@1234");
        hashMap.put("ClientCode","BALIC");
        hashMap.put("Pincode","400072");
        hashMap.put("state","maharashtra");
        hashMap.put("city","mumbai");
        hashMap.put("range","10");

        ApiInterface apiInterface=ApiClient.getRetrofit().create(ApiInterface.class);

       compositeDisposable.add(apiInterface
       .getDCListAPIData(hashMap)
       .observeOn(AndroidSchedulers.mainThread())
       .subscribeOn(Schedulers.io())
       .subscribe(new Consumer<DCAllResponses>() {
           @Override
           public void accept(DCAllResponses dcAllResponses) throws Exception {
           textView.setText(dcAllResponses.getStatus().toString());
           }
       }));

    }
}
