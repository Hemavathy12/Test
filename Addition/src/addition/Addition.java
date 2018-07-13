/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addition;

import java.util.Scanner;

/**
 *
 * @author I20869
 */
public class Addition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter 2 numbers :");
        int num_1=scanner.nextInt();
        int num_2=scanner.nextInt();
        Add(num_1,num_2);
    }
    public static int Add(int NUM_1,int NUM_2)
    {
        int sum=0;
        sum+=NUM_1+NUM_2;
        //System.out.println("Answer :"+sum);
        //return sum;
    }
    
}
