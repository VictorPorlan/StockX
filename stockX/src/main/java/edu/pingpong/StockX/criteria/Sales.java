package edu.pingpong.StockX.criteria;
import java.util.ArrayList;

import edu.pingpong.StockX.item.Sale;
import edu.pingpong.StockX.item.Item;
import edu.pingpong.StockX.item.Offer;
import java.util.List;

public class Sales implements Criteria{
    private List<Offer> sales = new ArrayList<Offer>();
    public Sales(){}

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        for (int i = 0; i < sneaker.offers().size(); i++){
            if(sneaker.offers().get(i) instanceof Sale){
                this.sales.add(sneaker.offers().get(i));
            }
        }
        return sales;
    }
}