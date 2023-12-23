package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Practice {
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Maruthi");
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Kia");
      for(String i: cars){
          System.out.println(i);
      }

    }
}
