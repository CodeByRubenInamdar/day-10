package com.demo.SOLID.ISP;

// Interface for printing functionality
interface Printer {
    void print(Document document);
}

// Interface for scanning functionality
interface Scanner {
    void scan(Document document);
}

// Interface for faxing functionality
interface Fax {
    void fax(Document document);
}

// Class representing a document with content
class Document {
    private String content;

    // Constructor to initialize the document content
    public Document(String content) {
        this.content = content;
    }

    // Getter for the document content
    public String getContent() {
        return content;
    }

    // Setter for the document content
    public void setContent(String content) {
        this.content = content;
    }
}

// Implementation of the Printer interface
// This class only handles the printing functionality
class SimplePrinter implements Printer {
    @Override
    public void print(Document document) {
        System.out.println("Printing document: " + document.getContent());
    }
}

// Implementation of both Printer and Scanner interfaces
// This class supports printing and scanning functionalities
class MultiFunctionDevice implements Printer, Scanner {
    @Override
    public void print(Document document) {
        System.out.println("Printing document: " + document.getContent());
    }

    @Override
    public void scan(Document document) {
        System.out.println("Scanning document: " + document.getContent());
    }
}

// Implementation of Printer, Scanner, and Fax interfaces
// This class supports all three functionalities
class AdvancedMachine implements Printer, Scanner, Fax {
    @Override
    public void print(Document document) {
        System.out.println("Printing document: " + document.getContent());
    }

    @Override
    public void scan(Document document) {
        System.out.println("Scanning document: " + document.getContent());
    }

    @Override
    public void fax(Document document) {
        System.out.println("Faxing document: " + document.getContent());
    }
}

// Main class to test the implementation of the Interface Segregation Principle
public class TestISP {

    public static void main(String[] args) {
        // Creating a Document instance with some content
        Document document = new Document("Sample Document Content");

        // Testing the SimplePrinter class
        // This class only implements the Printer interface, adhering to the print functionality
        Printer simplePrinter = new SimplePrinter();
        simplePrinter.print(document);

        // Testing the MultiFunctionDevice class
        // This class implements both the Printer and Scanner interfaces
        // It supports both printing and scanning functionalities
        MultiFunctionDevice multiFunctionDevice = new MultiFunctionDevice();
        multiFunctionDevice.print(document); // Printing functionality
        multiFunctionDevice.scan(document);  // Scanning functionality

        // Testing the AdvancedMachine class
        // This class implements Printer, Scanner, and Fax interfaces
        // It supports printing, scanning, and faxing functionalities
        AdvancedMachine advancedMachine = new AdvancedMachine();
        advancedMachine.print(document); // Printing functionality
        advancedMachine.scan(document);  // Scanning functionality
        advancedMachine.fax(document);   // Faxing functionality
    }
}
