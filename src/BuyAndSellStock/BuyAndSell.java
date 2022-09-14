package BuyAndSellStock;

public class BuyAndSell {
    public static void main(String[] args) {
        int prices[] = {7,6,4,3,1};
        int lowestPrice = prices[0];
        int lowestPosition = 0;
        for (int i = 1 ; i <= (prices.length - 1); i++){
            if( lowestPrice > prices[i]){
                lowestPrice = prices[i];
                lowestPosition = i;
            }
        }
        int dayToBuy = lowestPrice;
        int lowestBuyPosition =  lowestPosition ;

        int highestPrice = lowestPrice;
        for (int i = lowestPosition; i <= (prices.length - 1); i++){

            if(  prices[i] > highestPrice ){
                highestPrice = prices[i];
            }
        }

        int profit = highestPrice - lowestPrice;
        System.out.println(profit);

    }
}
