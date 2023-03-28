import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Introduce un número");

        int number = keyboard.nextInt();

        System.out.println(number);

        keyboard.close();
    }
}