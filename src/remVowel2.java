import java.util.Scanner;

public class remVowel2 {
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 String s = sc.next();
 String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='a' || s.charAt(i) == 'A'){
                res = res+"";
            }
            else if (s.charAt(i)=='e' || s.charAt(i) == 'E'){
                res = res+"";
            }
            else if (s.charAt(i)=='i' || s.charAt(i) == 'I'){
                res = res+"";
            }
            else if (s.charAt(i)=='o' || s.charAt(i) == 'O'){
                res = res+"";
            }
            else if (s.charAt(i)=='u' || s.charAt(i) == 'U'){
                res = res+"";
            }
            else {
                res=res+s.charAt(i);
            }

        }
        System.out.println("remove "+res);


    }
}
