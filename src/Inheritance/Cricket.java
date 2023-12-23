package Inheritance;

public class Cricket {
    public void fielding(){
        System.out.println("Fieling");
    }
    public void bowling(){
        System.out.println("Bowling");
    }
    public void batting(){
        System.out.println("Batting");
    }
    public void wicketKeeping(){
        System.out.println("WicketKeeping");
    }

     static class Dhoni extends Cricket{
       @Override
       public void wicketKeeping() {
           super.wicketKeeping();
       }
       @Override
       public void batting(){
           super.batting();
       }
   }
   public static void main(String[] args){
       Dhoni dhoni = new Dhoni();
       dhoni.wicketKeeping();
   }
}