package Sorting;

public class BubbleSort {
    public void bubbleSort(){
        int[] arr = {12,10,8,7,6};
        int temp;
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i; j++){
                System.out.println(arr[j]+" > "+arr[j+1]+" ");
                if(arr[j]>arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                System.out.println(arr[j]+"  "+arr[j+1]);
            }
        }
    }
    public static void main(String[] args){

        char a = 'a';
        System.out.print(1%2);
    }
}
