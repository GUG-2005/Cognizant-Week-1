import java.util.*;
import java.io.*;

// Singleton Logger class
class Logger {
    private static Logger instance;

    private Logger() {}

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("[LOG]: " + message);
    }
}

class LoggerTest {
    public static void runTest() {
        Logger l1 = Logger.getInstance();
        Logger l2 = Logger.getInstance();
        Logger l3 = Logger.getInstance();

        l1.log("First message from l1");
        l2.log("Second message from l2");
        l3.log("Third message from l3");

        if (l1 == l2 && l2 == l3) {
            System.out.println("Singleton verified: All instances are the same.");
        } else {
            System.out.println("Singleton failed: Instances are different.");
        }

        // Print memory addresses
        System.out.println("Reference of l1: " + l1);
        System.out.println("Reference of l2: " + l2);
        System.out.println("Reference of l3: " + l3);
    }
}

// Main class
public class SingletonPattern {
    public static void main(String[] args) {

        LoggerTest.runTest();
    }
}
