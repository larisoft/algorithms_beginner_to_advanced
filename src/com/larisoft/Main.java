package com.larisoft;

import com.larisoft.arrays.BucketSortArray;
import com.larisoft.arrays.RotateArray;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Solution solution = new BucketSortArray();
        String solutionString = solution.solve().getSolution();
        System.out.println("Solution " + solutionString);
    }
}
