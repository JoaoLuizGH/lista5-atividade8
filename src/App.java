import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner tc = new Scanner(System.in);
        System.out.print("Favor informar um número: ");
        String numero = tc.nextLine();
        tc.close();

        digitos(numero);

    }

    static void digitos(String numero){
        System.out.println("\nA quantidade de dígitos do número informado é: "+numero.length());
    }
}