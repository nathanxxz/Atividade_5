import java.util.Scanner;

public class Quest13 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um Número");
        int num1 = sc.nextInt();

        if(num1 >= 0 && num1 <= 10){
            System.out.println("O número está entre 0 e 10");

        }
        else{
            System.out.println("O número não está entre 0 e 10");
        }
    }
}
