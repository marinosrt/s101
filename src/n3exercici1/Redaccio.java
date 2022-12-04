package n3exercici1;

import java.util.ArrayList;

import static n3exercici1.Tools.getInt;
import static n3exercici1.Tools.getString;
import static n3exercici1.Tools.getIndexRedactor;
import static n3exercici1.Tools.getIndexNew;

/*A la classe principal s’ha de fer un menú amb les següents opcions:

1.- Introduir redactor.

2.- Eliminar redactor.

3.- Introduir notícia a un redactor.

4.- Eliminar notícia (ha de demanar redactor i titular de la notícia).

5.- Mostrar totes les notícies per redactor.

6.- Calcular puntuació de la notícia.

7.- Calcular preu-notícia.*/

public class Redaccio {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        menu();
    }

    public static void menu() {

        ArrayList<Redactor> llistaRedactors = new ArrayList<Redactor>();

        int klk = -1, indexRedactor;
        String nomRedactor;


        do {

            System.out.println("\nQue vols fer?\n"
                    + "0. Sortir del programa.\n"
                    + "1. Introduir redactor.\n"
                    + "2. Eliminar redactor.\n"
                    + "3. Introduir noticia a un redactor.\n"
                    + "4. Eliminar noticia.\n"
                    + "5. Mostrar totes les noticies per redactor.\n"
                    + "6. Calcular puntuació de la noticia.\n"
                    + "7. Calcular preu de la noticia.");
            klk = getInt("Tria una opcio.\n");

            switch (klk) {
                case 0: // SORTIR DEL PROGRAMA
                    break;
                case 1: // INTRO REDACTOR
                    createRedactor(llistaRedactors);
                    break;
                case 2: // ELIMINAR REDACTOR
                    deleteRedactor(
                            getIndexRedactor(getString("\nCom es diu el redactor que vols eliminar?"), llistaRedactors),
                            llistaRedactors);
                    break;
                case 3: // INTRO. NOTICIA A REDACTOR
                    addNewsToRedactor(
                            getIndexRedactor(getString("\nCom es diu el redactor que ha fet la noticia?"), llistaRedactors),
                            llistaRedactors);
                    break;
                case 4: // ELIMINAR NOTICIA
                    removeNew(
                            (indexRedactor = getIndexRedactor(getString("\nCom es diu el redactor que ha fet la noticia?"),
                                    llistaRedactors)),
                            getIndexNew(indexRedactor, getString("Com es diu la noticia?"), llistaRedactors),
                            llistaRedactors);
                    break;
                case 5: // MOSTRAR TOTES NOTICIES REDACTOR
                    showNews(getIndexRedactor((nomRedactor = getString("\nCom es diu el redactor del que vols veure les noticies?")),
                            llistaRedactors), nomRedactor, llistaRedactors);
                case 6: // CALCULAR PUNTUACIO NOTICIA
                    calculateNewsPunctuation(
                            (indexRedactor = getIndexRedactor(getString("\nCom es diu el redactor que ha fet la noticia?"),
                                    llistaRedactors)),
                            getIndexNew(indexRedactor, getString("Com es diu la noticia?"), llistaRedactors),
                            llistaRedactors);
                    break;
                case 7: // CALCULAR PREU NOTICIA

                    calculateNewsPrice(
                            (indexRedactor = getIndexRedactor(getString("\nCom es diu el redactor que ha fet la noticia?"),
                                    llistaRedactors)),
                            getIndexNew(indexRedactor, getString("Com es diu la noticia?"), llistaRedactors),
                            llistaRedactors);
                    break;
                default:
                    System.out.println("\nOpcio no disponible");
            }

        } while (klk != 0);

    }

    static void createRedactor(ArrayList<Redactor> llistaRedactors) {
        llistaRedactors.add(new Redactor(getString("Com es diu el Redactor?"), getString("Quin es el seu DNI?")));
        System.out.println("\nRedactor creat amb exit.");

    }

    static void deleteRedactor(int indexRedactor, ArrayList<Redactor> llistaRedactors) {

        if (indexRedactor != -1) {
            llistaRedactors.remove(indexRedactor);
            System.out.println("\nRedactor eliminat amb exit.");
        } else {
            System.out.println("\nAquest redactor no està a les nostres bases.");
        }

    }

    static void addNewsToRedactor(int indexRedactor, ArrayList<Redactor> llistaRedactors) {

        String klk;

        if (indexRedactor != -1) {

            klk = getString("\nVols crear una noticia de futbol, basquet, tenis, f1 o de motociclisme?");

            switch (klk.toUpperCase()) {
                case ("FUTBOL"):
                    llistaRedactors.get(indexRedactor)
                            .addNews(new Futbol(getString("\nQuin es el titol de la noticia?"),
                                    getString("De quina lliga parla?"), getString("De quin club parla?"),
                                    getString("De quin jugador parla?")));
                    break;
                case "BASQUET":
                    llistaRedactors.get(indexRedactor).addNews(new Basquet(getString("\nQuin es el titol de la noticia?"),
                            getString("De quina lliga parla?"), getString("De quin club parla?")));
                    break;
                case "TENIS":
                    llistaRedactors.get(indexRedactor).addNews(
                            new Tenis(getString("\nQuin es el titol de la noticia?"), getString("De quina lliga parla?")));
                    break;
                case "F1":
                    llistaRedactors.get(indexRedactor).addNews(
                            new F1(getString("\nQuin es el titol de la noticia?"), getString("De quina escuderia parla?")));
                    break;
                case "MOTOCICLISME":
                    llistaRedactors.get(indexRedactor).addNews(new Motociclisme(
                            getString("\nQuin es el titol de la noticia?"), getString("De quin equip parla?")));
                    break;
                default:
                    System.out.println("\nNo tenim aquest tipus de noticia");
                    break;
            }
            System.out.println("\nNoticia creada amb exit.");

        } else {
            System.out.println("\nAquest redactor no està a les nostres bases.");
        }

    }

    static void removeNew(int indexRedactor, int indexNoticia, ArrayList<Redactor> llistaRedactors) {

        if (indexRedactor == -1) {
            System.out.println("\nAquest redactor no està a les nostres bases.");
        } else if (indexNoticia == -1) {
            System.out.println("\nAquesta noticia no està a les nostres bases");
        } else {
            llistaRedactors.get(indexRedactor).newsList.remove(indexNoticia);
            System.out.println("\nNoticia eliminada amb exit.");
        }
    }

    static void showNews(int indexRedactor, String nomRedactor, ArrayList<Redactor> llistaRedactors) {

        if (indexRedactor != -1) {
            if (llistaRedactors.get(indexRedactor).newsList == null) {
                System.out.println("Aquest redactor encara no ha escrit cap noticia.");
            } else {
                for (int i = 0; i < llistaRedactors.get(indexRedactor).newsList.size(); i++) {
                    System.out.println("El redactor " + nomRedactor + " ha escrit aquestes noticies:\n" +
                            llistaRedactors.get(indexRedactor).newsList.get(i).toString());
                }
            }

        } else {
            System.out.println("\nAquest redactor no esta a les nostres bases");
        }

    }

    static void calculateNewsPunctuation(int indexRedactor, int indexNoticia, ArrayList<Redactor> llistaRedactors) {

        if (indexRedactor == -1) {
            System.out.println("\nAquest redactor no està a les nostres bases.");
        } else if (indexNoticia == -1) {
            System.out.println("\nAquesta noticia no està a les nostres bases");
        } else {
            ;
            System.out.println(llistaRedactors.get(indexRedactor).newsList.get(indexNoticia).calculatePunctuation());
        }

    }

    static void calculateNewsPrice(int indexRedactor, int indexNoticia, ArrayList<Redactor> llistaRedactors) {

        if (indexRedactor == -1) {
            System.out.println("\nAquest redactor no està a les nostres bases.");
        } else if (indexNoticia == -1) {
            System.out.println("\nAquesta noticia no està a les nostres bases");
        } else {

            System.out.println(llistaRedactors.get(indexRedactor).newsList.get(indexNoticia).calculateNewsPrice());
        }

    }
}