package com.demo.FrontController;

import java.util.HashMap;
import java.util.Map;

public class FrontControllerExample {

	// Interface for request handlers
	interface RequestHandler {
		void handle();
	}

	// ProductHandler class
	static class ProductHandler implements RequestHandler {
		@Override
		public void handle() {
			System.out.println("Handling product request...");
			// Business logic for handling product requests
		}
	}

	// LoginHandler class
	static class LoginHandler implements RequestHandler {
		@Override
		public void handle() {
			System.out.println("Handling login request...");
			// Business logic for handling login requests
		}
	}

	// FrontController class
	static class FrontController {
		private Map<String, RequestHandler> handlerMapping;

		public FrontController() {
			handlerMapping = new HashMap<>();
			handlerMapping.put("products", new ProductHandler());
			handlerMapping.put("login", new LoginHandler());
		}

		public void handleRequest(String request) {
			RequestHandler handler = handlerMapping.get(request);
			if (handler != null) {
				handler.handle();
			} else {
				System.out.println("404 Not Found: " + request);
			}
		}
	}

	public static void main(String[] args) {
		FrontController frontController = new FrontController();

		// Simulate incoming requests
		frontController.handleRequest("products");
		frontController.handleRequest("login");
		frontController.handleRequest("signup"); // This will produce a 404 error
	}
}