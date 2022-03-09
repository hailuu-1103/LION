/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.DecimalFormat;

/**
 *
 * @author laptop
 */
public class OrderDetail {
    private String kitID;
    private String size;
    private int quantity;
    private float total;
    
    DecimalFormat df = new DecimalFormat("#.00");

    public OrderDetail() {
    }

    public OrderDetail(String kitID, String size, int quantity, float total) {
        this.kitID = kitID;
        this.size = size;
        this.quantity = quantity;
        this.total = Float.parseFloat(df.format(total));
    }

    public String getKitID() {
        return kitID;
    }

    public void setKitID(String kitID) {
        this.kitID = kitID;
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

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = Float.parseFloat(df.format(total));
    }
    
}
