package com.java.map;

import java.util.*;

public class HashMapOperation {

    public static void main(String[] args){

       /* HashMap map = new HashMap();
        map.put("Social", 99);
        map.put("Science", 100);
        map.put(56, "Maths");
        System.out.println(map);*/

       /* HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Social", 99);
        map.put("Science", 100);
        map.put("English", 68);
        map.put("english", 98);
        map.put("Telugu", null);
        map.put("Tamil", null);
        map.put(null, null);
        map.put(null, 2);
        System.out.println(map);*/

       /* TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        map.put("Social", 99);
        map.put("Maths", 100);
        map.put("English", 68);
        map.put("english", null);
        map.put("English", 95);
        map.put("Hindi", null);
        //map.put(null, null);
        System.out.println(map);*/

        LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
        map.put("Social", 99);
        map.put("Maths", 100);
        map.put("English", 68);
        map.put("english", null);
        map.put("English", 95);
        map.put("Hindi", null);
        map.put(null, null);
        map.put(null, 2);
        System.out.println(map);

        System.out.println("----------------------");

        System.out.println(map.get(null));
        System.out.println(map);
        System.out.println(map.containsKey("english"));
        map.remove("english");
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.containsValue(2));
        System.out.println("----------------------");

        //iterating map using entrySet
        for (Map.Entry<String, Integer> entry: map.entrySet()){
            //System.out.println(entry);
            System.out.println(entry.getKey()+": "+entry.getValue());
        }

        System.out.println("----------------------");
        //iterating map using keySet
        for (String key: map.keySet()){
            System.out.println(key +": "+map.get(key));
        }

        Driver driver = new Driver(1,"ABC",456.12);
        Driver driver1 = new Driver(2, "BBC", 6531.1);
        Driver driver2 = new Driver(3, "CBC", 653.146);
        Driver driver3 = new Driver(4, "DBC", 895.46);

        HashMap<Integer, Driver> map1 = new HashMap<Integer, Driver>();
        map1.put(driver.id, driver);
        map1.put(driver1.id, driver1);
        map1.put(driver2.id, driver2);
        map1.put(driver3.id, driver3);

        System.out.println("----------------------");
        System.out.println(map1);
        System.out.println("----------------------");
        System.out.println(map1.get(2));
    }
}

class Driver{
    int id;
    String name;
    double distanceTravelled;

    public Driver() {
    }

    public Driver(int id, String name, double distanceTravelled) {
        this.id = id;
        this.name = name;
        this.distanceTravelled = distanceTravelled;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDistanceTravelled() {
        return distanceTravelled;
    }

    public void setDistanceTravelled(double distanceTravelled) {
        this.distanceTravelled = distanceTravelled;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", distanceTravelled=" + distanceTravelled +
                '}';
    }
}
