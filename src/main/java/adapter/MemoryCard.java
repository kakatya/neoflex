package adapter;

public class MemoryCard implements MicroStorageDevice {
    @Override
    public void set() {
        System.out.println("Установлена карта памяти");
    }
}
