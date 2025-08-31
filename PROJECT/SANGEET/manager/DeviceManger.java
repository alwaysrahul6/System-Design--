package DESIGN_PATTERN.SANGEET.manager;

import DESIGN_PATTERN.SANGEET.device.IAudioOutputDevice;
import DESIGN_PATTERN.SANGEET.enums.DeviceType;
import DESIGN_PATTERN.SANGEET.factories.DeviceFactory;

public class DeviceManger {

    private IAudioOutputDevice currentdevice;

    public DeviceManger(){
        currentdevice = null;
    }

    //SingleTon
    private static DeviceManger instance;

    public  static synchronized DeviceManger getInstance (){
        if (instance == null ){
            instance = new DeviceManger();
        }
        return instance;
    }



    public void connect(DeviceType deviceType){
        if (currentdevice != null){
        }
        currentdevice = DeviceFactory.createDevice(deviceType);
        switch (deviceType){
            case HEADPHONE -> System.out.println("HeadPhone is Connected");
            case WIRED -> System.out.println("Wired is Connected");
            case BLUETOOTH -> System.out.println("BlueTooth is Connected");
        }
    }

    public IAudioOutputDevice getCurrentdevice(){
        if (currentdevice == null){
            throw new RuntimeException("No Output Device is Connected: ");
        }return currentdevice;
    }

    public boolean hasDevice(){
        return currentdevice != null;
    }
}
