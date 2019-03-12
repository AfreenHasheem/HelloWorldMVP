package com.example.helloworld_mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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

        //create instance(object) of a Presenter as we need the Presenter to talk to View and Model as a mediator
        //if View needs any data, Presenter will fetch from the Model and pass it to the View
        //if View needs data, it will ask the Presenter to fetch it from the Model
        //this = passing the current activity that is implementing the View interface
        mPresenter = new MainActivityPresenter(this);
    }

    @Override
    public void initView() {
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                mPresenter.onClick(view);
            }
        });

    }

    @Override
    public void setViewData(String data) {
        textView.setText(data);

    }
}
