package com.larisoft.arrays;

import com.larisoft.Loggable;
import com.larisoft.Solution;

import java.util.Arrays;

public class BucketSortArray extends Loggable implements Solution {


    String solution;

    @Override
    public Solution solve() {

        int[] sample = new int[]{1202,2023,2933,1111, 10000};

        int max = getMax(sample);

        doLog("Max is " + max);

        int[] bucket = new int[max+1];

        for(int i = 0; i < sample.length; i++){

            bucket[sample[i]] = sample[i];
        }

        int j  =0 ;
        int i = 0;

        while(j < bucket.length) {

                if (bucket[j] > 0) {
                    sample[i] = bucket[j];
                    i++;
                }
                j++;
            }


        this.solution = Arrays.toString(sample);
        return this;
    }



    private int getMax(int[] arr){

        int max  = arr[0];

        for(int i = 0; i < arr.length; i ++){

            if(max < arr[i]) max = arr[i];
        }

        return max;
    }
    @Override
    public String getSolution() {
        return solution;
    }
}
