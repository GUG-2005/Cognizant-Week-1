import java.util.*;
import java.io.*;

interface Document {
    void create();
}

class WordDocument implements Document {
    public void create() {
        System.out.println("Word document is created!");
    }
}

class PdfDocument implements Document {
    public void create() {
        System.out.println("Pdf Document is created!");
    }
}

class ExcelDocument implements Document {
    public void create() {
        System.out.println("Excel Document is created!");
    }
}

class DocumentFactory {
    public static Document createDocument(String type) {
        if (type.equalsIgnoreCase("word")) {
            return new WordDocument();
        } else if (type.equalsIgnoreCase("pdf")) {
            return new PdfDocument();
        } else if (type.equalsIgnoreCase("excel")) {
            return new ExcelDocument();
        } else {
            return null;
        }
    }
}

class DocumentFactoryTest {
    public static void runTest() {
        System.out.println("Running Factory Method Tests");

        String[] types = {"word", "pdf", "excel", "text"}; 
        for (String type : types) {
            Document doc = DocumentFactory.createDocument(type);
            if (doc != null) {
                System.out.print("Creating " + type + ": ");
                doc.create();
            } else {
                System.out.println("Unknown document type: " + type);
            }
        }
    }
}

public class FactoryMethodPattern {
    public static void main(String[] args) {
        // Run test
        DocumentFactoryTest.runTest();
    }
}
