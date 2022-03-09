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
public class Dog implements Serializable {

    private String dogID, dogName, sex;
    private float price;
    private String descript, supplier, img;
    DecimalFormat df = new DecimalFormat("#.00");

    public Dog() {
    }

    public Dog(String dogID, String dogName, String sex, float price, String descript, String supplier, String img) {
        this.dogID = dogID;
        this.dogName = dogName;
        this.sex = sex;
        this.price = price;
        this.descript = descript;
        this.supplier = supplier;
        this.img = img;
    }

    public String getDogID() {
        return dogID;
    }

    public void setDogID(String dogID) {
        this.dogID = dogID;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public DecimalFormat getDf() {
        return df;
    }

    public void setDf(DecimalFormat df) {
        this.df = df;
    }

  
   
    @Override
    public String toString() {
        return "Dog{" + "dogID=" + dogID + ", dogName=" + dogName + ", sex=" + sex + ", price=" + price + ", descript=" + descript + ", supplier=" + supplier + ", img=" + img;
    }

}
