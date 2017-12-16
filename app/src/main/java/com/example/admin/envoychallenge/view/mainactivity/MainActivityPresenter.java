package com.example.admin.envoychallenge.view.mainactivity;

import com.example.admin.envoychallenge.datasource.RetrofitHelper;
import com.example.admin.envoychallenge.model.GistsResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * Created by Admin on 12/14/2017.
 */

public class MainActivityPresenter implements MainActivityContract.Presenter{
    private static final String TAG = "MainActivityPresenterTag";

    MainActivityContract.View mView;

    @Override
    public void attach(MainActivityContract.View view) { mView = view; }

    @Override
    public void detach() { this.mView = null; }

    @Override
    public void getGists() {
        Call<List<GistsResponse>> getResult = RetrofitHelper.getResult();

        getResult.enqueue(new Callback<List<GistsResponse>>() {
            @Override
            public void onResponse(Call<List<GistsResponse>> call, Response<List<GistsResponse>> response) {
                mView.showError(response.body().get(0).getFiles().getAptSh().getFilename());
                mView.showToast("Success");
                mView.showRecyclerView(response.body());
            }

            @Override
            public void onFailure(Call<List<GistsResponse>> call, Throwable t) {
                mView.showError(t.getMessage());
            }
        });
    }
}
