package com.demo.Singleton;

class Singleton {
    // Static variable to hold the single instance
    private static Singleton instance;

    // Private constructor to prevent instantiation
    private Singleton() {
        // Initialization code, if needed
    }

    // Thread-safe method to provide access to the single instance
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(); // Lazy initialization
        }
        return instance;
    }

    // Example method to demonstrate singleton functionality
    public void showMessage() {
        System.out.println("Hello from the Singleton instance!");
    }
}

// Main class to test the Singleton
public class SingletonExample {
    public static void main(String[] args) {
        // Get the only instance of the Singleton class
        Singleton singletonInstance = Singleton.getInstance();

        // Call a method on the singleton instance
        singletonInstance.showMessage(); // Output: Hello from the Singleton instance!
    }
}
