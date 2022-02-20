package ca.cal.bibliotheque.model;

public class CD extends Documents {
    private final long id;
    private final String genreMusique;
    private final String compositeur;
    private final String interprete;

    public CD(String titre, String auteur, String editeur, int anneePublication, long id, String genreMusique, String compositeur, String interprete) {
        super(id, Documents.C_CD, titre, auteur, editeur, anneePublication);
        this.id = id;
        this.genreMusique = genreMusique;
        this.compositeur = compositeur;
        this.interprete = interprete;
    }

    public long getId() {
        return id;
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
