package DESIGN_PATTERN.SANGEET;

import DESIGN_PATTERN.SANGEET.enums.DeviceType;
import DESIGN_PATTERN.SANGEET.enums.PlayStratgeyType;
import DESIGN_PATTERN.SANGEET.manager.PlaylistManger;
import DESIGN_PATTERN.SANGEET.models.Song;


import java.util.ArrayList;
import java.util.List;

public class MusicPlayerApplication {

    private static MusicPlayerApplication instance;
    private List<Song> songLibrary;

    MusicPlayerApplication(){
        this.songLibrary = new ArrayList<>();
    }

    public synchronized MusicPlayerApplication getInstance(){
        if (instance == null){
            instance = new MusicPlayerApplication();
        }
        return instance;
    }

    public void createSonglibrary(String title , String atist , String path){
        Song song = new Song(title,path,atist);
        songLibrary.add(song);
    }

    public Song findbyTitle(String song){
        for (Song s : songLibrary){
            if (s.getTitle().equals(song)){
                return s;
            }
        }
        return null;
    }

    public void createPlaylist(String playlistName){
        PlaylistManger.getInstance().createPlaylist(playlistName);
    }

    public void addSongtoPlaylist(String playlist , String songName){
        Song song = findbyTitle(songName);
        if (song == null){
            throw new RuntimeException("Song is Not Loaded: ");
        }
        PlaylistManger.getInstance().addSongToPlaylist(playlist , song);
    }

    public void connectAudioDevice(DeviceType deviceType){
        MusicFacade.getInstance().connectDevice(deviceType);
    }

    public void selectStrategy(PlayStratgeyType playStratgeyType){
        MusicFacade.getInstance().setPlayStrategy(playStratgeyType);
    }

    public void loadPlaylist(String playListName){
        MusicFacade.getInstance().loadPlaylist(playListName);
    }

    public  void pauseCurrentSong(String song){
        Song song1 = findbyTitle(song);
        if (song1 == null){
            throw new RuntimeException("Song is Not Found :");
        }

        MusicFacade.getInstance().pauseSong(song1);
    }

    public void playAlltrackInPlaylist(){
        MusicFacade.getInstance().playAllTrack();
    }


    public void playpreviousTrack(){
        MusicFacade.getInstance().playPreviousTrack();
    }


    public void queueSongNext(String songTitle){
        Song song = findbyTitle(songTitle);
        if (song == null){
            throw new RuntimeException("Song is Not Found ");
        }
        MusicFacade.getInstance().enqueNext(song);
    }

    public void playSingleSong(String songTitle) {
        Song song = findbyTitle(songTitle);
        if (song == null) {
            throw new RuntimeException("Song \"" + songTitle + "\" not found.");
        }
        MusicFacade.getInstance().playSong(song);
    }
}
