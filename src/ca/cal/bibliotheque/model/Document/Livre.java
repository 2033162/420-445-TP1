package ca.cal.bibliotheque.model.Document;

public class Livre {
    private final int nbrPages;
    private final String genreLivre;//roman, manuel scolaire, étude, magazine

    public Livre(int nbrPages, String genreLivre) {
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
