// Finding Missing Number in an Array //
package com.example;

import java.util.Scanner;

public final class test {
      
      public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of elements in the array");
            int n = Integer.parseInt(sc.nextLine());
            String oldstr = "";
            int[] arr = new int[n];
            int min = arr[0];
            int max = arr[0];
            System.out.println("Enter the elements in the array");

            for(int i = 0; i < n; i++){
                arr[i] = Integer.parseInt(sc.nextLine());
                max = Math.max(max, arr[i]);
                min = Math.min(max,arr[i]);
                oldstr = oldstr+arr[i]+",";
            }
            
            System.out.println("Min: "+min+" Max: "+max);
            for(int i=min; i<=max; i++){
                if(oldstr.contains(""+i)) continue;
                else System.out.println("Missing number: "+i);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }        
      }
}
