/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grade.program;

import java.util.ArrayList;

/**
 *
 * @author albac
 */
public class Calculator {
    
    public int verifyGrade(String Grade){
        int checkedInt = -1;
        double checkedDouble;
        
        try {
            if (Grade == null) {
                Error nullNumber = new Error();
                throw nullNumber;
            }
            checkedDouble = Double.parseDouble(Grade);
            checkedInt = (int) Math.round(checkedDouble);
            
            if (checkedInt < 0 || checkedInt > 100) {
                Error negativeNumber = new Error();
                throw negativeNumber;
            }
        }
        catch (NumberFormatException | Error e) {
            throw e;
        }
        
        return checkedInt;
    }
    
    public int calcAverage(ArrayList list) {
        double classAverage;
        int classAverageInt;
        double total = 0;
        
        for (int i = 0; i < list.size() - 1; i++) {
            total += (double) list.get(i);
        }
        
        classAverage = total/ (double) list.size();
        classAverageInt = (int) Math.round(classAverage);
        
        return classAverageInt;
    }
    
    public int calcHigh(ArrayList list) {
        int highestGrade = 0;
        
        highestGrade = (int) list.get(0);
        for (int i = 0; i < list.size() - 1; i++) {
            if (highestGrade < (int) list.get(i)) {
                highestGrade = (int) list.get(i);
            }
        }
        
        return highestGrade;
    }
    
    public int calcLow(ArrayList list) {
        int lowestGrade = 0;
        
        lowestGrade = (int) list.get(0);
        for (int i = 0; i < list.size() - 1; i++) {
            if (lowestGrade > (int) list.get(i)) {
                lowestGrade = (int) list.get(i);
            }
        }
        
        return lowestGrade;
    }
}
