package md.leonidbars.springapp.genres;

import md.leonidbars.springapp.Music;

import java.util.ArrayList;
import java.util.List;

public class CountryMusic implements Music {

    private List<String> countrySongs = new ArrayList<>();

    {
        countrySongs.add("Kane Brown - Like I Love Country Music");
        countrySongs.add("Luke Combs - Better Together");
        countrySongs.add("Ryan Hurd With Maren Morris - Chasing After You");
    }

    @Override
    public List<String> getSongs() {
        return countrySongs;
    }
}
