import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String string = sc.nextLine();
        
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ' ') continue; 
            boolean alreadyPrinted = false;
            for (int k = 0; k < i; k++) {
                if (string.charAt(i) == string.charAt(k)) {
                    alreadyPrinted = true;
                    break;
                }
            }
            if (alreadyPrinted) continue;
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(i) == string.charAt(j)) {
                    System.out.println(string.charAt(i));
                    break;
                }
            }
        }
    }
}
