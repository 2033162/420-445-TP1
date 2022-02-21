package ca.cal.bibliotheque;

import ca.cal.bibliotheque.model.*;
import ca.cal.bibliotheque.service.*;

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
                1);
        ServiceClient serviceClient = new ServiceClient();
        serviceClient.enregistrer(client);
        var client2 = serviceClient.getClient(1L);
        System.out.println(client2);

        /*client.setRue("rancour");
        serviceClient.modification(client);
        var client3 = serviceClient.getClient(6L);
        System.out.println(client3);*/



        /*var document = new Documents(31,
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
        var cd2 = serviceCD.getCD(31L);
        System.out.println(cd2);

        cd.setInterprete("JK. Rolling");
        serviceCD.modification(cd);
        var cd3 = serviceCD.getCD(31L);
        System.out.println(cd3);*/



        /*var document2 = new Documents(20,
                EtatDocument.ENDOMMAGE,
                Documents.C_DVD,
                "bobby bob",
                "lilo lee",
                "edition bop",
                2018);

        var dvd = new DVD(document2,
                44,
                "drame");
        ServiceDVD serviceDVD = new ServiceDVD();
        serviceDVD.enregistrer(dvd);
        var dvd2 = serviceDVD.getDVD(20L);
        System.out.println(dvd2);

        dvd.setGenreFilm("Horreur");
        serviceDVD.modification(dvd);
        var dvd3 = serviceDVD.getDVD(20L);
        System.out.println(dvd3);*/



        var document3 = new Documents(1,
                EtatDocument.EMPRUNTE,
                Documents.C_LIVRE,
                "avengers",
                "Josh whedon",
                "marvel",
                2020);

        var livre = new Livre(document3,
                230,
                "Roman");
        ServiceLivre serviceLivre = new ServiceLivre();
        serviceLivre.enregistrer(livre);
        var livre2 = serviceLivre.getLivre(1L);
        System.out.println(livre2);

        livre.setAnneePublication(2002);
        serviceLivre.modification(livre);
        var livre3 = serviceLivre.getLivre(1L);
        System.out.println(livre3);



        /*var employe = new Employe(10,
                "bernadette",
                "carmier",
                Fonction.GESTIONNAIRE);
        ServiceEmploye serviceEmploye = new ServiceEmploye();
        serviceEmploye.enregistrer(employe);
        var employe2 = serviceEmploye.getEmploye(10L);
        System.out.println(employe2);*/

        /*employe.setFonction(Fonction.PREPOSE);
        serviceEmploye.modification(employe);
        var employe3 = serviceEmploye.getEmploye(2L);
        System.out.println(employe3);*/



        /*var reservation = new Reservation(3,
                new SimpleDateFormat("dd/MM/yyyy").parse("05/10/2000"),
                client,
                document3);
        ServiceReservation serviceReservation = new ServiceReservation();
        serviceReservation.faireReservation(reservation);
        var reservation2 = serviceReservation.getReservation(3L);
        System.out.println(reservation2);*/

        /*employe.setFonction(Fonction.PREPOSE);
        serviceEmploye.modification(employe);
        var employe3 = serviceEmploye.getEmploye(2L);
        System.out.println(employe3);*/

        /*reservation.setDateReservation(new SimpleDateFormat("dd/MM/yyyy").parse("15/03/2000"));
        serviceReservation.modification(reservation);
        var reservation3 = serviceReservation.getReservation(3L);
        System.out.println(reservation3);*/



        /*var empruntDocument = new EmpruntDocuments(1,
                new SimpleDateFormat("dd/MM/yyyy").parse("15/03/2018"),
                new SimpleDateFormat("dd/MM/yyyy").parse("04/01/2022"),
                2,
                client,
                document3);
        ServiceEmpruntDocuments serviceEmpruntDocuments = new ServiceEmpruntDocuments();
        serviceEmpruntDocuments.enregistrer(empruntDocument);
        var empruntDocument2 = serviceEmpruntDocuments.getEmpruntDocument(1L);
        System.out.println(empruntDocument2);*/

        /*empruntDocument.setNbrRappel(4);
        serviceEmpruntDocuments.modification(empruntDocument);
        var empruntDocument3 = serviceEmpruntDocuments.getEmpruntDocument(1L);
        System.out.println(empruntDocument3);*/
    }
}