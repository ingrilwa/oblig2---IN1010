
public class TestResepter {

    public static void main(String[] args) {

          Legemiddel vane = new Vanedannende("melatonin", 95, 6.6,10);
          Lege lege = new Lege("Maren");

          BlaResept bla = new BlaResept(vane, lege, 1, 5);
          HvitResept hvit = new HvitResept(vane, lege, 2, 4);
          MilResept mil = new MilResept(vane, lege, 3);
          PResept pre = new PResept(vane, lege, 4, 8);

          // Tester BlaResept
          if (bla.farge().equals("Blå")) {
              System.out.println("BlaResept sin farge() er riktig");
          }
          else {
              System.out.println("BlaResept sin farge() er feil");
          }
          if (bla.prisAaBetale(100) == 25) {
              System.out.println("BlaResept sin prisAaBetale() er riktig");
          }
          else {
              System.out.println("BlaResept sin prisAaBetale() er feil");
          }

          // Tester HvitResept
          if (hvit.prisAaBetale(80) == 80) {
              System.out.println("HvitResept sin prisAaBetale() er riktig");
          }
          else {
              System.out.println("HvitResept sin prisAaBetale() er feil");
          }

          // Tester MilResept
          if (mil.hentReit() == 3) {
              System.out.println("MilResept sin hentReit() er riktig");
          }
          else {
              System.out.println("MilResept sin hentReit() er feil");
          }
          if (mil.prisAaBetale(68) == 0) {
              System.out.println("MilResept sin prisAaBetale() er riktig");
          }
          else {
              System.out.println("MilResept sin prisAaBetale() er feil");
          }

          // Tester PResept
          if (pre.prisAaBetale(111) == 3) {
              System.out.println("PResept sin prisAaBetale() er riktig");
          }
          else {
              System.out.println("PResept sin prisAaBetale() er feil");
          }


    }

}
