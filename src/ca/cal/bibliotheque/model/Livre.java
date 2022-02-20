package ca.cal.bibliotheque.model;

public class Livre extends Documents {
    private final long id;
    private final int nbrPages;
    private final String genreLivre;//roman, manuel scolaire, étude, magazine

    public Livre(String titre, String auteur, String editeur, int anneePublication, long id, int nbrPages, String genreLivre) {
        super(id, Documents.C_LIVRE, titre, auteur, editeur, anneePublication);
        this.id = id;
        this.nbrPages = nbrPages;
        this.genreLivre = genreLivre;
    }

    @Override
    public long getId() {
        return id;
    }

    public int getNbrPages() {
        return nbrPages;
    }

    public String getGenreLivre() {
        return genreLivre;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "nbrPages=" + nbrPages +
                ", genreLivre='" + genreLivre + '\'' +
                '}';
    }
}
