import java.util.Scanner;

public class ArrayEqual2 {

    static boolean equals(int[] a, int[] b){
        if(a.length != b.length){
            return false;


        }

        for(int i = 0; i< a.length; i++){
            if(a[i] != b[i]){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("number of elements of array a: ");
        int na = stdIn.nextInt();

        int[] a = new int [na];

        for(int i = 0; i< na; i++){
            System.out.print("a[" + i + "] : ");
            a[i] = stdIn.nextInt();
        }

        System.out.print("number of elements of array b: ");

        int nb = stdIn.nextInt();

        int[] b = new int[nb];

        for(int i = 0; i < nb; i++){
            System.out.print("b[" + i + "] :");
            b[i] = stdIn.nextInt();
        }

        System.out.println("Array a and b are " + 
                            (equals(a, b)? "same." :"different."));
    }

}
