package md.leonidbars.springapp.genres;

import md.leonidbars.springapp.Music;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BluesMusic implements Music {

    private List<String> bluesSongs = new ArrayList<>();

    {
        bluesSongs.add("Junior Kimbo - Do the Romp");
        bluesSongs.add("Bi Bi King - The Thrill is Gone");
        bluesSongs.add("Robert Johnson - Hellhound on My Trail");
    }


    @Override
    public List<String> getSongs() {
        return bluesSongs;
    }
}
