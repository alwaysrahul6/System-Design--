package DESIGN_PATTERN.SANGEET.models;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
    private String playlistName;

    private List<Song> songList;

    public String getPlaylistName() {
        return playlistName;
    }

    public List<Song> getSong() {
        return songList;
    }

  public void addToSong(Song song){
        if (song == null){
            throw new RuntimeException("Cannot add null song to Playlist");
        }
        songList.add(song);
  }

    public PlayList(String name){
       this.playlistName = name;
       this.songList = new ArrayList<>();
   }

    public void addSongToPlaylist(Song song) {
        if (song == null){
            throw new RuntimeException("Cannot add null Song:");
        }
        songList.add(song);
    }

    public int getSize(){
        return songList.size();
    }
}
