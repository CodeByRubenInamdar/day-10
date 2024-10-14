package com.demo.mvc;

import com.demo.mvc.controller.GreetingController;
import com.demo.mvc.model.Greeting;
import com.demo.mvc.view.GreetingView;

public class Main {
    public static void main(String[] args) {
        // Create the model
        Greeting greeting = new Greeting();
        greeting.setMessage("Hello, MVC!");

        // Create the view
        GreetingView view = new GreetingView();

        // Create the controller
        GreetingController controller = new GreetingController(greeting, view);

        // Update the view
        controller.updateView();

        // Change the data
        controller.setGreetingMessage("Hello, Maven!");

        // Update the view again
        controller.updateView();
    }
}
