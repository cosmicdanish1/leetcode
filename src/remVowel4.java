import java.util.Scanner;

public class remVowel4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String s = sc.next();
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!= 'a'&& s.charAt(i)!= 'e'&& s.charAt(i)!= 'i'&& s.charAt(i)!= 'o'&&
                    s.charAt(i)!= 'u'&& s.charAt(i)!= 'A'&& s.charAt(i)!= 'E'&& s.charAt(i)!= 'I'&&
                    s.charAt(i)!= 'O'&& s.charAt(i)!= 'U'){
                str =str+s.charAt(i);
            }

        }
        System.out.println(""+str);
    }
}
