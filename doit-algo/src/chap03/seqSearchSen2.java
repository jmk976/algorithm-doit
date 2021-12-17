
    import java.util.Scanner;

    public class seqSearchSen2 { // 선형 검색을 구현한 프로그램
    static int seqSearch(int[] a, int n, int key){
        
        int i = 0;

 
   

 //보초법  Sentinel method
        a[n] = key;

        while(true){
            if(a[i] == key){
                break;
            }
            i++;
        }
        return i == n ? -1: i;


    }
    
    public static void main(String [] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수:");
        int num = stdIn.nextInt();
        int[] x = new int[num+1];

        for(int i = 0; i < num; i ++){
            System.out.print("x["+ i + "] :");
            x[i] =stdIn.nextInt();

        }

        System.out.print("검색할 값:");
        int ky = stdIn.nextInt();

        int idx = seqSearch(x, num, ky);

        if(idx == -1){
            System.out.println("There's no element having the value.");

        }else {
            System.out.println(ky+"는 x["+idx+"]에 있습니다. ");
        }
    }
}


