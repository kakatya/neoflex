package adapter;

public class UsbAdapter implements ComputerStorageDevice{
    private MicroStorageDevice microStorageDevice;

    public UsbAdapter(MicroStorageDevice microStorageDevice) {
        this.microStorageDevice = microStorageDevice;
    }

    @Override
    public void set() {
        microStorageDevice.set();
    }
}
