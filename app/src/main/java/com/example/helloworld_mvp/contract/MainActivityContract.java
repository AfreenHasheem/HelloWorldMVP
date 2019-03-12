package com.example.helloworld_mvp.contract;

public interface MainActivityContract {

    interface View {
        void initView();
        void setViewData(String data);
    }

    interface Presenter {
        void onClick(android.view.View view);
    }

    interface Model {
        String getData();
    }
}
