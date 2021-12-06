/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package powersum;

import java.io.*;
import java.util.*;

public class Powersum {

//    static int powerSum(int x, int power, int num){
//        
//        int variable = (int)Math.pow(num,power);
//        
//        if(variable < x){
//            return powerSum(x,power,num+1) + powerSum(x+variable,power,num+1) ;
//        }
//        else if(x == variable){
//            return 1;
//        }
//        else{
//            return 0;
//        }
//
//       
//    }
    
    static int powerSum(int X, int N) {
        return calc(X,N,1);
    }

    static int calc(int x, int n, int num) {
        int numToN= (int) Math.pow(num,n);
        if (numToN > x) {
            return 0;
        }
        else if (numToN == x) {
            return 1;
        }
        else {
            return (calc(x,n,num+1) + calc(x-numToN,n,num+1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Integer X");
        int X = Integer.parseInt(sc.nextLine());
        
        System.out.println("Enter power N");
        int N = Integer.parseInt(sc.nextLine());
        
        
//        System.out.println("Enter expected integer");
//        int num = Integer.parseInt(sc.nextLine());
        
        int result = powerSum(X,N);
        
        System.out.println(result);
        sc.close();
    }
    
    
    
}
