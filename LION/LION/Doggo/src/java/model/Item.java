/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.text.DecimalFormat;

/**
 *
 * @author laptop
 */
public class Item implements Serializable {

    private Kit kit;
    private String size;
    private int quantity;
    private float price;
    
    DecimalFormat df = new DecimalFormat("#.00");

    public Item() {
    }

    public Item(Kit kit, String size, int quantity, float price) {
        this.kit = kit;
        this.size = size;
        this.quantity = quantity;
        this.price = Float.parseFloat(df.format(price));
    }

    public Kit getKit() {
        return kit;
    }

    public void setKit(Kit kit) {
        this.kit = kit;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = Float.parseFloat(df.format(price));
    }

    @Override
    public String toString() {
        return "Item{" + "kit=" + kit + ", size=" + size + ", quantity=" + quantity + ", price=" + price + '}';
    }
    
}
