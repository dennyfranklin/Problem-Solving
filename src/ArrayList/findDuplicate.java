package ArrayList;

import java.util.ArrayList;

public class findDuplicate {
    public void findDuplicate(){

        ArrayList<Integer> List = new ArrayList<>();
        List.add(1);
        List.add(2);
        List.add(1);

        System.out.println(List.size());

        int[] arr = new int[List.size()];

        for (int i=0; i<arr.length; i++){
          arr[i] = List.get(i);
          System.out.println(List.get(i) + " ");
        }
        System.out.println("arr.length ="+arr.length);
        for(int i=0; i<arr.length-1; i++){//i = 1    length = 3
            System.out.println("i ="+ i);
            int count=0;
            for(int j=i; i<arr.length-1; j++){  // j = 2
                System.out.println("j ="+j);
                if(arr[i]==arr[j]){
                    count++;
                    System.out.println(arr[i]+" = "+count);
                }
            }
        }
    }
    public static void main(String[] args){
        findDuplicate find = new findDuplicate();
        find.findDuplicate();
    }
}
