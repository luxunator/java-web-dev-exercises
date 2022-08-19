package exercises.technology;

public abstract class Computer {
    private String manufacturer;
    private double storage;
    private int memory;
    private int cores;

    Computer(String manufacturer, double storage, int memory, int cores){
        this.manufacturer = manufacturer;
        this.storage = storage;
        this.memory = memory;
        this.cores = cores;
    }

    public void setStorage(double storage) {
        this.storage = storage;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }
}
