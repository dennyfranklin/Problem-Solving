package String;

public class CountVowels {
    public static void main(String[] args) {
        String input = "contained";
        char[] vowels = {'a','e','i','o','u'};
        int count = 0;
        for (int i = 0; i < vowels.length; i++) {
            for (int j = 0; j < input.length(); j++) {
                System.out.println(vowels[i]+"--------"+(input.charAt(j)));
                if (vowels[i]==(input.charAt(j))) {
                    System.out.println(2);
                    count++;
                }
            }
        }
        System.out.println(count);
        System.out.println("hi");
    }
}