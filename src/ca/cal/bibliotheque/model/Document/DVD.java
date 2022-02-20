package ca.cal.bibliotheque.model.Document;

public class DVD extends Documents {
    private final int duree;
    private final String genreFilm;

    public DVD(String etatDocument, String titre, String auteur, String editeur, int anneePublication, int duree, String genreFilm) {
        super(Documents.C_DVD, etatDocument, titre, auteur, editeur, anneePublication);
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
