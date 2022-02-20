package ca.cal.bibliotheque.model;

public class Livre extends Documents {
    private final long id;
    private final int nbrPages;
    private final String genreLivre;//roman, manuel scolaire, étude, magazine

    public Livre(Documents documents, int nbrPages, String genreLivre) {
        super(documents);
        this.id = documents.getId();
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
                getDocument().toStringDocument() + '\n' +
                "nbrPages=" + nbrPages +
                ", genreLivre='" + genreLivre + '\'' +
                '}';
    }
}
