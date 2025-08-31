package DESIGN_PATTERN.SANGEET.strategies;

import DESIGN_PATTERN.SANGEET.models.PlayList;
import DESIGN_PATTERN.SANGEET.models.Song;

public interface PlayStrategy {
    void setPlaylist(PlayList playlist);
    Song next();
    boolean hasnext();
    boolean hasprevious();
    Song previous();
    default void addtoNext(Song song){};
}
