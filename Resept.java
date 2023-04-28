
public abstract class Resept {

    Legemiddel legemiddel;
    Lege utskrivendeLege;
    int pasientId;
    int reit;
    int id;
    static int teller = 1;

    public Resept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reit){
        this.legemiddel = legemiddel;
        this.utskrivendeLege = utskrivendeLege;
        this.pasientId = pasientId;
        this.reit = reit;
        id = teller;
        teller += 1;
    }

    public int hentId(){
        return id;
    }

    public Legemiddel hentLegemiddel(){
        return legemiddel;
    }

    public Lege hentLege(){
        return utskrivendeLege;
    }

    public int hentPasientId(){
        return pasientId;
    }

    public int hentReit(){
        return reit;
    }

    public boolean bruk(){
        if (reit == 0){
            return false;
        }
        else {
            reit -=1;
            return true;
        }
    }

    abstract public String farge();
    abstract public int prisAaBetale(int pris);

    @Override
    public String toString() {
        return "Informasjon om Resepter. ID: " + id + ", " + legemiddel + ", navn på lege: " + utskrivendeLege + ", pasientId: " + pasientId + ", antall reit " + reit + ".";
    }

}
