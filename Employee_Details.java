package tree_Map;

import java.util.TreeMap;

public class Employee_Details {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        TreeMap<String, Integer> employee = new TreeMap<>();
        employee.put("AX", 4000);
        employee.put("AZ", 4001);
        employee.put("AY", 4002);
        employee.put("AV", 4003);
        employee.put("AW", 4004);

        System.out.println("Employee Names are in Alphabetical order");
        for (String name : employee.keySet()) {
            System.out.println(name);
        }
    }

}