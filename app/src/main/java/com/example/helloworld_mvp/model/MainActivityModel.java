package com.example.helloworld_mvp.model;

import com.example.helloworld_mvp.contract.MainActivityContract;

public class MainActivityModel implements MainActivityContract.Model {
    @Override
    public String getData() {
        return "Hello World";
    }
}
