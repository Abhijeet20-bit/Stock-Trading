/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockTrading.Model;

/**
 *
 * @author Hp
 */
public class HoldingsDetails {
    private String Userid;
    private String Symbol;
    private String StockName;
    private float BuyPrice;
    private int Quantity;
    private String BuyDate;
    private float Amount;

    /**
     * @return the Userid
     */
    public String getUserid() {
        return Userid;
    }

    /**
     * @param Userid the Userid to set
     */
    public void setUserid(String Userid) {
        this.Userid = Userid;
    }

    /**
     * @return the Symbol
     */
    public String getSymbol() {
        return Symbol;
    }

    /**
     * @param Symbol the Symbol to set
     */
    public void setSymbol(String Symbol) {
        this.Symbol = Symbol;
    }

    /**
     * @return the StockName
     */
    public String getStockName() {
        return StockName;
    }

    /**
     * @param StockName the StockName to set
     */
    public void setStockName(String StockName) {
        this.StockName = StockName;
    }

    /**
     * @return the BuyPrice
     */
    public float getBuyPrice() {
        return BuyPrice;
    }

    /**
     * @param BuyPrice the BuyPrice to set
     */
    public void setBuyPrice(float BuyPrice) {
        this.BuyPrice = BuyPrice;
    }

    /**
     * @return the Quantity
     */
    public int getQuantity() {
        return Quantity;
    }

    /**
     * @param Quantity the Quantity to set
     */
    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    /**
     * @return the BuyDate
     */
    public String getBuyDate() {
        return BuyDate;
    }

    /**
     * @param BuyDate the BuyDate to set
     */
    public void setBuyDate(String BuyDate) {
        this.BuyDate = BuyDate;
    }

    /**
     * @return the Amount
     */
    public float getAmount() {
        return Amount;
    }

    /**
     * @param Amount the Amount to set
     */
    public void setAmount(float Amount) {
        this.Amount = Amount;
    }
}
