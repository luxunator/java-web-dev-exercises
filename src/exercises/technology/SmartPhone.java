package exercises.technology;

public class SmartPhone extends Computer{

    private int pin;
    private boolean bluetoothEnabled;
    private double alarmVolume;

    SmartPhone(String manufacturer, double storage, int memory, int cores, int pin, boolean bluetoothEnabled, double alarmVolume){
        super(manufacturer, storage, memory, cores);
        this.pin = pin;
        this.bluetoothEnabled = bluetoothEnabled;
        this.alarmVolume = alarmVolume;
    }

    private void setPin(int pin) {
        this.pin = pin;
    }

    public void setBluetoothEnabled(boolean bluetoothEnabled) {
        this.bluetoothEnabled = bluetoothEnabled;
    }

    public void setAlarmVolume(double alarmVolume) {
        this.alarmVolume = alarmVolume;
    }

    public void resetPin(int oldPin, int newPin){
        if (oldPin == this.pin) {
            setPin(newPin);
        }
    }
}
