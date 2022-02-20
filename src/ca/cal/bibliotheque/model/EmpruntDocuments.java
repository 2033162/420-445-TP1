package ca.cal.bibliotheque.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EmpruntDocuments {
    private final long id;
    private final Date dateInitial;
    private final Date dateExpire;
    private final int nbrRappel;
    private final Clients client;
    private final Documents documents;

    public EmpruntDocuments(long id, Date dateInitial, Date dateExpire, int nbrRappel, Clients client, Documents documents) {
        this.id = id;
        this.dateInitial = dateInitial;
        this.dateExpire = dateExpire;
        this.nbrRappel = nbrRappel;
        this.client = client;
        this.documents = documents;
    }

    public long getId() {
        return id;
    }

    public Clients getClient() {
        return client;
    }

    public Documents getDocument() {
        return documents;
    }

    public Date getDateInitial() {
        return dateInitial;
    }

    public Date getDateExpire() {
        return dateExpire;
    }

    public String getDateInitialChaine() {
        return new SimpleDateFormat("yyyy-MM-dd").format(dateInitial);
    }

    public String getDateExpireChaine() {
        return new SimpleDateFormat("yyyy-MM-dd").format(dateExpire);
    }

    public int getNbrRappel() {
        return nbrRappel;
    }

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
