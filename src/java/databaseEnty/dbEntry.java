/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseEnty;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Hp
 */
public class dbEntry {
    public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, IOException, SQLException{
        // TODO code application logic here
        String filePath="C:\\Users\\Hp\\Documents\\NetBeansProjects\\StockTrading\\CSV\\data.csv"; 
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","STOCK_PROJECT","abc123");
            con.setAutoCommit(false);
            String sqlcmd="insert into STOCKSNAME (SYMBOL,NAME,LAST_SALE,NET_CHANGE,PER_CHANGE,MARKET_CAP,COUNTRY,IPO,VOLUME,SECTOR,INDUSTRY) values (?,?,?,?,?,?,?,?,?,?,?)";
            int batchSize=20;
            PreparedStatement pst=con.prepareStatement(sqlcmd);
            BufferedReader lineReader=new BufferedReader(new FileReader(filePath));
            String lineText=null;
            int count=0;
            lineReader.readLine();
            while((lineText=lineReader.readLine())!=null) {
                String[] data=lineText.split(",");
                String symbol=data[0];
                String NAME=data[1];
                String LAST_SALE=data[2];
                String NET_CHANGE=data[3];
                String PER_CHANGE=data[4];
                String MARKET_CAP=data[5];
                String COUNTRY=data[6];
                String IPO=data[7];
                String VOLUME=data[8];
                String SECTOR=data[9];
                String INDUSTRY=data[10];
                
                pst.setString(1,symbol);
                pst.setString(2, NAME);
                pst.setString(3, LAST_SALE);
                pst.setFloat(4, parseFloat(NET_CHANGE));
                pst.setString(5, PER_CHANGE);
                pst.setFloat(6, parseFloat(MARKET_CAP));
                pst.setString(7, COUNTRY);
                pst.setInt(8, parseInt(IPO));
                pst.setInt(9, parseInt(VOLUME));
                pst.setString(10, SECTOR);
                pst.setString(11, INDUSTRY);
                pst.addBatch();
                if(count%batchSize==0) {
                    pst.executeBatch();
                }
            }
            lineReader.close();
            pst.executeBatch();
            con.commit();
            con.close();
            System.out.println("Data inserted into Database");
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println(e);
        }
    }
}
