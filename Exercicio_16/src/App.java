import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Digite quantos metros você deseja pintar: ");
            double metros = entrada.nextDouble();
            double tinta = metros / 3;
            double lata = tinta / 18;
            double valor = lata * 80;
            System.out.println("Você vai precisar de " + (Math.ceil(tinta)) + " litros de tinta para pintar sua parede");
            System.out.println("Será preciso comprar " + (Math.ceil(lata)) + " lata(s) de tinta");
            System.out.println("Você vai pagar " + (Math.ceil(valor)) + ("R$"));
        }
    }
}
