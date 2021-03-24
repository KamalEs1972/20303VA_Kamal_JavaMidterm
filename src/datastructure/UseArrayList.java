package datastructure;



import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes using the add, peek, remove & retrieve methods.
         * Use For-Each loop and While-loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */

        ArrayList<String> name = new ArrayList<>();
        name.add("Lamia");
        name.add("Pritam");
        name.add("Kamal");
        name.add("Furqan");
        name.add("Mariam");
        name.add("Alex");
        name.add("Moe");

        Iterator<String> iter = name.iterator();
        System.out.println("The Iterator values " + " of list are: ");
        {
        }
        while (iter.hasNext()){

            System.out.println(iter.next());

        }
        String[] approvedBy = {"Krimo", "Aze", "Muniba", "Mohamed"};

        System.out.println("Approved By : ");
        for (String s : approvedBy){
            System.out.println(s);
        }
        System.out.println("***********************");

        name.remove("Kamal");


        System.out.println("List after removal: " + name.remove("Kamal"));
        System.out.println("***********************");

        System.out.println("Does this List contains the name \"Lamia\"? " + name.contains("Lamia"));
        System.out.println("***********************");

        System.out.println("The name on index 4 of this list is: " + name.get(4));
        //Kamal was removed

    }
}


