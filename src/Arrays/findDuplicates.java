package Arrays;

import java.util.ArrayList;

public class findDuplicates {
    public static void main(String[] args){
        int[][] arr = {{4,61,65,21,95},
                       {95,61,1}};
        ArrayList<Integer> newArr = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-1; j++){
                if(arr[i][i]== arr[j+1][j]){
                    System.out.println(newArr.add(arr[i][j])+" ");

                }
            }
        }
        for(int num : newArr){
            System.out.print(num+" ");
        }
    }
}
