import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        

        Scanner raio= new Scanner(System.in);


        System.out.print("Valor do raio?");
        Double valor= raio.nextDouble();

        final Double area = Math.PI * Math.pow(valor, 2);
        System.out.print("O valor da área é:"+area);

      


    }
}