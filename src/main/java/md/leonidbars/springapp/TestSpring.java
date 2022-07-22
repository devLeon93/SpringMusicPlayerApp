package md.leonidbars.springapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

       MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
      // musicPlayer.playMusicSongs(MusicGenre.CLASSICAL);
        musicPlayer.playMusicSongs( MusicGenre.ROCK);

        System.out.println("Brand name your music player : " + musicPlayer.getBrandName());
        System.out.println("Volume now is " + musicPlayer.getVolume());

    }

}
