import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double area, dobroArea, a;

        System.out.println("digite a um numero");
        a = entrada.nextDouble();

        area = (a * a);
        
        dobroArea = area * 2;

        System.out.println("o dobro da area é: " + dobroArea);
        
        entrada.close();
    }
}
