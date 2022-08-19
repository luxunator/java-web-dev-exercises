package exercises.technology;

public class Laptop extends Computer {

    private int externalMonitors;
    private boolean isLidClosed;
    private double trackpadSize;



    Laptop(String manufacturer, double storage, int memory, int cores, int externalMonitors, boolean isLidClosed, double trackpadSize){
        super(manufacturer, storage, memory, cores);
        this.externalMonitors = externalMonitors;
        this.isLidClosed = isLidClosed;
        this.trackpadSize = trackpadSize;
    }

    public void setLidClosed(boolean lidClosed) {
        this.isLidClosed = lidClosed;
    }

    public void setExternalMonitors(int externalMonitors) {
        this.externalMonitors = externalMonitors;
    }
}
