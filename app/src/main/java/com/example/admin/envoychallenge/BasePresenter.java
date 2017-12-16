package com.example.admin.envoychallenge;

/**
 * Created by Admin on 12/14/2017.
 */

public interface BasePresenter <V extends BaseView> {
    void attach(V view);
    void detach();
}
