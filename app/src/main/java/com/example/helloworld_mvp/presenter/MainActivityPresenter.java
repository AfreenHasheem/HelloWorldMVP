package com.example.helloworld_mvp.presenter;

import com.example.helloworld_mvp.contract.MainActivityContract;
import com.example.helloworld_mvp.model.MainActivityModel;

public class MainActivityPresenter implements MainActivityContract.Presenter {

    private MainActivityContract.View mView;
    private MainActivityContract.Model mModel;

    public MainActivityPresenter(MainActivityContract.View mView) {
        this.mView = mView;
        initPresenter();
    }

    private void initPresenter() {
        mModel = new MainActivityModel();
        mView.initView();
    }

    @Override
    public void onClick(android.view.View view) {
        String data = mModel.getData();
        mView.setViewData(data);


    }
}
