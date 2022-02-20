package ca.cal.bibliotheque.service;

import ca.cal.bibliotheque.model.Livre;
import ca.cal.bibliotheque.persistance.CRUD.JDBCLivreH2;

public class ServiceLivre {
    public void enregistrer(Livre livre) {
        new JDBCLivreH2().enregistrer(livre);
    }

    public Livre getLivre(long livreId) {
        return new JDBCLivreH2().getLivre(livreId);
    }
}
