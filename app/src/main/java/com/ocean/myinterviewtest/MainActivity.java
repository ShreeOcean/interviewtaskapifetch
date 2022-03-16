package com.ocean.myinterviewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;

import com.ocean.myinterviewtest.databinding.ActivityMainBinding;
import com.ocean.myinterviewtest.utility.Utility;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ResponseModel responseModel;
    ActivityMainBinding mainBinding;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());

        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Please wait...");
        progressDialog.setCancelable(false);
        progressDialog.show();

        ApiName apiName = RetroFitApis.getInstance(ApiName.class);

        Call<ResponseModel> call =apiName.getResponseData(Utility.KEY);
        call.enqueue(new Callback<ResponseModel>() {
            @Override
            public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {
                if(response.isSuccessful() && response.code() == 200){
                    responseModel = response.body();

                    progressDialog.dismiss();

                    mainBinding.tvCreatedAt.setText(responseModel.getCreatedAt());
                    mainBinding.tvEnvelopeXdr.setText(responseModel.getEnvelopeXdr());
                    mainBinding.tvHash.setText(responseModel.getHash());
                    //mainBinding.tvSignatures.setText((CharSequence) responseModel.getSignatures());
                    mainBinding.tvSourceAccount.setText(responseModel.getSourceAccount());
                }
            }

            @Override
            public void onFailure(Call<ResponseModel> call, Throwable t) {
                Utility.showLongToast(MainActivity.this, t.getMessage());
                Log.d("api call :", "onFailure: " + t.getMessage());
            }
        });
    }
}