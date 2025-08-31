package DESIGN_PATTERN.SANGEET.device;

import DESIGN_PATTERN.SANGEET.externals.WiredSpeakerApi;
import DESIGN_PATTERN.SANGEET.models.Song;

public class WiredSpeakerAdapter implements IAudioOutputDevice{

    private final WiredSpeakerApi wiredSpeakerApi;

    public WiredSpeakerAdapter(WiredSpeakerApi wsApi){
        this.wiredSpeakerApi = wsApi;
    }

    @Override
    public void playAudio(Song song) {
        String SongLoad = song.getTitle() + "by" + song.getArtist();
        wiredSpeakerApi.playSoundViaWS(SongLoad);
    }
}
