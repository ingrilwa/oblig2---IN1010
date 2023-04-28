
public class HvitResept extends Resept {

    String farge = "Hvit";

    public HvitResept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reit){
        super(legemiddel, utskrivendeLege, pasientId, reit);
    }

    @Override
    public String farge(){
        return farge;
    }

    @Override
    public int prisAaBetale(int pris){
        return pris;
    }

    @Override
    public String toString() {
        return super.toString() + " Farge: " + farge + ".";
    }


}
