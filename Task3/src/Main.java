import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите ФИО:");
        String fullName = new Scanner(System.in).nextLine();
        getFullName(fullName);
    }

    public static void getFullName(String input){
        if (input.matches("[А-яё\\- ]+")) {
            try {
                String[] blocks = input.split(" ");
                System.out.println("Фамилия: " + blocks[0] +
                                    "\nИмя: " + blocks[1] +
                                    "\nОтчество: " + blocks[2]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Неверный формат");
            }
        } else System.out.println("Неверный формат");

    }
}