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
        float checkedFloat;
        
        try {
            if (Grade == null) {
                Error nullNumber = new Error();
                throw nullNumber;
            }
            checkedFloat = Float.parseFloat(Grade);
            checkedInt = Math.round(checkedFloat);
            
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
        int total = (int) list.get(0);
        
        for (int i = 0; i < list.size() - 1; i++) {
            total += (int) list.get(i);
        }
        
        classAverage = (double) total/ (double) list.size();
        classAverageInt = (int) Math.round(classAverage);
        
        return classAverageInt;
    }
    
    public int calcHigh(ArrayList list) {
        int highestGrade = 0;
        
        for (int i = 0; i < list.size(); i++) {
            if (highestGrade < (int) list.get(i)) {
                System.out.println("YES");
                highestGrade = (int) list.get(i);
            }
        }
        
        return highestGrade;
    }
    
    public int calcLow(ArrayList list) {
        int lowestGrade = 0;
        
        for (int i = 0; i < list.size(); i++) {
            if (lowestGrade > (int) list.get(i)) {
                lowestGrade = (int) list.get(i);
            }
        }
        
        return lowestGrade;
    }
}
