import java.util.Scanner;

public class Q1RemoveVowel {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String str = sc.next();
       String str1 = "";
       str1 = str.replaceAll("[aeiouAEIOU]","");
        System.out.println("String after remove"+str1);

    }
}
