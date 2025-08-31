package DESIGN_PATTERN.SANGEET.manager;

import DESIGN_PATTERN.SANGEET.models.PlayList;
import DESIGN_PATTERN.SANGEET.models.Song;

import java.util.HashMap;

public class PlaylistManger {
    private static PlaylistManger instance;

    private final HashMap<String, PlayList> playlist;

    public PlaylistManger() {
        this.playlist = new HashMap<>();
    }

    public static synchronized PlaylistManger getInstance(){
        if (instance == null){
            instance = new PlaylistManger();
        }
        return instance;
    }

    public void createPlaylist(String name){
        if (playlist.containsKey(name)){
            throw new RuntimeException("Playlist is Already Exits");
        }
        playlist.put(name , new PlayList(name));
    }

    public void addSongToPlaylist(String playlistName, Song song) {
        if (!playlist.containsKey(playlistName)) {
            throw new RuntimeException("Playlist \"" + playlistName + "\" not found.");
        }
        playlist.get(playlistName).addSongToPlaylist(song);
    }

    public PlayList getPlaylist(String listName){
        if (!playlist.containsKey(listName)){
            throw new RuntimeException("Playlist Not Found: ");
        }
        return playlist.get(listName);
    }
}
