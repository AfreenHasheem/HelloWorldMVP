package com.example.helloworld_mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.helloworld_mvp.contract.MainActivityContract;
import com.example.helloworld_mvp.presenter.MainActivityPresenter;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View {

    private TextView textView;
    private Button button;

    private MainActivityContract.Presenter mPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);

        mPresenter = new MainActivityPresenter();

    }

    @Override
    public void initView() {

    }

    @Override
    public void setViewData(String data) {

    }
}
