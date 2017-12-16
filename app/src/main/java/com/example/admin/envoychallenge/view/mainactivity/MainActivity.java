package com.example.admin.envoychallenge.view.mainactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.example.admin.envoychallenge.R;
import com.example.admin.envoychallenge.model.GistsResponse;
import com.example.admin.envoychallenge.view.mainactivity.adapters.RecyclerViewAdapter;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View{
    private static final String TAG = "MainActivityTag";

    private MainActivityPresenter mPresenter;

    private RecyclerView mRecyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.tvRecyclerView);

        //Presenter Instantiation
        mPresenter = new MainActivityPresenter();
        mPresenter.attach(MainActivity.this);

        mPresenter.getGists();
    }

    @Override
    public void showError(String MSG) {
        Log.d(TAG, "showError: " + MSG);
    }

    @Override
    public void showToast(String MSG) {
        Toast.makeText(getApplicationContext(), MSG, Toast.LENGTH_SHORT).show();
        Log.d(TAG, "showToast: " + MSG);
    }

    @Override
    public void showRecyclerView(List<GistsResponse> requestList) {

        RecyclerViewAdapter mAdapter = new RecyclerViewAdapter(requestList);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());

    }
}
