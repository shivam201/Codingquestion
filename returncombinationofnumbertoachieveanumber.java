//return combination of number to achieve number//
package com.example;

import java.util.ArrayList;

public class test2 {
    public static void main(String[] args) { //1,2,3,4,5,6 and 8
        ArrayList<Integer> arry = new ArrayList<Integer>();
        arry.add(1);
        arry.add(2);
        arry.add(3);
        arry.add(4);
        arry.add(5);
        arry.add(6);
        
        int numbertoachieve = 8;
        String arrylist = arry.toString();
        for(int i=0;i<arry.size();i++)
        {
            int num = numbertoachieve-arry.get(i);         
            if(arrylist.contains(""+num))
            {
                System.out.println("Number is "+arry.get(i)+" and "+num);
            }
            else
            {
                arrylist = arrylist.replaceAll(""+num, "");
            }
        }
    }
}
