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
public class Kit implements Serializable {

    private String kitID, kitName, season, league;
    private float price;
    private String descript, supplier, img;
    DecimalFormat df = new DecimalFormat("#.00");

    public Kit() {
    }

    public Kit(String kitID, String kitName, String season, String league, float price, String descript, String supplier, String img) {
        this.kitID = kitID;
        this.kitName = kitName;
        this.season = season;
        this.league = league;
        this.price = Float.parseFloat(df.format(price));
        this.descript = descript;
        this.supplier = supplier;
        this.img = img;
    }

    public String getKitID() {
        return kitID;
    }

    public void setKitID(String kitID) {
        this.kitID = kitID;
    }

    public String getKitName() {
        return kitName;
    }

    public void setKitName(String kitName) {
        this.kitName = kitName;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = Float.parseFloat(df.format(price));
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

    @Override
    public String toString() {
        return "Kit{" + "kitID=" + kitID + ", kitName=" + kitName + ", season=" + season + ", league=" + league + ", price=" + price + ", descript=" + descript + ", supplier=" + supplier + ", img=" + img + '}';
    }

}
