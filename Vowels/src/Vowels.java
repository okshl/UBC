import java.util.Scanner;

public class Vowels {

    public static void main(String[] args) {

        Scanner newScanner = new Scanner(System.in);
        System.out.println("Enter any text");
        String str = newScanner.nextLine();

        System.out.println("Number of  Vowels in the string: " + getCount(str));

        str = str.replaceAll("[AaEeIiOoUu]", "");
        System.out.println(str);

    }

    public static int getCount(String str) {
        int vowelsCount = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'a' || str.charAt(i) == 'A' || str.charAt(i) == 'e' || str.charAt(i) == 'E' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'I' || str.charAt(i) == 'o'|| str.charAt(i) == 'O'  || str.charAt(i) == 'u'|| str.charAt(i) == 'U' ) {
                vowelsCount++;
            }

        }
        return (vowelsCount);
    }

    }



