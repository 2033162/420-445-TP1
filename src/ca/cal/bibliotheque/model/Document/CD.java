package ca.cal.bibliotheque.model.Document;

public class CD {
    private final String genreMusique;
    private final String compositeur;
    private final String interprete;

    public CD(String genreMusique, String compositeur, String interprete) {
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
