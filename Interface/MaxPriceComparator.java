package CandyGift.Interface;

import CandyGift.Sweets.Sweet;

import java.util.Comparator;

public class MaxPriceComparator implements Comparator<Sweet> {
    @Override
    public int compare(Sweet a, Sweet b) {
        int dif = (a.price - b.price);
        return ( dif < 0.0 ) ? 1 : ( dif > 0.0 ) ? -1 : 0;
    }
}
