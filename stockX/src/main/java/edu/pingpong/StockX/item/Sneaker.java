package edu.pingpong.StockX.item;

import java.util.List;

public class Sneaker implements Item{
    private String style;
    private String name;
    private int sale;
    private int ask;
    private int bid;

    public Sneaker(String style, String name){
        this.style = style;
        this.name = name;
    }
    private String getStyle() {
        return style;
    }

    private String getName() {
        return name;
    }

    public int getAsk() {
        return ask;
    }

    @Override
    public int getSale() {
        return this.sale;
    }

    @Override
    public void add(Offer offer) {

    }

    @Override
    public List<Offer> offers() {
        return null;
    }

    public int getBid() {
        return bid;
    }
    @Override
    public void setSale(int sale) {
        this.sale = sale;
    }
    @Override
    public void setAsk(int ask) {
        this.ask = ask;
    }
    @Override
    public void setBid(int bid) {
        this.bid = bid;
    }
    @Override
    public String toString(){
        return getName() + " " + getStyle();
    }
}
