package ca.cal.bibliotheque.model.Document;

public class CD extends Documents {
    private final String genreMusique;
    private final String compositeur;
    private final String interprete;

    public CD(String etatDocument, String titre, String auteur, String editeur, int anneePublication, String genreMusique, String compositeur, String interprete) {
        super(Documents.C_CD, etatDocument, titre, auteur, editeur, anneePublication);
        this.genreMusique = genreMusique;
        this.compositeur = compositeur;
        this.interprete = interprete;
    }

    public String getGenreMusique() {
        return genreMusique;
    }

    public String getCompositeur() {
        return compositeur;
    }

    public String getInterprete() {
        return interprete;
    }

    @Override
    public String toString() {
        return "CD{" +
                "genreMusique='" + genreMusique + '\'' +
                ", compositeur='" + compositeur + '\'' +
                ", interprete='" + interprete + '\'' +
                '}';
    }
}
