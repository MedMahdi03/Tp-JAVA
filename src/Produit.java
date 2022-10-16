import com.sun.jdi.Value;

import java.util.Date;
import java.util.Scanner;
public class Produit {
     int   id;
     String  libelle;
    String  marque;
    float prix;
  Date dateExperation;
     Produit(int id,String libelle,String marque,float prix,Date dateExperation){
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
         this.dateExperation = dateExperation;
    }


}
