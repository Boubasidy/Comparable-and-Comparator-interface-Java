import java.util.Comparator;

public class ComparateurDensite implements Comparator<Region> {
    public ComparateurDensite(){}
    public int compare (Region a , Region b){
        double densite1 = a.getNbHabitants()/a.getSuperficie();
        double densite2 = b.getNbHabitants()/b.getSuperficie();
        return densite1 < densite1 ? -1 : (densite2 == densite1 ? 0 : 1);
    }
}
