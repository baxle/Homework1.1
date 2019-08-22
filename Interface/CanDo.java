package CandyGift.Interface;


import CandyGift.Sweets.Sweet;

public interface CanDo {
     void add(Sweet sweet);
     void remove();
     double getTotalWeight();
     int getTotalPrice();
     void getAllInfo();


}
