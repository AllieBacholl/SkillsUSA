
package foodprogram;

/**
 * Register calculates prices and running totals
 * @author Allie Bacholl
 */



public class Register {
    final double HOTDOGPRICE = 2.5;
    final double BRATPRICE = 3.5;
    final double HAMBURGERPRICE = 5;
    final double FRIESPRICE = 2;
    final double SODAPRICE = 2;
    final double WATERPRICE = 0;
    
    public double totalPrice(int hotDogs, int brats, int hamburgers, int fires, int sodas, int waters) {
        double totalHotDogPrice = hotDogs * HOTDOGPRICE;
        double totalBratsPrice = brats * BRATPRICE;
        double totalHamburgersPrice = hamburgers * HAMBURGERPRICE;
        double totalFriesPrice = fires * FRIESPRICE;
        double totalSodasPrice = sodas * SODAPRICE;
        double totalWaterPrice = waters * WATERPRICE;
        
        double totalPrice = totalHotDogPrice + totalBratsPrice + totalHamburgersPrice + totalFriesPrice + totalSodasPrice + totalWaterPrice;
        return totalPrice;
    }
    
    public int checkInt(String input) {
        int checkedInt = -1;
        
        checkedInt = Integer.parseInt(input);
        if (checkedInt < 0) {
            
        }
        
        
        return checkedInt;
    }
}
