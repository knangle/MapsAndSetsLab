/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mapsandsetslab;

/**
 *
 * @author Kevin
 */
public class Product implements Comparable{
    
    private String sku;
    private String description;
    private String manufacturer;

    public Product() {
    }

    public Product(String sku, String description, String manufacturer) {
        this.sku = sku;
        this.description = description;
        this.manufacturer = manufacturer;
    }

    public String getDescription() {
        return description;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getSku() {
        return sku;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        if ((this.sku == null) ? (other.sku != null) : 
                !this.sku.equals(other.sku)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + (this.sku != null ? this.sku.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "Product{" + "sku=" + sku + ", description=" + description 
                + ", manufacturer=" + manufacturer + '}';
    }

    @Override
    public int compareTo(Object o) {
        final int BEFORE = -1;
	final int EQUAL = 0;
	final int AFTER = 1;
        
        Product p = (Product)o;
        
        int comparison = this.sku.compareTo(p.getSku());
        if( comparison != EQUAL) return comparison;

        return EQUAL; // default
    }
    
    
    
}
