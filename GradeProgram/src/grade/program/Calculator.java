/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grade.program;

import java.util.ArrayList;

/**
 * Calculates grade values
 * @author Allie Bacholl
 */
public class Calculator {
    
    /**
     * Verifies that the user input is a valid value and rounds that value to the nearest integer
     * @param Grade String that the user entered
     * @return      Rounded grade as an integer
     */
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
    
    /**
     * Calculates the average of the passed array list
     * @param list  List that will be averaged
     * @return      Average of the list rounded to the nearest integer
     */
    public int calcAverage(ArrayList list) {
        double classAverage;
        int classAverageInt;
        int total = (int) list.get(0);
        
        for (int i = 0; i < list.size() - 1; i++) {
            total += (int) list.get(i + 1);
        }
        
        System.out.println(total);
        classAverage = (double) total/ (double) list.size();
        classAverageInt = (int) Math.round(classAverage);
        
        return classAverageInt;
    }
    
    /**
     * Calculates the highest value in the passed array list
     * @param list  List that the highest value will be found in
     * @return      The highest value in the passed list
     */
    public int calcHigh(ArrayList list) {
        int highestGrade = 0;
        
        for (int i = 0; i < list.size(); i++) {
            if (highestGrade < (int) list.get(i)) {
                highestGrade = (int) list.get(i);
            }
        }
        
        return highestGrade;
    }
    
    /**
     * Calculates the lowest value in the passed array list
     * @param list  List that the lowest value will be found in
     * @return      The lowest value in the passed list
     */
    public int calcLow(ArrayList list) {
        int lowestGrade = 100;
        
        for (int i = 0; i < list.size(); i++) {
            if (lowestGrade > (int) list.get(i)) {
                lowestGrade = (int) list.get(i);
            }
        }
        
        return lowestGrade;
    }
}
