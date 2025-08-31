package DESIGN_PATTERN.SANGEET.device;

import DESIGN_PATTERN.SANGEET.externals.BlueToothSpeakerApi;
import DESIGN_PATTERN.SANGEET.models.Song;

public class BluetoothSpeakerAdapter implements IAudioOutputDevice{

    private BlueToothSpeakerApi blueToothSpeakerApi;

    public BluetoothSpeakerAdapter(BlueToothSpeakerApi bs){
        this.blueToothSpeakerApi = bs;
    }


    @Override
    public void playAudio(Song song) {
        String SongLoad = song.getTitle() + " by " + song.getArtist();
        blueToothSpeakerApi.playSongViaBT(SongLoad);
    }
}
