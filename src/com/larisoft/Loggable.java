package com.larisoft;

public class Loggable {


    protected void doLog(String message, String... params){

        if(params.length > 0){
            System.out.println(String.format(message, params));
        }
        else{
            System.out.println(message);
        }
    }

 
}

