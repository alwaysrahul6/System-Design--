package DESIGN_PATTERN.SANGEET.device;

import DESIGN_PATTERN.SANGEET.externals.HeadPhoneApi;
import DESIGN_PATTERN.SANGEET.models.Song;

public class HeadPhonesAdapter implements IAudioOutputDevice{

    private HeadPhoneApi headPhoneApi;

    public HeadPhonesAdapter(HeadPhoneApi Hpi){
        this.headPhoneApi = Hpi;
    }


    @Override
    public void playAudio(Song song) {
        String SongLoad = song.getTitle()+ " by " + song.getArtist();
        headPhoneApi.playViaHP(SongLoad);
    }
}
