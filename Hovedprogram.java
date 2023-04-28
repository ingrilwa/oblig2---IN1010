
public class Hovedprogram {

    public static void main(String[] args) {
        // Oppretter et objekt av hver klasse

        // Starter med legemidler
        VanligLegemiddel vanlig = new VanligLegemiddel("ibux", 200, 80);
        Vanedannende vane = new Vanedannende("melatonin", 500, 280, 4);
        Narkotisk nark = new Narkotisk("morfin", 700, 400, 5);

        // Leger
        Lege lege = new Lege("Maren Jakobsen");
        Spesialist spesial = new Spesialist("Jonas Larsen", "123abc");

        // Resepter
        BlaResept bla = new BlaResept(nark, spesial, 1, 8);
        HvitResept hvit = new HvitResept(vanlig, lege, 2, 10);
        PResept pres = new PResept(vanlig, lege, 3, 10);
        MilResept mil = new MilResept(vane, spesial, 4);

        // Skriver ut informasjon om hvert objekt
        // Legemiddel
        System.out.println("" + vanlig + "\n" + vane + "\n" + nark + "\n");
        // Leger
        System.out.println("" + lege +"\n" + spesial + "\n");
        // Resepter
        System.out.println("" + bla + "\n" + hvit + "\n" + pres + "\n" + mil + "\n");


    }
}
