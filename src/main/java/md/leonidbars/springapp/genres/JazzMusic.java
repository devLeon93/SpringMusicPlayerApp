package md.leonidbars.springapp.genres;

import md.leonidbars.springapp.Music;

import java.util.ArrayList;
import java.util.List;

public class JazzMusic implements Music {

    private List<String> jazzSongs = new ArrayList<>();

    {
        jazzSongs.add("Soft Jazz - Jazz Instrumental Music");
        jazzSongs.add("Bossa Nova Jazz - Jazz for Study");
        jazzSongs.add("Richard Freeman - Exquisite Mood");
    }

    @Override
    public List<String> getSongs() {
        return jazzSongs;
    }
}
