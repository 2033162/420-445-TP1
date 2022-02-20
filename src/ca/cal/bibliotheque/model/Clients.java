package ca.cal.bibliotheque.model;

import java.util.Date;

public class Clients {
    private final String nom;
    private final String prenom;
    private final String rue;
    private final String ville;
    private final String codePostal;
    private final String numeroTelephone;
    private final Date dateInscription;
    private final int nbrEmpruntEnCour;

    public Clients(String nom, String prenom, String rue, String ville, String codePostal, String numeroTelephone, Date dateInscription, int nbrEmpruntEnCour) {
        this.nom = nom;
        this.prenom = prenom;
        this.rue = rue;
        this.ville = ville;
        this.codePostal = codePostal;
        this.numeroTelephone = numeroTelephone;
        this.dateInscription = dateInscription;
        this.nbrEmpruntEnCour = nbrEmpruntEnCour;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getRue() {
        return rue;
    }

    public String getVille() {
        return ville;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public String getNumeroTelephone() {
        return numeroTelephone;
    }

    public Date getDateInscription() {
        return dateInscription;
    }

    public int getNbrEmpruntEnCour() {
        return nbrEmpruntEnCour;
    }

    @Override
    public String toString() {
        return "Clients{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", rue='" + rue + '\'' +
                ", ville='" + ville + '\'' +
                ", codePostal='" + codePostal + '\'' +
                ", numeroTelephone='" + numeroTelephone + '\'' +
                ", dateInscription='" + dateInscription + '\'' +
                ", nbrEmpruntEnCour=" + nbrEmpruntEnCour +
                '}';
    }
}
