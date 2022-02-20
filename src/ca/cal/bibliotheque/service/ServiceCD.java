package ca.cal.bibliotheque.service;

import ca.cal.bibliotheque.model.CD;
import ca.cal.bibliotheque.persistance.CRUD.JDBCCDH2;

public class ServiceCD {
    public void enregistrer(CD cd) {
        new JDBCCDH2().enregistrer(cd);
    }

    public CD getCD(long cdId) {
        return new JDBCCDH2().getCD(cdId);
    }
}
