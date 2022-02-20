package ca.cal.bibliotheque.persistance;

import ca.cal.bibliotheque.model.Livre;

public interface JDBCLivre {
    void enregistrer(Livre livre);
    Livre getLivre(long livreId);
}
