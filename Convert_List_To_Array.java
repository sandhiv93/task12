package list_To_Array;

import java.util.ArrayList;

public class Convert_List_To_Array {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ArrayList<String> Bike = new ArrayList<String>();

        Bike.add("Hero");
        Bike.add("Bajaj");
        Bike.add("KTM");
        Bike.add("Honda");
        Bike.add("Royal Enfield");
        Bike.add("OLA");
        Bike.add("Ather");
        System.out.println("List ==> " + Bike);

        String[] array = new String[Bike.size()];
        Bike.toArray(array);
        System.out.println("Array ==> ");
        for (String Bikes : array) {
            System.out.print(Bikes + " ");
        }

    }

}