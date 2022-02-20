package ca.cal.bibliotheque.persistance;

import ca.cal.bibliotheque.model.DVD;

public interface JDBCDVD {
    void enregistrer(DVD dvd);
    DVD getDVD(long dvdId);
}
