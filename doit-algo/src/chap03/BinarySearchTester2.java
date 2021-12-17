import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester2 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("number of element:");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        System.out.println("오름차순으로 입력하세요.");

        System.out.println("x[0]:");
        x[0] = stdIn.nextInt();

        for(int i = 1; i < num; i++){
            do{
                System.out.print("x["+ i +"]:");
                x[i] = stdIn.nextInt();
            } while(x[i] < x[i-1]);
        }

        System.out.print("value to search:");
        int ky = stdIn.nextInt();

        int idx = Arrays.binarySearch(x, ky);

        if( idx <0){
            System.out.println("There's no same value");
        }else{
            System.out.println(ky+" is in x["+idx+"]");
        }
    }
    
}



