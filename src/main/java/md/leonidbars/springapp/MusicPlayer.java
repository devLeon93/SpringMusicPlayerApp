package md.leonidbars.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    private RapMusic rapMusic;


    @Value("${musicPlayer.brandName}")
    private String brandName;
    @Value("${musicPlayer.volume}")
    private int volume;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic, RapMusic rapMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.rapMusic = rapMusic;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusicSongs(MusicGenre musicGenre) {
        Random random = new Random();
        int rdNum = random.nextInt(3);
        if (musicGenre == MusicGenre.CLASSICAL) {
            System.out.println("Playing Random song : " + classicalMusic.getSongs().get(rdNum));

        } else if (musicGenre == MusicGenre.ROCK) {
            System.out.println("Playing Random song : " + rockMusic.getSongs().get(rdNum));

        } else {
            System.out.println("Playing Random song : " + rapMusic.getSongs().get(rdNum));
        }
    }

}
