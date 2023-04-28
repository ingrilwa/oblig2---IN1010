
public class TestLegemiddel {

    public static void main(String[] args) {
        // oppretter objekter av alle subklassene
        Narkotisk narko = new Narkotisk("morfin", 100, 50.5, 200);
        Vanedannende vane = new Vanedannende("nikotin", 80, 20.8, 100);
        VanligLegemiddel vanlig = new VanligLegemiddel("paracet", 40, 10.6);

        // tester først klassen Narkotisk
        System.out.println(testId(narko,1));
        System.out.println(testNavn(narko,"morfin"));
        System.out.println(testPris(narko,100));
        System.out.println(testVirkestoff(narko,50.5));
        System.out.println(testStyrke(narko,200));

        // tester klassen Vanedannende
        System.out.println(testId(vane,1));
        System.out.println(testNavn(vane,"nikotin"));
        System.out.println(testPris(vane,80));
        System.out.println(testVirkestoff(vane,20.8));
        System.out.println(testStyrke(vane,100));

        // tester klassen VanligLegemiddel
        System.out.println(testId(vanlig,1));
        System.out.println(testNavn(vanlig,"paracet"));
        System.out.println(testPris(vanlig,40));
        System.out.println(testVirkestoff(vanlig,10.6));

    }

    // skriver test-metoder som brukes til å teste klassenes metoder

    // tester id
    public static boolean testId(Legemiddel legemiddel, int forventetId) {
        return legemiddel.hentId() == forventetId;
    }

    // tester navn
    public static boolean testNavn(Legemiddel legemiddel, String forventetNavn) {
        return legemiddel.hentNavn() == forventetNavn;
    }

    // tester pris
    public static boolean testPris(Legemiddel legemiddel, int forventetPris) {
        return legemiddel.hentPris() == forventetPris;
    }

    // tester virkestoff
    public static boolean testVirkestoff(Legemiddel legemiddel, double forventetVirkestoff) {
        return legemiddel.hentVirkestoff() == forventetVirkestoff;
    }

    // tester styrke
    static boolean testStyrke(Legemiddel legemiddel, int forventetStyrke) {
        if (legemiddel instanceof Narkotisk) {
            return ((Narkotisk) legemiddel).hentNarkotiskStyrke() == forventetStyrke;
        } else {
            return ((Vanedannende) legemiddel).hentVanedannendeStyrke() == forventetStyrke;
        }
    }




}
