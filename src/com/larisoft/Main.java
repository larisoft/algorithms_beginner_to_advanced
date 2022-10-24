package com.larisoft;

import com.larisoft.arrays.RotateArray;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Solution solution = new RotateArray();
        String solutionString = solution.solve().getSolution();
        System.out.println("Solution " + solutionString);
    }
}
