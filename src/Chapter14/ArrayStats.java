//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayStats {
    private int[] listOfNumbers;

    public ArrayStats() {
        setVars(null);
    }

    public ArrayStats(int[] array) {
        setVars(array);
    }

    public void setVars(int[] array) {
        listOfNumbers = array;
    }


    public int getNumGroupsOfSize(int size) {
        int cnt = 1;
        int amount = 0;
        int prevNumber = 0;
        for (int num : listOfNumbers) {
            if (num == prevNumber) {
                cnt++;
            } else {
                cnt = 1;
            }
            if (cnt == size) {
                amount++;
            }
            prevNumber = num;
        }
        return amount;
    }

    public String toString() {
        return Arrays.toString(listOfNumbers);
    }
}