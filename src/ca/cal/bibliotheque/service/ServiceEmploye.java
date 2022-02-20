package ca.cal.bibliotheque.service;

import ca.cal.bibliotheque.model.Employe;
import ca.cal.bibliotheque.persistance.CRUD.JDBCEmployeH2;

public class ServiceEmploye {
    public void enregistrer(Employe employe) {
        new JDBCEmployeH2().enregistrer(employe);
    }

    public Employe getEmploye(long employeId) {
        return new JDBCEmployeH2().getEmploye(employeId);
    }
}
