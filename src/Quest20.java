import java.util.Scanner;

public class Quest20 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("QUANTO VOCE GANHA POR HORA?");
        double gan= sc.nextDouble();
        System.out.println("QUANTAS HORAS VOCE TRABALHA POR MES?");
        double qtd= sc.nextDouble();
        double salbruto=gan*qtd;
        System.out.println("SEU SALARIO BRUTO É" + " " + salbruto);
        double ir=salbruto*0.11;
        double inss=salbruto*0.08;
        double sindicato=salbruto*0.05;
        double salliquid=salbruto-(ir+inss+sindicato);
        System.out.println("DESCONTOS");
        System.out.println("IR" + " " + ir);
        System.out.println("INSS" + " " + inss);
        System.out.println("SINDICATO" + " " + sindicato);
        System.out.println("SALARIO LIQUIDO" + " " + salliquid);

    }
}
