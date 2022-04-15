/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockTrading.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import javafx.util.Pair;
import stockTrading.Model.HoldingsDetails;
import stockTrading.Model.StockDetails;
import stockTrading.Model.UsersDetails;

/**
 *
 * @author Hp
 */
public class StocksNames {
    public String FindName(String sym) {
        String sqlcmd = "Select NAME from STOCKSNAMES where SYMBOL = ?";
        String Name=sym;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "STOCK_PROJECT", "abc123");
            PreparedStatement pst;
            pst = con.prepareStatement(sqlcmd);
            pst.setString(1, sym);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                Name=rs.getString(1);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Name;
    }
    public String FindSymbol(StockDetails obj) throws ClassNotFoundException, SQLException {
        String name = obj.getStockName();
        String sqlcmd = "Select SYMBOL,NAME from STOCKSNAMES where NAME like ?";

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "STOCK_PROJECT", "abc123");
            PreparedStatement pst;
            pst = con.prepareStatement(sqlcmd);
            System.out.println("name " + name);
            String Sname = name + '%';
            System.out.println("Sname:" + Sname);
            pst.setString(1, Sname);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                obj.setStockSymbol(rs.getString(1));
                obj.setStockName(rs.getString(2));
                System.out.println("Checking "+obj.getStockName());
                return "Successfull";
                
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Stock Not exists";
    }

    public LinkedHashMap<String, String> getAllNames() {
        String sqlcmd = "SELECT SYMBOL,NAME from STOCKSNAMES";
        
        LinkedHashMap<String, String> AllNames = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "STOCK_PROJECT", "abc123");
            PreparedStatement pst;
            pst = con.prepareStatement(sqlcmd);
            ResultSet rs = pst.executeQuery();
            if(rs.next()) {
                AllNames = new LinkedHashMap();
                do {
                    String sym = rs.getString(1);
                    String sname = rs.getString(2);
                    AllNames.put(sname, sym);
                }while (rs.next());
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return AllNames;
    }
    
    public LinkedHashMap<String,String> getAllHoldings(String Userid) {
        System.out.println("Ambikesh "+Userid);
        String sqlcmd = "SELECT STOCK_NAME,SYMBOL,Quantity from HOLDINGS WHERE USERID=? ";
        LinkedHashMap<String, String> AllHoldings = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "STOCK_PROJECT", "abc123");
            PreparedStatement pst;
            pst = con.prepareStatement(sqlcmd);
            pst.setString(1,Userid);
            ResultSet rs = pst.executeQuery();
            if(rs.next()) {
                System.out.println("Inside ");
                AllHoldings= new LinkedHashMap();
                do {
                    System.out.println("Yes ");
                    String sym = rs.getString(2);
                    String sname = rs.getString(1);
                    int qty=rs.getInt(3);
                    sym=sym+'-'+qty;
                    AllHoldings.put(sname, sym);
                }while (rs.next());
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return AllHoldings;
    }
    public LinkedHashMap<String,String> getAllHoldings2(String Userid) {
        String sqlcmd = "SELECT STOCK_NAME,SYMBOL,Quantity,BUYPRICE from HOLDINGS WHERE USERID=? ";
        float totalAmountInvested=0;
        LinkedHashMap<String, String> AllHoldings = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String allSymbols = "";
            String allCost = "";
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "STOCK_PROJECT", "abc123");
            PreparedStatement pst;
            pst = con.prepareStatement(sqlcmd);
            pst.setString(1,Userid);
            ResultSet rs = pst.executeQuery();
            if(rs.next()) 
            {
                AllHoldings=new LinkedHashMap();
                do {
                    String sym = rs.getString(2);
                    String sname = rs.getString(1);
                    int qty=rs.getInt(3);
                    float buyprice=rs.getFloat(4);
                    String temp=sym;
                    totalAmountInvested+=(buyprice*qty);

                    sym=sym+'-'+qty+'-'+buyprice;
                    AllHoldings.put(sname, sym);
                    allSymbols=allSymbols+temp+'-'+qty+";";
                    allCost=allCost+temp+'-'+(qty*buyprice)+";";
                }while (rs.next()) ;
                AllHoldings.put("invAmt",Float.toString(totalAmountInvested));
                AllHoldings.put("allsym",allSymbols);
                AllHoldings.put("allCost",allCost);
                System.out.println("Allcost "+allCost);
                System.out.println("TAIV "+totalAmountInvested);
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return AllHoldings;
    }
    
    public String UserRegistration(UsersDetails obj) {
        if (obj != null) {
            String sqlcmd = "INSERT INTO USERS(EMAIL,FNAME,LNAME,PASSWORD) VALUES (?,?,?,?)";
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "STOCK_PROJECT", "abc123");
                PreparedStatement pst;
                pst = con.prepareStatement(sqlcmd);
                pst.setString(1,obj.getEmail());
                pst.setString(2,obj.getFname());
                pst.setString(3,obj.getLname());
                pst.setString(4,obj.getPassword());
                pst.executeUpdate();
                con.close();
                
            }catch (Exception e) {
                e.printStackTrace();
            }
            return "success";
        }
        else {
            return "fail";
        }
    }
    public String VerifyLogin(String userid,String Pass) {
        String sqlcmd="SELECT PASSWORD from USERS WHERE EMAIL = ?";
        String ans="fail";
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "STOCK_PROJECT", "abc123");
            PreparedStatement pst;
            pst = con.prepareStatement(sqlcmd);
            pst.setString(1, userid);
            ResultSet rs = pst.executeQuery();
            if (rs.next()==false) {
                ans="notUser";
            }
            else
            {
                if(Pass.equals(rs.getString(1))) {
                    ans="success";
                    
                }
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ans;
    }
    public void BuyHoldings(HoldingsDetails hd) {
        String sqlcmd1 = "SELECT stock_name,BUYPRICE,Quantity from HOLDINGS where SYMBOL = ? and USERID = ?";
        String sqlcmd2 = "INSERT INTO HOLDINGS (USERID,SYMBOL,STOCK_NAME,QUANTITY,BUYPRICE,BUYDATE) VALUES (?,?,?,?,?,?)";
        String sqlcmd3 = "Update HOLDINGS SET QUANTITY=?,BUYPRICE=? where SYMBOL = ? and USERID = ?";
        
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "STOCK_PROJECT", "abc123");
            PreparedStatement pst;
            pst = con.prepareStatement(sqlcmd1);
            pst.setString(1,hd.getSymbol());
            pst.setString(2,hd.getUserid());
            ResultSet rs = pst.executeQuery();
            System.out.println("In function end");
            if(rs.next())
            {
                System.out.println("In if");
                int oldQuantity=rs.getInt(3);
                float oldAmount=rs.getFloat(2)*oldQuantity;
                PreparedStatement pst3;
                pst3 = con.prepareStatement(sqlcmd3);
                pst3.setInt(1,hd.getQuantity()+oldQuantity);
                pst3.setFloat(2, (oldAmount+hd.getAmount())/(float)(oldQuantity + hd.getQuantity()));
                pst3.setString(3,hd.getSymbol());
                pst3.setString(4,hd.getUserid());
                pst3.executeUpdate();
                
            }
            else
            {
                System.out.println("In else");
                PreparedStatement pst2;
                pst2 = con.prepareStatement(sqlcmd2);
                pst2.setString(1,hd.getUserid());
                pst2.setString(2,hd.getSymbol());
                pst2.setString(3,hd.getStockName());
                pst2.setInt(4, hd.getQuantity());
                pst2.setFloat(5, hd.getBuyPrice());
                String date = hd.getBuyDate();
                java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy-mm-dd");
                java.util.Date dt = format.parse(date);
                java.sql.Date sqlDate = new java.sql.Date(dt.getTime());
                pst2.setDate(6,sqlDate);
                pst2.executeUpdate();
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void SellHoldings(HoldingsDetails hd) {
        String sqlcmd="SELECT QUANTITY FROM HOLDINGS WHERE SYMBOL=? AND USERID=?";
        String sqlcmd1 = "UPDATE HOLDINGS SET QUANTITY=? WHERE SYMBOL=? AND USERID=?";
        String sqlcmd2 = "DELETE FROM HOLDINGS WHERE SYMBOL=? AND USERID=?";
        int oldQuantity;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "STOCK_PROJECT", "abc123");
            PreparedStatement pst;
            pst = con.prepareStatement(sqlcmd);
            pst.setString(1,hd.getSymbol());
            pst.setString(2, hd.getUserid());
            ResultSet rs = pst.executeQuery();
            if(rs.next()) {
                oldQuantity=rs.getInt(1);
                if(oldQuantity==hd.getQuantity()) {
                    PreparedStatement pst1;
                    pst1=con.prepareStatement(sqlcmd2);
                    pst1.setString(1,hd.getSymbol());
                    pst1.setString(2,hd.getUserid());
                    pst1.executeQuery();
                }
                else {
                    PreparedStatement pst1;
                    pst1=con.prepareStatement(sqlcmd1);
                    pst1.setInt(1, oldQuantity-hd.getQuantity());
                    pst1.setString(2,hd.getSymbol());
                    pst1.setString(3,hd.getUserid());
                    pst1.executeQuery();
                }
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
