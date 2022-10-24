package com.larisoft.arrays;

import com.larisoft.Solution;

import java.util.Arrays;

public class RotateArray implements Solution {


    private String solution;

    private Solution mSolution;

    int[] result;
    public RotateArray(){

        this.mSolution = this;
    }

    private void setSolution(int[] solution ){

        this.solution = Arrays.toString(solution);
    }

    public Solution solve(){

        int[] sample = new int[]{1, 2, 3, 4, 5, 6, 7};
        rotateArrays(sample, 2);
        return this;
    }

    //succeded when i pictured how this structure will behave (while displayed) in real life
    private void rotateArrays(int[] arr, int places){

        for (int i = 0; i < places; i++){

            int temp = arr[0];
            for(int j = 0; j < arr.length-1; j++){

                arr[j] = arr[j+1];
            }

            arr[arr.length-1] = temp;
        }

        setSolution(arr);

    }


    //failed because i didnt focus on the structure of the problem - but instead threw solutions to see which will stick
    private void FirstTryRotateArrays(int[] arr, int places){

        for(int i = 0; i <= places; i++){

            int temp = arr[i];
            arr[i] = arr[arr.length-1];
            arr[arr.length-1]= temp;
        }

        this.solution = Arrays.toString(arr);
    }

    @Override
    public String getSolution() {
        return this.solution;
    }
}
