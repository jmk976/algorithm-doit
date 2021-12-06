package practice;

import java.util.Scanner;

public class Difference {

    static int diff(int a){
        int b = 1;
        int c = 10;

        while( true ){
            if(c > a){

                break;
            } else {
                b++;
                c = c*10;
            }
        };


       return b;
    }


    public static void main(String [] args){
         Scanner stdIn = new Scanner(System.in);

         System.out.println("숫자를 입력하시오.");
         int d = stdIn.nextInt();

         System.out.println(diff(d)+"자리 수 입니다.");

    }
    
}
