package ca.cal.bibliotheque.model;

import java.util.Date;

public class EmpruntDocuments {
    private final long id;
    private final Date dateInitial;
    private final Date dateExpire;
    private final int nbrRappel;
    private final Clients client;

    public EmpruntDocuments(long id, Date dateInitial, Date dateExpire, int nbrRappel, Clients client) {
        this.id = id;
        this.dateInitial = dateInitial;
        this.dateExpire = dateExpire;
        this.nbrRappel = nbrRappel;
        this.client = client;
    }

    public long getId() {
        return id;
    }

    public Clients getClient() {
        return client;
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

    @Override
    public String toString() {
        return "EmpruntDocuments{" +
                "id=" + id +
                ", dateInitial=" + dateInitial +
                ", dateExpire=" + dateExpire +
                ", nbrRappel=" + nbrRappel +
                ", client=" + client +
                '}';
    }
}
