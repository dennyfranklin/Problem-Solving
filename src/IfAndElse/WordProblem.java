package IfAndElse;

/*
In the city of King's Landing, the Golden Company is taking care of the expenses for the Court's discussion room. Due to continuous discussion
regarding the upcoming war with dragons, the electricity bill was high where they needed to pay it with all the money they had.
The electricity board has decided to charge rupees based on the units consumed by a particular home. If the units consumed are less than or
 equal to 200, the cost for one unit is 0.5. If the unit is less than or equal to 400, the cost for one unit is 0.65 and Rs.100 extra charge.
If the unit is less than or equal to 600, the cost for one unit is 0.80 and Rs.200 extra charge. If the unit is greater than 600 the cost for one unit is 1.25
and Rs.425 extra charge. You need to now calculate the electricity bill based on the units consumed (given input).

Input Format:
Input consists of one integer.
This corresponds to the units consumed.
Output Format:
The output consists of one integer.
This corresponds to the electricity bill in rupees.

Sample Input 1 :
200

Sample Output 1:
Rs.100

Explanation:
Here, the units consumed are equal to 200, the cost for one unit is 0.5. Hence the electricity bill will be Rs.100.

 */
public class WordProblem {
    public static void main(String[] args) {
        int unit = 701;
        int Rupees = 100;
        double Amount = 0;
        if(unit<=200){
           Amount = unit*0.5;
           System.out.println(Amount);
        }
        else if(unit>=201 && unit<=400){
            Amount = (unit*0.65)+100;
            System.out.println(Amount);
        } else if (unit>=401 && unit<=600) {
            Amount = (unit*0.80)+200;
            System.out.println(Amount);
        }
        else if(unit>=601){
            Amount = (unit*1.25)+425;
            System.out.println(Amount);
        }
    }
}
