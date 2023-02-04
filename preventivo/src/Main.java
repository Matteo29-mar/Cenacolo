import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("inserire costo energia ( 0,005 ):\n");
        double costoenergia = sc.nextDouble();

        System.out.print("\nPLA:0.03 - TPU:0.05 - PTG:0.06\n");
        System.out.print("inserire costo materiale\n");
        double costomateriale = sc.nextDouble();

        System.out.print("\ninserire tempo in minuti:\n");
        double tempo = sc.nextDouble();
        double costparziale = (costoenergia + costomateriale) * tempo;
        System.out.println("\ncosto parziale:\n" + costparziale);
        System.out.print("\ninserire commesse\n");
        double commesse = sc.nextDouble();
        double costotale = costparziale + commesse;
        System.out.println("\ncosto totale:" + costotale);



    }
}