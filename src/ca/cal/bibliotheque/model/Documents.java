package ca.cal.bibliotheque.model;

public class Documents {
    public static final String C_LIVRE = "livre";
    public static final String C_CD = "CD";
    public static final String C_DVD = "DVD";

    private final String genreDocument;//livre, CD, DVD
    private EtatDocument etatDocument;//disponible, emprunte
    private final String titre;
    private final String auteur;
    private final String editeur;
    private final int anneePublication;

    public Documents(String genreDocument, String titre, String auteur, String editeur, int anneePublication) {
        this.genreDocument = genreDocument;
        this.etatDocument = EtatDocument.DISPONIBLE;
        this.titre = titre;
        this.auteur = auteur;
        this.editeur = editeur;
        this.anneePublication = anneePublication;
    }

    public Object getGenreDocument() {
        return genreDocument;
    }

    public EtatDocument getEtatDocument() {
        return etatDocument;
    }

    public void setEtatDocument(EtatDocument etatDocument) {
        this.etatDocument = etatDocument;
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
