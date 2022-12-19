import adapter.Computer;
import adapter.MemoryCard;
import adapter.UsbAdapter;
import factory.CoffeeMaker;
import factory.CoffeeType;
import proxy.DbConnectorImpl;
import proxy.DbConnectorProxy;
import singleton.Logger;
import singleton.SecondThread;

public class Main {
    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        Thread thread = new Thread(new SecondThread());
        MemoryCard memoryCard = new MemoryCard();
        UsbAdapter usbAdapter = new UsbAdapter(memoryCard);
        Computer computer = new Computer();
        computer.connectStorageDevice(usbAdapter);
        thread.start();
        Logger.getLogger().logInfo("Hello" + Logger.getLogger(), Main.class);
        Logger.getLogger().logInfo("Hello2" + Logger.getLogger(), Main.class);
        Logger.getLogger().logInfo("Hello2dasdas" + Logger.getLogger(), Main.class);

        coffeeMaker.pourCoffee(CoffeeType.AMERICANO);
        DbConnectorImpl dbConnector = new DbConnectorImpl();
        DbConnectorProxy proxy = new DbConnectorProxy(dbConnector);
        String connectUrl = proxy.getUrl("msSql");
        System.out.println(connectUrl);
        String connectorUrl3 = proxy.getUrl("msSql");
        System.out.println(connectorUrl3);
        String connectorUrl5 = proxy.getUrl("msSql");
        System.out.println(connectorUrl5);

    }
}
