package String;

public class PerfectSquare {
    public static void main(String[] args){
        int number = 34;
        int sqrt = 0;
        while(sqrt * sqrt <= number){
            if(sqrt * sqrt == number) {
                System.out.println("This is a perfect square");
            }
            sqrt++;
        }
        if(sqrt * sqrt != number){
            System.out.println("This is not a perfect square");
        }
    }
}
