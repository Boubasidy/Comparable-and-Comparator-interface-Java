import java.lang.Comparable;
public class Region implements Comparable<Region> {
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    private String nom ;

    public int getNbHabitants() {
        return nbHabitants;
    }

    public void setNbHabitants(int nbHabitants) {
        this.nbHabitants = nbHabitants;
    }

    private int nbHabitants ;

    public int getPIB() {
        return PIB;
    }

    public void setPIB(int PIB) {
        this.PIB = PIB;
    }

    private int PIB ;

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    private int superficie ;
    public Region(String nom , int nbh , int pib , int sup){
        this.nom = nom ;
        this.nbHabitants = nbh;
        this.PIB = pib;
        this.superficie = sup ;
    }
    public String toString(){
        return "Région : "+getNom()+" peuplée de : "+getNbHabitants() + " avec un PIB de : "+getPIB() + " milliards € et une superficie : "+getSuperficie() + "Km2";
    }


    @Override
    public int compareTo(Region o) {
        return this.nom.compareTo(o.nom);
    }
}
