/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author laptop
 */
public class Cart {
    private String username;
    private List<Item> items; //  ds sản phẩm đưa vào giỏ
    
    
    public Cart(String username) {
        this.username = username;
        items = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public void setItems(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }
    // số lượng 1 sản phẩm trong giỏ - khách sẽ mua

    public int getItemQuantity(String id, String size) {
        return getExactItem(id,size).getQuantity();
    }

    public Item getExactItem(String id, String size) {
        for (Item i : items) {
            String kitID = i.getKit().getKitID();
            String kitSize = i.getSize();
            if (kitID.contains(id)&&kitSize.contains(size)) {
                return i;
            }
        }
        return null;
    }
// add 1 sản phẩm vào giỏ, nếu có rồi thì tăng số lượng

    public void addItem(Item t) {
        if (getExactItem(t.getKit().getKitID(), t.getSize()) != null) {
            Item m = getExactItem(t.getKit().getKitID(), t.getSize());
            m.setQuantity(m.getQuantity() + t.getQuantity());
        } else {
            items.add(t);
        }
    }
//loại sản phẩm khỏi giỏ

    public void removeItem(String id, String size) {
        if (getExactItem(id, size) != null) {
            items.remove(getExactItem(id, size));
        }
    }
//tổng tiền của cả giỏ hàng – sẽ add vào bảng Order

    public float getTotalMoney() {
        float t = 0;
        for (Item i : items) {
            t += (i.getQuantity() * i.getPrice());
        }
        return t;
    }
}
