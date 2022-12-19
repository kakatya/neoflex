package singleton;

public class SecondThread implements Runnable {
    @Override
    public void run() {
        Logger.getLogger().logInfo("Helloo!!" + Logger.getLogger(), SecondThread.class);
    }
}
