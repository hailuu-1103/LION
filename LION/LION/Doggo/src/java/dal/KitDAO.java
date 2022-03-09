/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import model.Kit;

/**
 *
 * @author laptop
 */
public class KitDAO extends DBContext {

    DecimalFormat df = new DecimalFormat("#.00");

    public List<Kit> getKits(String league) {
        List<Kit> list = new ArrayList<>();
        String sql = "SELECT * FROM dbo.kit WHERE kitID IN (SELECT DISTINCT kitID FROM dbo.storage) and 1=1 ";
        if (!league.equals("*")) {
            sql = sql.concat("and league like '%" + league + "%' ");
        }
        sql = sql.concat("order by league desc, kitID");
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Kit k = new Kit();
                k.setKitID(rs.getString("kitID"));
                k.setKitName(rs.getString("kitName"));
                k.setSeason(rs.getString("season"));
                k.setLeague(rs.getString("league"));
                float price = Float.valueOf(rs.getString("price"));
                price = Float.parseFloat(df.format(price));
                k.setPrice(price);
                k.setDescript(rs.getString("descript"));
                k.setSupplier(rs.getString("supplier"));
                k.setImg(rs.getString("img"));
                list.add(k);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        System.out.println(sql);
        return list;
    }

    public List<Kit> getKitCRUD() {
        List<Kit> list = new ArrayList<>();
        String sql = "SELECT * from Kit where 1=1 ";
        sql = sql.concat("order by league desc, kitID");
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Kit k = new Kit();
                k.setKitID(rs.getString("kitID"));
                k.setKitName(rs.getString("kitName"));
                k.setSeason(rs.getString("season"));
                k.setLeague(rs.getString("league"));
                float price = Float.valueOf(rs.getString("price"));
                price = Float.parseFloat(df.format(price));
                k.setPrice(price);
                k.setDescript(rs.getString("descript"));
                k.setSupplier(rs.getString("supplier"));
                k.setImg(rs.getString("img"));
                list.add(k);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        System.out.println(sql);
        return list;
    }

    public Kit getKitByID(String kitID) {
        Kit k = new Kit();
        String sql = "SELECT * FROM dbo.kit WHERE kitID IN (SELECT DISTINCT kitID FROM dbo.storage) and kit.kitID = ? ";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, kitID);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                k.setKitID(rs.getString("kitID"));
                k.setKitName(rs.getString("kitName"));
                k.setSeason(rs.getString("season"));
                k.setLeague(rs.getString("league"));
                float price = Float.valueOf(rs.getString("price"));
                price = Float.parseFloat(df.format(price));
                k.setPrice(price);
                k.setDescript(rs.getString("descript"));
                k.setSupplier(rs.getString("supplier"));
                k.setImg(rs.getString("img"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return k;
    }

    public List<Kit> getKitByName(String kitName) {
        kitName = kitName.replaceAll(" ", "%");
        List<Kit> list = new ArrayList<>();
        String sql = "SELECT * FROM dbo.kit WHERE kitID IN (SELECT DISTINCT kitID FROM dbo.storage) and kitName like '%" + kitName + "%' ";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Kit k = new Kit();
                k.setKitID(rs.getString("kitID"));
                k.setKitName(rs.getString("kitName"));
                k.setSeason(rs.getString("season"));
                k.setLeague(rs.getString("league"));
                float price = Float.valueOf(rs.getString("price"));
                price = Float.parseFloat(df.format(price));
                k.setPrice(price);
                k.setDescript(rs.getString("descript"));
                k.setSupplier(rs.getString("supplier"));
                k.setImg(rs.getString("img"));
                list.add(k);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public List<Kit> getKitByPage(List<Kit> list, int start, int end) {
        List<Kit> t = new ArrayList<>();
        for (int i = start; i < end; i++) {
            t.add(list.get(i));
        }
        return t;
    }

    public List<String> getType() {
        List<String> type = new ArrayList<>();
        String sql = "SELECT DISTINCT league FROM dbo.kit INNER JOIN dbo.storage ON storage.kitID = kit.kitID";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                type.add(rs.getString("league"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return type;
    }

    public List<String> getSize(String kitID) {
        List<String> size = new ArrayList<>();
        String sql = "SELECT size FROM storage where kitID =?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, kitID);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                size.add(rs.getString("size"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return size;
    }

    public List<Kit> getCheap() {
        List<Kit> cheap = new ArrayList<>();
        String sql = "SELECT TOP 4 * FROM dbo.kit WHERE kitID IN (SELECT DISTINCT kitID FROM dbo.storage) ORDER BY price DESC";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Kit k = new Kit();
                k.setKitID(rs.getString("kitID"));
                k.setKitName(rs.getString("kitName"));
                k.setSeason(rs.getString("season"));
                k.setLeague(rs.getString("league"));
                float price = Float.valueOf(rs.getString("price"));
                price = Float.parseFloat(df.format(price));
                k.setPrice(price);
                k.setDescript(rs.getString("descript"));
                k.setSupplier(rs.getString("supplier"));
                k.setImg(rs.getString("img"));
                cheap.add(k);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return cheap;
    }

    public List<Kit> getLatest() {
        List<Kit> latest = new ArrayList<>();
        String sql = "SELECT * FROM "
                + " (SELECT * FROM kit) t1 "
                + " INNER JOIN "
                + " (SELECT TOP 4 kitID, MAX(inDate) AS dayUpdate FROM dbo.storage GROUP BY kitID  ORDER BY dayUpdate DESC) t2 "
                + " ON (t1.kitID = t2.kitID); ";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Kit k = new Kit();
                k.setKitID(rs.getString("kitID"));
                k.setKitName(rs.getString("kitName"));
                k.setSeason(rs.getString("season"));
                k.setLeague(rs.getString("league"));
                float price = Float.valueOf(rs.getString("price"));
                price = Float.parseFloat(df.format(price));
                k.setPrice(price);
                k.setDescript(rs.getString("descript"));
                k.setSupplier(rs.getString("supplier"));
                k.setImg(rs.getString("img"));
                latest.add(k);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return latest;
    }

    public void addKit(Kit kit) {
        String sql = "INSERT INTO dbo.kit VALUES(?,?,?,?,ROUND(?, 2),?,?,?)";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, kit.getKitID());
            st.setString(2, kit.getKitName());
            st.setString(3, kit.getSeason());
            st.setString(4, kit.getLeague());
            st.setFloat(5, kit.getPrice());
            st.setString(6, kit.getDescript());
            st.setString(7, kit.getSupplier());
            String src = kit.getImg();
            st.setString(8, "image/" + kit.getImg());
            ResultSet rs = st.executeQuery();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void updateKit(Kit kit) {
        String sql = "UPDATE dbo.kit SET kitName = ?, season = ?, league = ?, price = ?, descript = ?, supplier = ?, img = ? WHERE kitID = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, kit.getKitName());
            st.setString(2, kit.getSeason());
            st.setString(3, kit.getLeague());
            st.setFloat(4, kit.getPrice());
            st.setString(5, kit.getDescript());
            st.setString(6, kit.getSupplier());
            String src = kit.getImg();
            st.setString(7, "image/" + kit.getImg());
            st.setString(8, kit.getKitID());
            ResultSet rs = st.executeQuery();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        KitDAO db = new KitDAO();
        System.out.println(db.getKitByID("LIVH2021"));
    }

}
