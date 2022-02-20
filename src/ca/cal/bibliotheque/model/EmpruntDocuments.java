package ca.cal.bibliotheque.model;

import java.util.Date;

public class EmpruntDocuments {
    private final Date dateInitial;
    private final Date dateExpire;
    private final int nbrRappel;

    public EmpruntDocuments(Date dateInitial, Date dateExpire, int nbrRappel) {
        this.dateInitial = dateInitial;
        this.dateExpire = dateExpire;
        this.nbrRappel = nbrRappel;
    }

    public Date getDateInitial() {
        return dateInitial;
    }

    public Date getDateExpire() {
        return dateExpire;
    }

    public int getNbrRappel() {
        return nbrRappel;
    }

    public Documents retournerDocument() {
        return null;
    }

    public boolean verifierDateRetour() {
        return false;
    }

    public void renouvellementEmprunt() {}
}
