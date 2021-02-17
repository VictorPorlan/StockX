package edu.pingpong.StockX.criteria;
import java.util.ArrayList;
import edu.pingpong.StockX.item.Bid;
import edu.pingpong.StockX.item.Item;
import edu.pingpong.StockX.item.Offer;
import java.util.List;

public class Bids implements Criteria{
    private List<Offer> bids = new ArrayList<Offer>();
    public Bids(){}

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        for (int i = 0; i < sneaker.offers().size(); i++){
            if(sneaker.offers().get(i) instanceof Bid){
                this.bids.add(sneaker.offers().get(i));
            }
        }
        return bids;
    }
}
/* Me hubiera gustado hacer el filtro con un stream, pero por algun motivo no me deja usarlo. No tengo
el tiempo para encontrar que error estoy cometiendo asi que hago simplemente un if dentro de un for
 */
