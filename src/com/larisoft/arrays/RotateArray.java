package com.larisoft.arrays;

import com.larisoft.Loggable;
import com.larisoft.Solution;

import java.util.Arrays;

public class RotateArray extends Loggable implements Solution {


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

        int[] sample = new int[]{1,2,3,4,5};
        //reverse_array(sample, 0, 2);
        rotateArrayT(sample, 1);
        return this;
    }

    private int[] reverse_array(int[] arr, int start, int end){

        String copy = Arrays.toString(arr);

        int i = start, j= end;

        while(i < j) {

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            j--;
            i++;
        }


        doLog("Reversed array: before %s, after:%s, start: %s, end: %s ", new String[]{ copy, Arrays.toString(arr), start+"", end+""});

        return arr;
    }




    private void rotateArrayT(int[] arr, int places){

        int top = arr.length-1;
        arr = reverse_array(arr, 0, top);
        arr =  reverse_array(arr, 0, top - places);
        arr = reverse_array(arr, top-places+1, top);

        this.setSolution(arr);
    }

    private void rotateArray(int[] arr, int places){

        int top = arr.length -1;
        arr = reverse_array(arr, 0, top);
        arr = reverse_array(arr, 0, top-places);
        arr = reverse_array(arr, top - places+1, top);

        doLog(Arrays.toString(arr));

        this.setSolution(arr);

    }

    //succeded when i pictured how this structure will behave (while displayed) in real life
    private void SecondTryRotateArrays(int[] arr, int places){

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
