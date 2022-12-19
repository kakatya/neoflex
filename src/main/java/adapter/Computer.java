package adapter;

public class Computer {
    public void connectStorageDevice(ComputerStorageDevice device) {
        device.set();
        System.out.println("USB накопитель подключен");
    }
}
