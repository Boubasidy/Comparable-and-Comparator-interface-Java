import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Region> regions = new ArrayList<>();
        regions.add(new Region("Centre-Val de Loire" , 2566759 , 70 , 39151));
        regions.add(new Region("Bretagne" , 3329395 , 92 , 27208));
        regions.add(new Region("Ile-de-France" , 12213364 , 669 , 12011));
        regions.add(new Region("Auvergne-Rhône-Alpes" , 8026685 , 250 , 69711));
        System.out.println("les régions : ");
        for (Region r : regions){
            System.out.println(r.toString());
        }
        System.out.println("affichage des régions par ordre : ");

        Collections.sort(regions ,new ComparateurDensite());
        for (Region r : regions){
            System.out.println(r.toString());
        }
    }
}