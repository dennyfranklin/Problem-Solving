
package ArrayList;
import java.util.*;
class Frequency {
    // Use this editor to write, compile and run your Java code online
        public static void main(String[] args){
            ArrayList <String> list = new ArrayList<>();
            list.add("Ninja");
            list.add("code");
            list.add("Ninja");
            list.add("Cyber");
            list.add("Ninja");

            int frq = Collections.frequency(list,"Ninja");
            System.out.println(frq);
        }
    }






