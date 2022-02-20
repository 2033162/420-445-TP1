package ca.cal.bibliotheque.model.Document;

public class DVD {
    private final int duree;
    private final String genreFilm;

    public DVD(int duree, String genreFilm) {
        this.duree = duree;
        this.genreFilm = genreFilm;
    }

    public int getDuree() {
        return duree;
    }

    public String getGenreFilm() {
        return genreFilm;
    }

    @Override
    public String toString() {
        return "DVD{" +
                "duree=" + duree +
                ", genreFilm='" + genreFilm + '\'' +
                '}';
    }
}
