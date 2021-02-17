/*package edu.pingpong.StockX.criteria;

import edu.pingpong.StockX.item.Bid;
import edu.pingpong.StockX.item.Item;
import edu.pingpong.StockX.item.Offer;

import java.util.ArrayList;
import java.util.List;

public class MaxBid implements Criteria{
    private List<Offer> maxBid = new ArrayList<Offer>();
    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        Criteria bids = new Bids();
        Offer max;
        max = bids.checkCriteria(sneaker).get(0);
        for (int i = 0; i < bids.checkCriteria(sneaker).size(); i++) {
            if (bids.checkCriteria(sneaker).get(i).value() > max.value())
                max = bids.checkCriteria(sneaker).get(i);
        }
        this.maxBid.add(max);
        return maxBid;
    }

        }*/

