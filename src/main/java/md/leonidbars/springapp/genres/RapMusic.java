package md.leonidbars.springapp.genres;

import md.leonidbars.springapp.Music;


import java.util.ArrayList;
import java.util.List;


public class RapMusic implements Music {

    private List<String> rapSongs = new ArrayList<>();

    {
        rapSongs.add("Eminem - Rap God");
        rapSongs.add("Kendrick Lamar - Silent Hill");
        rapSongs.add("Lil Durk - Petty Too");
    }

    @Override
    public List<String> getSongs() {
        return rapSongs;
    }
}
