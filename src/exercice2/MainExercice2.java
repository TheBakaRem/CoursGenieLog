package exercice2;

import exercice2.models.*;

public class MainExercice2 implements Exo2 {

    // EXO 2
    /*
     * Recupérez depuis le serveur la liste des gens qui sont nés à Chambéry.
     * La récupération de Data se fait dans l'ordre :
     *  - Récupération de data sur le server grace à TxtHelper.getDataFromTxt("server.txt");
     *  - Vider la base de données locale grace a fonction TxtHelper.clearDataLocal();
     *  - Insérer les données dans la database locale
     *  - Afficher les données locale grace à TxtHelper.getDataFromTxt(data, "local.txt")
     */
    @Override
    public void displayPersonFromChambery() {

    }

    /*
     * Recupérez depuis le serveur la liste des gens qui ont plus de 25 ans.
     * La récupération de Data se fait comme dans la question précedente
     * Tips : Vous avez dans la class Person la fonction getAge();
     */
    @Override
    public void displayBoomers() {

    }

    /*
     * Recupérez depuis le serveur la liste des gens de sexe féminin.
     * La récupération de Data se fait comme dans la question précedente
     */
    @Override
    public void displayFemales() {

    }

    /*
     * Recupérez depuis le serveur la liste des femmes de plus de 25 ans.
     * La récupération de Data se fait comme dans la question précedente
     */
    @Override
    public void displayFemaleBoomers() {

    }

    public static void main(String[] args) {

    }
}
