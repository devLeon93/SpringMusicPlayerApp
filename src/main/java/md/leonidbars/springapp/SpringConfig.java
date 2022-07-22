package md.leonidbars.springapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("md.leonidbars.springapp")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    /*Inject dependence manual without @ComponentScan annotation

    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean
    public RapMusic rapMusic(){
        return new RapMusic();
    }

    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(classicalMusic(), rockMusic(), rapMusic());
    }


     */


}
