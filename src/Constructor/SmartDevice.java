package Constructor;

public class SmartDevice {
    String deviceName;
    String os;
    int batteryCapacity;

    public SmartDevice(){
        this.deviceName="";
        this.os = "";
        this.batteryCapacity = 0;
    }
    public SmartDevice(String deviceName){
        this();
        this.deviceName=deviceName;
    }
    public SmartDevice(String deviceName, String os){
        this(deviceName);
        this.os=os;
    }
    public SmartDevice(String deviceName, String os, int batteryCapacity){
        this(deviceName,os);
        this.batteryCapacity=batteryCapacity;
    }
    public static void main(String[] args) {
        SmartDevice d1 = new SmartDevice();
        SmartDevice d2 = new SmartDevice("Galaxy Watch");
        SmartDevice d3 = new SmartDevice("iPhone", "iOS");
        SmartDevice d4 = new SmartDevice("OnePlus Nord", "Android", 4500);

        System.out.println(d1.deviceName + " " + d1.os + " " + d1.batteryCapacity);
        System.out.println(d2.deviceName + " " + d2.os + " " + d2.batteryCapacity);
        System.out.println(d3.deviceName + " " + d3.os + " " + d3.batteryCapacity);
        System.out.println(d4.deviceName + " " + d4.os + " " + d4.batteryCapacity);
    }
}
