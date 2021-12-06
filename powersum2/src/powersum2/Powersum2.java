/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package powersum2;

import java.util.Scanner;

/**
 *
 * @author CHUKWUEMEKA
 */
public class Powersum2 {
    
     static int powerSum(int num, int n)
    {
        if (n == 0)
            return 1;
        else if (n % 2 == 0)
            return powerSum(num, n / 2) * powerSum(num, n / 2);
        else
            return num * powerSum(num, n / 2)
                * powerSum(num, n / 2);
    }

// Function to check power representations recursively
    static int checkRecursive(int x, int n, int curr_num,
                              int curr_sum)
    {
        // Initialize number of ways to express
        // x as n-th powers of different natural
        // numbers
        int results = 0;
 
        // Calling powerSum of 'i' raised to 'n'
        int p = powerSum(curr_num, n);
        while (p + curr_sum < x) {
            // Recursively check all greater values of i
            results += checkRecursive(x, n, curr_num + 1,
                                      p + curr_sum);
            curr_num++;
            p = powerSum(curr_num, n);
        }
 
        // If sum of powers is equal to x
        // then increase the value of result.
        if (p + curr_sum == x)
            results++;
 
        // Return the final result
        return results;
    }
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Integer X");
        int x = Integer.parseInt(sc.nextLine());
        
        System.out.println("Enter power N");
        int n = Integer.parseInt(sc.nextLine());
        
        System.out.println(checkRecursive(x, n, 1, 0));
    
    }
    
}
