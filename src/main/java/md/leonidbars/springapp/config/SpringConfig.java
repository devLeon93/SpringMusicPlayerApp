package md.leonidbars.springapp.config;

import md.leonidbars.springapp.Music;
import md.leonidbars.springapp.MusicPlayer;
import md.leonidbars.springapp.genres.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public RapMusic rapMusic() {
        return new RapMusic();
    }

    @Bean
    public BluesMusic bluesMusic() {
        return new BluesMusic();
    }

    @Bean
    public JazzMusic jazzMusic() {
        return new JazzMusic();
    }

    @Bean
    public CountryMusic countryMusic() {
        return new CountryMusic();
    }

    @Bean
    public List<Music> musicGenreList() {
        return Arrays.asList(
                classicalMusic(),
                rockMusic(),
                rapMusic(),
                bluesMusic(),
                jazzMusic(),
                countryMusic());
    }

    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(musicGenreList());
    }


}
