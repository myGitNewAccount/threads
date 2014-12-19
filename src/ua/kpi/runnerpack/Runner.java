/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package ua.kpi.runnerpack;

import java.util.Scanner;

/**
*
* @author Anton
*/
public class Runner {

/**
* @param args the command line arguments
*/
    public static void main(String[] args) {
        final StringBuffer strBuff = new StringBuffer();
        strBuff.append("1");

        Thread first = new Thread(new Runnable(){
        public void run(){
            int counter = 0;
            while(Integer.valueOf(strBuff.toString()) != 10){
                counter++;
            }
            System.out.println(counter);
            }
        });

        Thread second = new Thread(new Runnable(){
        public void run(){
            Scanner in = new Scanner(System.in);
            if(in.hasNextInt()){
                strBuff.append(in.nextInt());
            }
        }
        });
        first.start();
        second.start();
    }
}