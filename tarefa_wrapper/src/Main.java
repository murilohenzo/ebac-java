import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = s.nextInt();
        System.out.println(idade);
        Integer idade1 = (Integer) idade;
        System.out.println(idade1);
    }
}