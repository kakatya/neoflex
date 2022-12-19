package singleton;

import java.io.*;

public class Logger {
    private volatile static Logger logger;
    private static final File file = new File("logs.txt");

    private Logger() {
    }

    public static Logger getLogger() {
        if (logger == null) {
            synchronized (Logger.class) {
                if (logger == null)
                    logger = new Logger();
            }
        }
        return logger;
    }

    public <T> void logInfo(String message, Class<T> c) {
        try (PrintWriter fileWriter = new PrintWriter(new BufferedWriter(new FileWriter(file, true)))) {
            fileWriter.append("Log INFO: -class " + c.getName() + " -message " + message + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public <T> void logУк(String message, Class<T> c) {
        try (PrintWriter fileWriter = new PrintWriter(new BufferedWriter(new FileWriter(file, true)))) {
            fileWriter.append("Log INFO: -class " + c.getName() + " -message " + message + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
