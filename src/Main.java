import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Stav aktualnyStav = new Stav(TypStavu.S0);
        Scanner skener = new Scanner(System.in);
        boolean nacitavaj = true;
        while (nacitavaj) {
            System.out.print("A: ");
            int a = skener.nextInt();
            System.out.print("B: ");
            int b = skener.nextInt();
            aktualnyStav.zmenStav(a, b);
            System.out.println("Aktuálny stav: " + aktualnyStav.getStav().getString());
            System.out.println("Svetelná signalizácia: " + aktualnyStav.getSvetelnaSignalizacia());
            System.out.println("Prajete si pokračovať? a/n");
            String odpoved = skener.nextLine();
            odpoved = skener.nextLine();
            if (odpoved.equals("n")) {
                nacitavaj = false;
            }
        }
    }
}
