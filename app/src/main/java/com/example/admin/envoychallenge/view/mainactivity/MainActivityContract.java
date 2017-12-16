package com.example.admin.envoychallenge.view.mainactivity;

import com.example.admin.envoychallenge.BasePresenter;
import com.example.admin.envoychallenge.BaseView;
import com.example.admin.envoychallenge.model.GistsResponse;

import java.util.List;

/**
 * Created by Admin on 12/14/2017.
 */

public interface MainActivityContract {

    interface View extends BaseView{
        void showRecyclerView(List<GistsResponse> requestList);
    }

    interface Presenter extends BasePresenter<View>{
        void getGists();

    }
}
