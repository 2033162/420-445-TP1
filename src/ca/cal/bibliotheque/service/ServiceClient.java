package ca.cal.bibliotheque.service;

import ca.cal.bibliotheque.model.Clients;
import ca.cal.bibliotheque.persistance.JDBCClientH2;

public class ServiceClient {
    public void enregistrer(Clients clients) {
        JDBCClientH2.enregistrer(clients);
    }

    public Clients getClient(long clientId) {
        return JDBCClientH2.getClients(clientId);
    }
}