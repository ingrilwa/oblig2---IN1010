
public class Lege {

    String navn;

    public Lege(String navn){
        this.navn = navn;
    }

    public String hentLege(){
        return navn;
    }

    public String toString() {
       return "Legens navn er " + navn + ".";
   }
}
