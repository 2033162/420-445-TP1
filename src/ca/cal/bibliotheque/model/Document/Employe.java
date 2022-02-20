package ca.cal.bibliotheque.model.Document;

public class Employe {
    private final String nom;
    private final String prenom;
    private final Fonction fonction;

    public Employe(String nom, String prenom, Fonction fonction) {
        this.nom = nom;
        this.prenom = prenom;
        this.fonction = fonction;
    }
}
