
package String;

public class Anagram {

        static boolean isAnagram(String a, String b) {
            // Complete the function
            a.toLowerCase();
            b.toLowerCase();
            if (a.length() == b.length()) {
                for (int i = 0; i < a.length() - 1; i++) {
                    if (a.charAt(i) == b.charAt(i)) {
                        return true;
                    } else {
                        return false;
                    }
                }

            }
            return false;
        }
        public static void main(String[] args) {


            String a = "anagramm";
            String b = "margramm";

            boolean ret = isAnagram(a, b);
            System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        }
    }


