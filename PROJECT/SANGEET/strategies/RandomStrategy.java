package DESIGN_PATTERN.SANGEET.strategies;

import DESIGN_PATTERN.SANGEET.models.PlayList;
import DESIGN_PATTERN.SANGEET.models.Song;

import java.util.*;

public class RandomStrategy implements PlayStrategy{
    private PlayList currPlaylist;
    private Random random;
    private Stack<Song>history;
    private List<Song> remainingSong;

    public RandomStrategy() {
      currPlaylist = null;
      random = new Random();
    }

    @Override
    public void setPlaylist(PlayList playlist) {
        currPlaylist = playlist;
        if (currPlaylist == null && currPlaylist.getSize() <= 0)return;
        remainingSong = new ArrayList<>(currPlaylist.getSong());
        history = new Stack<>();
    }


    @Override
    public boolean hasnext() {
       return currPlaylist != null && !remainingSong.isEmpty();
    }

    @Override
    public boolean hasprevious() {
        return !history.isEmpty();
    }

    @Override
    public Song previous() {
        if (history.isEmpty()){
            throw new RuntimeException("No Song Left");
        }

        return history.pop();
    }

    public Song next(){
        if (currPlaylist == null){
           throw new RuntimeException("PlayList is Empty");
        }
        if (remainingSong.isEmpty()){
            throw new RuntimeException("No Left Remaining Song:");
        }

        int idx = random.nextInt(remainingSong.size());
        Song selectedSong = remainingSong.get(idx);

        int lastIdx = remainingSong.size()-1;
        remainingSong.set(idx , remainingSong.get(lastIdx));
        remainingSong.removeLast();

        history.push(selectedSong);
        return selectedSong;
    }
}
