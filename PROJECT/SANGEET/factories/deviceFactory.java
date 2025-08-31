package DESIGN_PATTERN.SANGEET.factories;

import DESIGN_PATTERN.SANGEET.device.BluetoothSpeakerAdapter;
import DESIGN_PATTERN.SANGEET.device.HeadPhonesAdapter;
import DESIGN_PATTERN.SANGEET.device.IAudioOutputDevice;
import DESIGN_PATTERN.SANGEET.device.WiredSpeakerAdapter;
import DESIGN_PATTERN.SANGEET.enums.DeviceType;
import DESIGN_PATTERN.SANGEET.externals.BlueToothSpeakerApi;
import DESIGN_PATTERN.SANGEET.externals.HeadPhoneApi;
import DESIGN_PATTERN.SANGEET.externals.WiredSpeakerApi;

public class DeviceFactory  {

    public static IAudioOutputDevice createDevice(DeviceType deviceType){
        switch (deviceType){
            case BLUETOOTH -> {
                return new BluetoothSpeakerAdapter(new BlueToothSpeakerApi());
            }case WIRED -> {
                return new WiredSpeakerAdapter(new WiredSpeakerApi());
            }default -> {
                return new HeadPhonesAdapter(new HeadPhoneApi());
            }
        }
    }
}
