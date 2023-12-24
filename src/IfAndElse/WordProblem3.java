package IfAndElse;
/*
Given 3 numbers N , L and R. Print 'yes' if N is between L and R else print 'no'.

        Sample Testcase :
        INPUT
        3
        2 6
        OUTPUT
        yes
*/
public class WordProblem3 {
    public static void main(String[] args){
        int N = 10;
        int L = 2;
        int R = 6;
        if(N>=L && R>=N){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
