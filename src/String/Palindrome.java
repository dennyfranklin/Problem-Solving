package String;

public class Palindrome {
    public static void main(String[] args){
        String input = "pangram";
        String res = "";
        for(int i=input.length()-1; i>0; i--){
            res = res+ input.charAt(i);
        }
        System.out.println(res);
        if(input.equals(res)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("This is not a Palindrome");
        }
    }
}
