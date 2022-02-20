package ca.cal.bibliotheque.model.Document;

public class Fonction {
    private final String nomFonction;
    private final boolean gestionnaire;

    public Fonction(String nomFonction, boolean gestionnaire) {
        this.nomFonction = nomFonction;
        this.gestionnaire = gestionnaire;
    }

    public String getNomFonction() {
        return nomFonction;
    }

    public boolean isGestionnaire() {
        return gestionnaire;
    }

    @Override
    public String toString() {
        return "Fonction{" +
                "nomFonction='" + nomFonction + '\'' +
                ", gestionnaire=" + gestionnaire +
                '}';
    }
}
