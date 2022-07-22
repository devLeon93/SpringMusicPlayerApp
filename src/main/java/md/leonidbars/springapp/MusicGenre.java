package md.leonidbars.springapp;

public enum MusicGenre {

    CLASSICAL(1), ROCK(2), RAP(3);

    private int idGenre;

    MusicGenre(int idGenre) {
        this.idGenre = idGenre;
    }

}
