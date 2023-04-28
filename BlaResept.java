
public class BlaResept extends Resept {

    String farge = "Blå";

    public BlaResept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reit){
        super(legemiddel, utskrivendeLege, pasientId, reit);
    }

    @Override
    public String farge(){
        return farge;
    }

    @Override
    public int prisAaBetale(int pris){
        return (int)(pris*0.25);
    }

    @Override
    public String toString() {
        return super.toString() + " Farge: " + farge + ", rabatt: 75%.";
    }



}
