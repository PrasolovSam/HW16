import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String number = new Scanner(System.in).nextLine();
        correctNumberFormat(number);
    }
    public static void correctNumberFormat (String input){
        String clear = input.replaceAll("[-+()., ]", "");
        if(clear.length() == 11){
            if(clear.charAt(0) != 7) {
                String numWithSeven = clear.replace(clear.charAt(0), '7');

            }
        } else System.out.println("Неверный формат номера");

    }

}