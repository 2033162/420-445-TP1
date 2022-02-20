package ca.cal.bibliotheque.model.Document;

public class Livre extends Documents {
    private final int nbrPages;
    private final String genreLivre;//roman, manuel scolaire, étude, magazine

    public Livre(String titre, String auteur, String editeur, int anneePublication, int nbrPages, String genreLivre) {
        super(Documents.C_LIVRE, titre, auteur, editeur, anneePublication);
        this.nbrPages = nbrPages;
        this.genreLivre = genreLivre;
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
