/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mapsandsetslab;

import java.util.Comparator;

/**
 *
 * @author Kevin
 */
public class ProductByDescription implements Comparator<Product>{
    
        public int compare(Product p1, Product p2) {
        return p1.getDescription().compareTo(p2.getDescription());
        }
    
    
}
