package adapter;

public class Usb implements ComputerStorageDevice {
    @Override
    public void set() {
        System.out.println("Установлен USB");
    }
}
