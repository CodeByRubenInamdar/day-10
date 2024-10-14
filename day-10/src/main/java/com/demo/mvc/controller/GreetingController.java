package com.demo.mvc.controller;

import com.demo.mvc.model.Greeting;
import com.demo.mvc.view.GreetingView;

public class GreetingController {
    private Greeting model;
    private GreetingView view;

    public GreetingController(Greeting model, GreetingView view) {
        this.model = model;
        this.view = view;
    }

    public void setGreetingMessage(String message) {
        model.setMessage(message);
    }

    public String getGreetingMessage() {
        return model.getMessage();
    }

    public void updateView() {
        view.printGreetingDetails(model.getMessage());
    }
}
