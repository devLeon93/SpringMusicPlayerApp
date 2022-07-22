package md.leonidbars.springapp.genres;

import md.leonidbars.springapp.Music;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {

    private List<String> rockSongs = new ArrayList<>();

    {
        rockSongs.add("Linkin Park - New Divide");
        rockSongs.add("Drowning Pool - Bodies");
        rockSongs.add("Disturbed - Decadence");
    }

    @Override
    public List<String> getSongs() {
        return rockSongs;
    }
}
