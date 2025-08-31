package DESIGN_PATTERN.SANGEET.strategies;

import DESIGN_PATTERN.SANGEET.models.PlayList;
import DESIGN_PATTERN.SANGEET.models.Song;

public class SequentialStrategy implements PlayStrategy{
    private PlayList currplayList;
    private int currIdx;

    public SequentialStrategy() {
        this.currplayList = null;
        this.currIdx = -1;
    }



    @Override
    public void setPlaylist(PlayList playlist) {
        currplayList = playlist;
        currIdx = -1;
    }

    @Override
    public Song next() {
       if (currplayList == null || currplayList.getSize() <= 0){
           throw new RuntimeException("Playlist is Not loaded");
       }
       currIdx = currIdx+1;
       return currplayList.getSong().get(currIdx);
       }

    @Override
    public boolean hasnext() {
        return (currIdx + 1) < currplayList.getSize();
    }

    @Override
    public boolean hasprevious() {
        return (currIdx - 1 > 0);
    }

    @Override
    public Song previous() {
        if (currplayList == null || currplayList.getSize() == 0){
            throw new RuntimeException("PlayList Is Not Found:");
        }
        currIdx = currIdx - 1;
        return currplayList.getSong().get(currIdx);
    }
}
