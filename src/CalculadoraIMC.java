import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é a sua altura em m: ");
        float altura = sc.nextFloat();
        System.out.println("Qual é o seu peso em Kg: ");
        float peso = sc.nextFloat();

        float IMC = peso / (altura * altura);
        System.out.printf("Seu IMC é: %.2f\n", IMC);

        if (IMC < 18.5f) {
            System.out.println("Magreza");
        } else if (IMC >= 18.5f && IMC < 25) {
            System.out.println("Normal");
        } else if (IMC >= 25 && IMC < 30) {
            System.out.println("Sobrepeso");
        } else if (IMC >= 30 && IMC < 35) {
            System.out.println("Obesidade");
        } else if (IMC >= 35 && IMC < 40) {
            System.out.println("Obesidade Severa");
        } else {
            System.out.println("Obesidade mórbida");
        }
        sc.close();
    }
}
