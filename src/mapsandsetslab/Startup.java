/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mapsandsetslab;

import java.util.*;

/**
 *
 * @author Kevin Nangle
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create four Products for testing, note duplicate
        Product prod1 = new Product("HRDW223456", "#2 Phillips Screwdriver",
                "Stanley");
        Product prod2 = new Product("HRDW294689", "3/8 Inch Driver/Drill",
                "Makita");
        Product prod3 = new Product("HRDW217896", "Dogbone Wrench",
                "Craftsman");
        Product prod4 = new Product("HRDW223456", "#2 Phillips Screwdriver",
                "Stanley");
        
        //  Place Products in a HashSet
        Set<Product> group1 = new HashSet<Product>();
        group1.add(prod1);
        group1.add(prod2);
        group1.add(prod3);
        group1.add(prod4);
        
        // Loop through the HashSet to verify that the duplicate is removed
        System.out.println("Print 4 Products from a HashSet to demonstrate that "
                + "the duplicates have been removed");
        
        for(Product p: group1){
            System.out.println(p);
        }
        System.out.println("");
        
        // Place the HashSet in an ArrayList for sorting/printing
        List<Product> group2 = new ArrayList<Product>(group1);
        
        Collections.sort(group2);
        
        System.out.println("Print 4 Products from an ArrayList to demonstrate"
                + " natural sort");
        
        for (Product p: group2){
            System.out.println(p);  
        }
        
        System.out.println("");
        
        //  Sort and print the ArrayList using an optional Comparator
        Collections.sort(group2, new ProductByManufacturer());
        
        System.out.println("Print 4 Products from an ArrayList to demonstrate"
                + " custom sort");
        
        for (Product p: group2){
            System.out.println(p);  
        }
        
        System.out.println("");
        
        // Place the 4 Products into a HashMap
        
        Map<String, Product> group3 = new HashMap<String, Product>();
        group3.put("HRDW223456", prod1);
        group3.put("HRDW294689", prod2);
        group3.put("HRDW217896", prod3);
        group3.put("HRDW223456", prod4);
        
        // Retrieve a single Product from the HashMap
        System.out.println("Retrieve a single Product from a HashMap");
        System.out.println(group3.get("HRDW217896"));
        System.out.println("");
        
        // Loop through the keys in a HashMap
        Collection<String> keys1 = group3.keySet();
        
        System.out.println("Loop through the keys from a HashMap");
        
        for (String k: keys1){
            System.out.println(k);
        }
        
        System.out.println("");
        
        // Loop through the values in a HashMap
        Collection<Product> values1 = group3.values();
        
        System.out.println("Loop through the values from a HashMap");
        
        for (Product p: values1){
            System.out.println(p);
        }
        
        System.out.println("");
        
        // Place the 4 Products into a TreeMap
        Map<String, Product> group4 = new TreeMap<String, Product>();
        group4.put("HRDW223456", prod1);
        group4.put("HRDW294689", prod2);
        group4.put("HRDW217896", prod3);
        group4.put("HRDW223456", prod4);
        
        // Loop through the keys in a TreeMap
        Collection<String> keys2 = group4.keySet();
        
        System.out.println("Loop through the keys from a TreeMap");
        
        for (String k: keys2){
            System.out.println(k);
        }
        
        System.out.println("");
        
        // Loop through the values in a TreeMap
        Collection<Product> values2 = group4.values();
        
        System.out.println("Loop through the values from a TreeMap (note that "
                + "sort order is the same as for keys)");
        
        for (Product p: values2){
            System.out.println(p);
        }
        
        System.out.println("");
        
        // Sort the objects in a TreeMap using a custom sort on the values
        System.out.println("Sort the values in a TreeMap using a custom sort");
        List<Product> sortedValues = new ArrayList<Product>(values2);
        Collections.sort(sortedValues, new ProductByManufacturer());
        
        for (Product p: sortedValues){
            System.out.println(p);
        }
        
        System.out.println("");
        
        // Place the 4 Products into a TreeSet
        Set<Product> group5 = new TreeSet<Product>();
        group5.add(prod1);
        group5.add(prod2);
        group5.add(prod3);
        group5.add(prod4);
        
        // Loop through the tree set to show that it is sorted in natural 
        // order with dupes removed
        
        System.out.println("Display values from a TreeSet to show natural sort "
                + "and dupe removal");
        for (Product p: group5){
            System.out.println(p);
        }
    }
}
