package ca.cal.bibliotheque.model;

public class Employe {
    private final long id;
    private final String nom;
    private final String prenom;
    private final Fonction fonction;

    public Employe(long id, String nom, String prenom, Fonction fonction) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.fonction = fonction;
    }

    public long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Fonction getFonction() {
        return fonction;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", fonction=" + fonction +
                '}';
    }
}
