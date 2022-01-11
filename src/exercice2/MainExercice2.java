package exercice2;

import java.io.FileNotFoundException;
import java.util.List;

import datamocklib.Constants;
import datamocklib.Person;
import datamocklib.TxtHelper;
import exercice2.models.*;

public class MainExercice2 implements Exo2 {

    /* EXO 2
     * Recupérez depuis le serveur la liste des gens qui sont nés à Chambéry.
     * La récupération de Data se fait dans l'ordre :
     *  - Récupération de data sur le server grâce à TxtHelper.getDataFromTxt("server.txt");
     *  - Vider la base de données locale grâce à la fonction TxtHelper.clearDataLocal();
     *  - Insérer les données dans la database locale grâce à la fonction TxtHelper.insertDataInTxt(line, "local.txt")
     *  - Afficher les données locale grace à TxtHelper.getDataFromTxt("local.txt")
     */
    @Override
    public void displayPersonFromChambery() {
        List<String> localData = loadDatabaseLocally();
        localData.forEach(line -> {
            String[] splitted = line.split(",");
            if (splitted.length == 6) {
                Person person = new Person(splitted[0], splitted[1], splitted[2], splitted[3], splitted[4], splitted[5]);

                if (person.getCityOfBirth().equals("Chambery")) {
                    System.out.println(person.toString());
                }
            }
        });
    }

    /*
     * Recupérez depuis le serveur la liste des gens qui ont plus de 25 ans.
     * La récupération de Data se fait comme dans la question précedente
     * Tips : Vous avez dans la class Person la fonction getAge();
     */
    @Override
    public void displayBoomers() {
        List<String> localData = loadDatabaseLocally();
        localData.forEach(line -> {
            String[] splitted = line.split(",");
            if (splitted.length == 6) {
                Person person = new Person(splitted[0], splitted[1], splitted[2], splitted[3], splitted[4], splitted[5]);

                if (person.getAge() > 25) {
                    System.out.println(person.toString());
                }
            }
        });
    }

    /*
     * Recupérez depuis le serveur la liste des gens de sexe féminin.
     * La récupération de Data se fait comme dans la question précedente
     */
    @Override
    public void displayFemales() {
        List<String> localData = loadDatabaseLocally();
        localData.forEach(line -> {
            String[] splitted = line.split(",");
            if (splitted.length == 6) {
                Person person = new Person(splitted[0], splitted[1], splitted[2], splitted[3], splitted[4], splitted[5]);

                if (person.getGender().equals("female")) {
                    System.out.println(person.toString());
                }
            }
        });
    }

    /*
     * Recupérez depuis le serveur la liste des femmes de plus de 25 ans.
     * La récupération de Data se fait comme dans la question précedente
     */
    @Override
    public void displayFemaleBoomers() {
        List<String> localData = loadDatabaseLocally();
        localData.forEach(line -> {
            String[] splitted = line.split(",");
            if (splitted.length == 6) {
                Person person = new Person(splitted[0], splitted[1], splitted[2], splitted[3], splitted[4], splitted[5]);

                if (person.getGender().equals("female") && person.getAge() > 25) {
                    System.out.println(person.toString());
                }
            }
        });
    }

    /**
     * Load database server-side.
     * @return A List of String containing all persons listed in the server.
     */
    public List<String> loadDatabaseLocally() {
        List<String> serverData = TxtHelper.getDataFromTxt(Constants.SERVERFILE);
        return serverData;
//        try {
//            TxtHelper.clearDataLocal();
//        } catch (FileNotFoundException ex) {
//            System.out.println("Local file not found.");
//        }
//        serverData.forEach(s -> {
//            TxtHelper.insertDataInTxt(s, Constants.LOCALFILE);
//        });
//        return TxtHelper.getDataFromTxt(Constants.LOCALFILE);
    }

    public static void main(String[] args) {
        Exo2 exo2 = new MainExercice2();
        System.out.println("Person from Chambery");
        exo2.displayPersonFromChambery();
        System.out.println("Female persons aged more than 25");
        exo2.displayBoomers();
        System.out.println("Female persons");
        exo2.displayFemales();
        System.out.println("Person aged more than 25");
        exo2.displayFemaleBoomers();
    }
}
