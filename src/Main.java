import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int dealerZahl = (int) (Math.random() * (22 - 16) + 16) ;
        int spielerHand = 0;
        String eingabe = "";


        do {
            int spielerKarte = (int) (Math.random() * (12 - 2) + 2);
            spielerHand += spielerKarte;
            System.out.println("spielerkarte: " + spielerKarte);
            System.out.println("spielerhand: " + spielerHand);
            System.out.println("dealerzahl: " + dealerZahl);

            if (spielerHand > 21){
                System.out.println("Verloren");
                System.out.println(spielerHand);
                return;
            }

            System.out.println("Noch eine Karte - j" + "\n" +
                    "Keine Karte mehr - n");
            Scanner x = new Scanner(System.in);
            eingabe = x.next();

            while (!(eingabe.equals("j") || eingabe.equals("n"))){
                eingabe = x.next();
            }

        }while (eingabe.equals("j"));

        if (spielerHand > dealerZahl){
            System.out.println("Gewonnen!!!");
            System.out.println("Sie haben: " + spielerHand + "\n" +
                    "Dealer hat: " + dealerZahl);
        } else if (spielerHand < dealerZahl){
            System.out.println("Verloren!!!");
        } else {
            System.out.println("Unentschieden");
        }
    }
}
