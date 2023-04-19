import java.util.Scanner;

public class esercizio2 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("inserisci il tuo nome");
        String nome= sc.nextLine();
        System.out.println("inserisci il tuo cognome");
        String cognome= sc.nextLine();

        System.out.println((nome + cognome) + " swegghi ");

    }
}
