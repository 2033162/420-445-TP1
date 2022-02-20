package ca.cal.bibliotheque.model.Document;

public class EmpruntDocuments {
    private final String dateInitial;
    private final String dateExpire;
    private final int nbrRappel;

    public EmpruntDocuments(String dateInitial, String dateExpire, int nbrRappel) {
        this.dateInitial = dateInitial;
        this.dateExpire = dateExpire;
        this.nbrRappel = nbrRappel;
    }

    public String getDateInitial() {
        return dateInitial;
    }

    public String getDateExpire() {
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
