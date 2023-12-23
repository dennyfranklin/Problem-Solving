package String;

public class splitPractice {
    public void Practice(){
        String str = "Hello, World";
        String[] newStr = str.split(" ");
        String fir = "";
        String first ="";
        String second = "";
        String result = "";

        for(int i=0; i<newStr.length; i++){
            fir = fir + newStr[i];
               System.out.println(fir+" "+"= first"+" ");
        }
        for(int i=newStr.length; i>0; i--){
            if(fir.charAt(i)==','){
                second = second + fir.charAt(i+1);

                continue;
            }
            else{
                 first = first + fir.charAt(i);
            }

        }

    }


    public static void main(String[] args){
        splitPractice split = new splitPractice();
        split.Practice();
    }
}
