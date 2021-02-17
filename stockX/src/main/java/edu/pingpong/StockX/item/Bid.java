package edu.pingpong.StockX.item;

public class Bid {
    private String size;
    private Integer bid;

    public Bid(String size, Integer bid) {
        this.size = size;
        this.bid = bid;
    }

    public String getSize() {
        return size;
    }

    public Integer getBid() {
        return bid;
    }
    @Override
    public String toString(){
        return "";
    }
}
