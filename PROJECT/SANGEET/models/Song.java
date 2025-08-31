package DESIGN_PATTERN.SANGEET.models;

public class Song {
   private String title;

   private String artist;

   private String path;

   public Song(String title, String path, String artist) {
      this.title = title;
      this.path = path;
      this.artist = artist;
   }

   public String getPath() {
      return path;
   }

   public void setPath(String path) {
      this.path = path;
   }

   public String getArtist() {
      return artist;
   }

   public void setArtist(String artist) {
      this.artist = artist;
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }
}
