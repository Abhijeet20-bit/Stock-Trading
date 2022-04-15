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
public class StockDetails {
    private String StockSymbol;
    private String StockName;
    private float StockOpen;
    private float StockHigh;
    private float StockLow;
    private float StockClose;
    private double volume;

    /**
     * @param StockName
     * @return the StockSymbol
     */
    
    public StockDetails(String StockName) {
        this.StockName=StockName;
        this.StockClose=0;
        this.StockSymbol=null;
        this.StockHigh=0;
        this.StockLow=0;
        this.StockOpen=0;
        this.volume=0;
    }
    public String getStockSymbol() {
        return StockSymbol;
    }

    /**
     * @param StockSymbol the StockSymbol to set
     */
    public void setStockSymbol(String StockSymbol) {
        this.StockSymbol = StockSymbol;
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
     * @return the StockOpen
     */
    public float getStockOpen() {
        return StockOpen;
    }

    /**
     * @param StockOpen the StockOpen to set
     */
    public void setStockOpen(float StockOpen) {
        this.StockOpen = StockOpen;
    }

    /**
     * @return the StockHigh
     */
    public float getStockHigh() {
        return StockHigh;
    }

    /**
     * @param StockHigh the StockHigh to set
     */
    public void setStockHigh(float StockHigh) {
        this.StockHigh = StockHigh;
    }

    /**
     * @return the StockLow
     */
    public float getStockLow() {
        return StockLow;
    }

    /**
     * @param StockLow the StockLow to set
     */
    public void setStockLow(float StockLow) {
        this.StockLow = StockLow;
    }

    /**
     * @return the StockClose
     */
    public float getStockClose() {
        return StockClose;
    }

    /**
     * @param StockClose the StockClose to set
     */
    public void setStockClose(float StockClose) {
        this.StockClose = StockClose;
    }

    /**
     * @return the volume
     */
    public double getVolume() {
        return volume;
    }

    /**
     * @param volume the volume to set
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }
    
}
