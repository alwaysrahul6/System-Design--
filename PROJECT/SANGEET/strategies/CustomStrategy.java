package DESIGN_PATTERN.SANGEET.strategies;

import DESIGN_PATTERN.SANGEET.models.PlayList;
import DESIGN_PATTERN.SANGEET.models.Song;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CustomStrategy implements PlayStrategy {
    private PlayList currentPlaylsit;
    private  int currIdx;
    private Stack<Song> previousSong;
    private Queue<Song> nextQueue;

    public CustomStrategy(){
        this.currIdx = -1;
        this.nextQueue = new LinkedList<>();
        this.previousSong = new Stack<>();
        this.currentPlaylsit = null;
    }

    @Override
    public void setPlaylist(PlayList playlist) {
        currentPlaylsit = playlist;
        currIdx = -1;
        nextQueue.clear();
        previousSong.clear();
    }

    private Song nextSequential(){
        currIdx = currIdx + 1;
       return currentPlaylsit.getSong().get(currIdx);
    }

    private Song previousSequintial(){
        currIdx = currIdx - 1;
        return currentPlaylsit.getSong().get(currIdx);
    }

    @Override
    public Song next() {
        if (!nextQueue.isEmpty()){
            Song curr = nextQueue.poll();
            previousSong.push(curr);
            for (int i = 0; i < currentPlaylsit.getSize(); i++){
                if (currentPlaylsit.getSong().get(i) == curr){
                    currIdx = i;
                    break;
                }
            }
            return curr;

        }
        return nextSequential();
    }

    @Override
    public boolean hasnext() {
        return false;
    }

    @Override
    public boolean hasprevious() {
        return (currIdx - 1 > 0);
    }

    public Song previous() {
        if (currentPlaylsit == null || currentPlaylsit.getSize() == 0) {
            throw new RuntimeException("No playlist loaded or playlist is empty.");
        }

        if (!previousSong.isEmpty()) {
            Song s = previousSong.pop();

            // update index to match stacked song
            for (int i = 0; i < currentPlaylsit.getSong().size(); ++i) {
                if (currentPlaylsit.getSong().get(i) == s) {
                   currIdx = i;
                    break;
                }
            }
            return s;
        }

        // Otherwise sequential
       return previousSequintial();
    }


    @Override
    public void addtoNext(Song song) {
       if (song == null){
           throw  new RuntimeException("Cannot Enqueue null song:");
       }
       nextQueue.add(song);
    }
}
