package DESIGN_PATTERN.SANGEET;

import DESIGN_PATTERN.SANGEET.core.AudioEngine;
import DESIGN_PATTERN.SANGEET.device.IAudioOutputDevice;
import DESIGN_PATTERN.SANGEET.enums.DeviceType;
import DESIGN_PATTERN.SANGEET.enums.PlayStratgeyType;
import DESIGN_PATTERN.SANGEET.manager.DeviceManger;
import DESIGN_PATTERN.SANGEET.manager.PlaylistManger;
import DESIGN_PATTERN.SANGEET.manager.StrategyManger;
import DESIGN_PATTERN.SANGEET.models.PlayList;
import DESIGN_PATTERN.SANGEET.models.Song;
import DESIGN_PATTERN.SANGEET.strategies.PlayStrategy;

public class MusicFacade {
    private static MusicFacade instance;

    private final AudioEngine audioEngine;

    private  PlayList loadedplayList;

    private PlayStrategy playStrategy;

    public MusicFacade() {
        this.audioEngine = new AudioEngine();
        this.loadedplayList = null;
        this.playStrategy = null;
    }

    public static synchronized MusicFacade getInstance(){
        if (instance == null){
            instance = new MusicFacade();
        }
        return instance;
    }

    public void connectDevice(DeviceType deviceType){
        DeviceManger.getInstance().connect(deviceType);
    }

    /// Load PlayList

    public void loadPlaylist(String name){
        loadedplayList = PlaylistManger.getInstance().getPlaylist(name);
        if (playStrategy == null){
            throw new RuntimeException("PlayList Is Not Loaded");
        }
        playStrategy.setPlaylist(loadedplayList);
    }
    public void playSong(Song song){
        if (!DeviceManger.getInstance().hasDevice()){
            throw new RuntimeException("Device is Not Connected:");
        }
        IAudioOutputDevice device  = DeviceManger.getInstance().getCurrentdevice();
        audioEngine.playSong(device ,song);
    }

    public void pauseSong(Song song){
        if (!audioEngine.getCuurSongTitle().equals(song.getTitle())){
            throw new RuntimeException("Cannot pause \"" + song.getTitle() + "\"; not currently playing.");

        }
        audioEngine.pause();
    }

    public void setPlayStrategy(PlayStratgeyType playStratgeyType){
       playStrategy = StrategyManger.getInstance().gettype(playStratgeyType);
    }

    public void playAllTrack(){
        if (loadedplayList == null){
            throw new RuntimeException("PlayList is Not Loaded");
        }
        while (playStrategy.hasnext()){
            Song nextSong = playStrategy.next();
            IAudioOutputDevice device = DeviceManger.getInstance().getCurrentdevice();
            audioEngine.playSong(device , nextSong);
        }
        System.out.println("Completed PlayList: " + loadedplayList.getPlaylistName());
    }

    public void playNextTrack(){
        if (loadedplayList == null){
            throw new RuntimeException("Playlist is Not Loaded");
        }

        if (playStrategy.hasnext()){
            Song nextSong = playStrategy.next();
            IAudioOutputDevice device = DeviceManger.getInstance().getCurrentdevice();
            audioEngine.playSong(device,nextSong);
        }else {
            System.out.println("Completed PlayList :" + loadedplayList.getPlaylistName());
        }
    }

    public void playPreviousTrack(){
        if (loadedplayList == null){
            throw new RuntimeException("Playlist is Null please Load PlayList:");
        }

        if (playStrategy.hasprevious()){
            Song previousSong = playStrategy.previous();
            IAudioOutputDevice device = DeviceManger.getInstance().getCurrentdevice();
            audioEngine.playSong(device ,previousSong);
        }else {
            System.out.println("Completed Platlist:" + loadedplayList.getPlaylistName());
        }
    }

    public void enqueNext(Song song){
        playStrategy.addtoNext(song);
    }
}
