package Java_Programs;

public class LowerCapital {
    public static void main(String[] args) {
        String str = "BibhuPrasadMisHRA";
        StringBuilder lower = new StringBuilder();
        StringBuilder cap = new StringBuilder();
        //char[] words = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                System.out.println("Capital Characters:::"+str.charAt(i) + ", ");
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) {
                System.out.println("Lower Characters:::"+str.charAt(i) + ", ");
            }
        }
    }
}

