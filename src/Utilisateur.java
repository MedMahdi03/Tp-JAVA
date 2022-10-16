import java.util.Date;
import java.util.Scanner;

public class Utilisateur {
    public   int i = 0;

    Produit[] arr = new Produit[10];
    char rep;

   //Ajouter les produit
    public  void nouveauxProduit(){
        Scanner myObj = new Scanner(System.in);
        do {

        System.out.println("entrer l'identifiant");
        int id = myObj.nextInt();
        System.out.println("entrer prix: ");
        float prix = myObj.nextFloat();
        System.out.println("entrer libelle: ");
        String libelle = myObj.next();
        System.out.println("entrer marque: ");
        String marque = myObj.next();
        if (id == 0 && prix == 0.0){
            System.out.println("Vous avez creé une produit vide!!!");
            arr[i]  = new Produit(id,libelle,marque,prix,new Date());

        }else
        {
            arr[i]  = new Produit(id,libelle,marque,prix,new Date());
        }

            i++;
            rep = myObj.next().charAt(0);

        }while(rep != 'N');

    }

    //Affichage de produit
    public   void afficher(){

        for (Produit produit : arr) {
            System.out.println("id = " + produit.id);
            System.out.println("prix = " + produit.prix);
            System.out.println("libelle = " + produit.libelle);
            System.out.println("marque = " + produit.marque);
            System.out.println("marque = " + produit.dateExperation);
        }

        /* System.out.println(produit.id);
        System.out.println(produit.prix);
        System.out.println(produit.libelle);
        System.out.println(produit.marque);*/
    }




}
