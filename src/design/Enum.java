package design;

public class Enum {

        public static void main(String[] args) {
            System.out.println("Months of the Year:");
            for (Months m : Months.values())
                System.out.println(m + " has  " + m.getDays() + " days");
        }
    }

