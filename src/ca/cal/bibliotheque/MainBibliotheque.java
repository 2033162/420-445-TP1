package ca.cal.bibliotheque;

import ca.cal.bibliotheque.model.Clients;
import ca.cal.bibliotheque.model.Documents;
import ca.cal.bibliotheque.model.EtatDocument;
import ca.cal.bibliotheque.service.ServiceClient;
import ca.cal.bibliotheque.service.ServiceDocuments;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class MainBibliotheque {

    public static void main(String[] args) throws ParseException {
        //JDBCCreateDB.createDatabase();

        var client = new Clients(2,
                "John",
                "Smith",
                "daragon",
                "montreal",
                "H05C42",
                "514-900-5698",
                new SimpleDateFormat("dd/MM/yyyy").parse("20/02/2022"),
                0);
        ServiceClient serviceClient = new ServiceClient();
        serviceClient.enregistrer(client);
        var client2 = serviceClient.getClient(2L);
        System.out.println(client2);



        var document = new Documents(1,
                EtatDocument.DISPONIBLE,
                Documents.C_LIVRE,
                "harry potter",
                "JK. Rolling",
                "maison edition",
                1900);
        ServiceDocuments serviceDocuments = new ServiceDocuments();
        serviceDocuments.enregistrer(document);
        var document2 = serviceDocuments.getDocument(1L);
        System.out.println(document2);
    }
}