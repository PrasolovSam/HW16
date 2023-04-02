import javax.crypto.spec.PSource;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String text = new Scanner(System.in).nextLine();
        textToWords(text);
    }
    public static void textToWords(String input) {
        String clearWord = input.replaceAll("\\W+", " ");
        String[] array = clearWord.split(" ");
        for(String e : array){
            System.out.println(e);
        }
    }
}



// \\s = все пробельные символы
// \\d = все цифры
// \\w = слова (английские)
// \\заглавная буква = замена всего кроме этого
// \\ [] = перечисление символов
// \\ * = кванторы