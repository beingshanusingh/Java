/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armstrong;

/**
 *
 * @author Shanu Singh
 */
public class Armstrong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int c=0,a,temp;
        int n=153;//The Number we will check
        temp=n;//Assigning the n to temp
        while(n>0){
            a=n%10;
            n=n/10;
            c=c+(a*a*a);
        }
        if(temp==c){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("It is not an armstrong number");
        }
    }
    
}
