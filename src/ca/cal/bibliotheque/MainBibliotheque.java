package ca.cal.bibliotheque;

import ca.cal.bibliotheque.model.Clients;
import ca.cal.bibliotheque.service.ServiceClient;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Locale;

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
    }
}