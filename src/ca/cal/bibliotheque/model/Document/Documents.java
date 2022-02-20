package ca.cal.bibliotheque.model.Document;

public class Documents {
    private final Object genreDocument;//livre, CD, DVD
    private final String etatDocument;//disponible, emprunte
    private final String titre;
    private final String auteur;
    private final String editeur;
    private final int anneePublication;

    public Documents(Object genreDocument, String etatDocument, String titre, String auteur, String editeur, int anneePublication) {
        this.genreDocument = genreDocument;
        this.etatDocument = etatDocument;
        this.titre = titre;
        this.auteur = auteur;
        this.editeur = editeur;
        this.anneePublication = anneePublication;
    }

    public Object getGenreDocument() {
        return genreDocument;
    }

    public String getEtatDocument() {
        return etatDocument;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getEditeur() {
        return editeur;
    }

    public int getAnneePublication() {
        return anneePublication;
    }

    @Override
    public String toString() {
        return "Documents{" +
                "genreDocument=" + genreDocument +
                ", etatDocument='" + etatDocument + '\'' +
                ", titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", editeur='" + editeur + '\'' +
                ", anneePublication=" + anneePublication +
                '}';
    }
}
