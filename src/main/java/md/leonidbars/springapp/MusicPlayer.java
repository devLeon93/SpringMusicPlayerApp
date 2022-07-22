package md.leonidbars.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import java.util.List;
import java.util.Random;

public class MusicPlayer {

    private List<Music> musicGenreList;

    @Autowired
    public MusicPlayer(List<Music> musicGenreList) {
        this.musicGenreList = musicGenreList;
    }

    @Value("${musicPlayer.brandName}")
    private String brandName;
    @Value("${musicPlayer.volume}")
    private int volume;



  public String playMusicSongs() {
        Random random = new Random();
      return "Playing: " + musicGenreList.get(random.nextInt(musicGenreList.size())).getSongs()
              + " with volume " + this.volume;

    }

}
