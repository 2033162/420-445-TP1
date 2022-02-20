package ca.cal.bibliotheque;

import ca.cal.bibliotheque.model.CD;
import ca.cal.bibliotheque.model.Clients;
import ca.cal.bibliotheque.model.Documents;
import ca.cal.bibliotheque.model.EtatDocument;
import ca.cal.bibliotheque.persistance.DB.JDBCCreateDB;
import ca.cal.bibliotheque.service.ServiceCD;
import ca.cal.bibliotheque.service.ServiceClient;
import ca.cal.bibliotheque.service.ServiceDocuments;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class MainBibliotheque {

    public static void main(String[] args) throws ParseException {
        //JDBCCreateDB.createDatabase();

        var client = new Clients(1,
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
        var client2 = serviceClient.getClient(1L);
        System.out.println(client2);



        var document = new Documents(1,
                EtatDocument.DISPONIBLE,
                Documents.C_CD,
                "harry potter",
                "JK. Rolling",
                "maison edition",
                2000);

        var cd = new CD(document,
                "classique",
                "JK. Rolling",
                "maison edition");
        ServiceCD serviceCD = new ServiceCD();
        serviceCD.enregistrer(cd);
        var cd2 = serviceCD.getCD(1L);
        System.out.println(cd2);
    }
}