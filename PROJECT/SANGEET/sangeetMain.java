package DESIGN_PATTERN.SANGEET;

import DESIGN_PATTERN.SANGEET.enums.DeviceType;
import DESIGN_PATTERN.SANGEET.enums.PlayStratgeyType;

public class sangeetMain {
    public static void main(String[] args) {
        try {
            MusicPlayerApplication application = new MusicPlayerApplication();

            // Populate library
            application.createSonglibrary("Kesariya", "Arijit Singh", "/music/kesariya.mp3");
            application.createSonglibrary("Chaiyya Chaiyya", "Sukhwinder Singh", "/music/chaiyya_chaiyya.mp3");
            application.createSonglibrary("Tum Hi Ho", "Arijit Singh", "/music/tum_hi_ho.mp3");
            application.createSonglibrary("Jai Ho", "A. R. Rahman", "/music/jai_ho.mp3");
            application.createSonglibrary("Zinda", "Siddharth Mahadevan", "/music/zinda.mp3");

            // Create playlist and add songs
            application.createPlaylist("Bollywood Vibes");
            application.addSongtoPlaylist("Bollywood Vibes", "Kesariya");
            application.addSongtoPlaylist("Bollywood Vibes", "Chaiyya Chaiyya");
            application.addSongtoPlaylist("Bollywood Vibes", "Tum Hi Ho");
            application.addSongtoPlaylist("Bollywood Vibes", "Jai Ho");

            // Connect device
            application.connectAudioDevice(DeviceType.BLUETOOTH);

            //Play/pause a single song
            application.playSingleSong("Zinda");
            application.pauseCurrentSong("Zinda");
            application.playSingleSong("Zinda");  // resume

            System.out.println("\n-- Sequential Playback --\n");
            application.selectStrategy(PlayStratgeyType.SEQUENTIAL);
            application.loadPlaylist("Bollywood Vibes");
            application.playAlltrackInPlaylist();

            System.out.println("\n-- Random Playback --\n");
            application.selectStrategy(PlayStratgeyType.RANDOM);
            application.loadPlaylist("Bollywood Vibes");
            application.playAlltrackInPlaylist();

            System.out.println("\n-- Custom Queue Playback --\n");
            application.selectStrategy(PlayStratgeyType.CUSTOM);
            application.loadPlaylist("Bollywood Vibes");
            application.queueSongNext("Kesariya");
            application.queueSongNext("Tum Hi Ho");
            application.playAlltrackInPlaylist();

            System.out.println("\n-- Play Previous in Sequential --\n");
            application.selectStrategy(PlayStratgeyType.SEQUENTIAL);
            application.loadPlaylist("Bollywood Vibes");
            application.playAlltrackInPlaylist();

            application.playpreviousTrack();
            application.playpreviousTrack();

        } catch (Exception error) {
            System.err.println("Error: " + error.getMessage());
        }
    }
    }
