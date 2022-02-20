package ca.cal.bibliotheque.model;

public class DVD extends Documents {
    private final long id;
    private final int duree;
    private final String genreFilm;

    public DVD(String titre, String auteur, String editeur, int anneePublication, long id, int duree, String genreFilm) {
        super(id, Documents.C_DVD, titre, auteur, editeur, anneePublication);
        this.id = id;
        this.duree = duree;
        this.genreFilm = genreFilm;
    }

    @Override
    public long getId() {
        return id;
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
