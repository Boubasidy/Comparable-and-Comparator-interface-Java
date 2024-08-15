import java.util.Comparator;

public class ComparateurPIB implements Comparator<Region> {
    public ComparateurPIB(){}
    public int compare(Region a , Region b){
        return a.getPIB() - b.getPIB();
    }
}
