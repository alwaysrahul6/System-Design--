package DESIGN_PATTERN.SANGEET.core;

import DESIGN_PATTERN.SANGEET.device.IAudioOutputDevice;
import DESIGN_PATTERN.SANGEET.models.Song;

public class AudioEngine {
    private Song cuurSong;

    private boolean songIsPaused;

    public AudioEngine(){
        cuurSong = null;
        songIsPaused = false;
    }

    public String getCuurSongTitle(){
        if (cuurSong != null ){
            return cuurSong.getTitle();
        }
        return "";
    }

    public void playSong(IAudioOutputDevice iod , Song song){
        if (song == null){
            throw new RuntimeException("Song is Not Found :");
        }
        if (songIsPaused && song == cuurSong){
            songIsPaused = false;
            System.out.println("Resuming Song" + song.getTitle());
            iod.playAudio(song);
            return;
        }

        cuurSong = song;
        songIsPaused = false;
        System.out.println("Playing Song: " + song.getTitle());
        iod.playAudio(song);
    }

    public void pause(){
        if (cuurSong == null){
            throw new RuntimeException("No Song is currently playing to pause");
        }
        if (songIsPaused){
            throw new RuntimeException("Song is already paused");
        }
        songIsPaused = true;
        System.out.println("Pausing Song" + cuurSong.getTitle());
    }
}
