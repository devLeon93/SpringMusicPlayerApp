package md.leonidbars.springapp.genres;

import md.leonidbars.springapp.Music;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {

    private List<String> classicalSongs = new ArrayList<>();

    {
        classicalSongs.add("Beethoven – Piano Sonata nr.15 in D major");
        classicalSongs.add("Mozart – Eine Kleine Nachtmusik – Serenade in G major");
        classicalSongs.add("Vivaldi – Concerto for Mandolin and Strings in D");
    }

    @Override
    public List<String> getSongs() {
        return classicalSongs;
    }
}
