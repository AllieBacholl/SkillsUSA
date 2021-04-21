
package foodprogram;

import javax.swing.JOptionPane;

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
    
    /**
     * Totals the price of passed items
     * @param hotDogs       Hot dogs bought
     * @param brats         Brats bought
     * @param hamburgers    Hamburgers bought
     * @param fries         Fries bought
     * @param sodas         Sodas bought
     * @param waters        Waters bought
     * @return              The total price of all entered items
     */
    public double totalPrice(int hotDogs, int brats, int hamburgers, int fries, int sodas, int waters) {
        double totalHotDogPrice = hotDogs * HOTDOGPRICE;
        double totalBratsPrice = brats * BRATPRICE;
        double totalHamburgersPrice = hamburgers * HAMBURGERPRICE;
        double totalFriesPrice = fries * FRIESPRICE;
        double totalSodasPrice = sodas * SODAPRICE;
        double totalWaterPrice = waters * WATERPRICE;
        
        double totalPrice = totalHotDogPrice + totalBratsPrice + totalHamburgersPrice + totalFriesPrice + totalSodasPrice + totalWaterPrice;
        return totalPrice;
    }
    
    /**
     * Ensures that the entered strings are integers and positive.
     * @param input     String user entered
     * @return          The string parsed into an integer
     * @throws Error    Error if string is not an integer or negative 
     */
    public int checkInt(String input) throws Error{
        int checkedInt = -1;
        
        checkedInt = Integer.parseInt(input);
        if (checkedInt < 0) {
            Error negativeNumber = new Error();
            throw negativeNumber;
        }

        return checkedInt;
    }
}
