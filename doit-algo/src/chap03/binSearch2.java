import java.util.Scanner;
public class binSearch2 {

    static int binSearch(int[] a, int n, int key){
        int pl = 0; //검색범위의 첫 인덱스
        int pr = n -1; //검색범위의 끝 인덱스

        do{
//중앙요소의 인덱스
int pc = (pl+pr)/2;
//검색 성공!
if(key == a[pc]){

    return pc;
} else if( key > a[pc]){
    pl = pc+1;


//검색 범위를 뒤쪽 절반으로 좁힘
} else{
    pr=pc-1;
}
//검색범위를 앞쪽 절반으로 좁힘
        }while(pl <= pr);

      return -1;  //검색 실패!
    }
    


    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수:");

        int num = stdIn.nextInt();
        int[] x = new int[num];

        System.out.print("x[0]:");
        x[0] = stdIn.nextInt();
        
        for(int i = 1; i < num; i ++){
            do{
                System.out.print("x["+i+"]:");
             x[i] = stdIn.nextInt();
        
            }while(x[i] <x[i-1]);
        }

        System.out.print("검색할 값:");
        int ky = stdIn.nextInt();

        int idx = binSearch(x, num, ky);
        
        if(idx == -1){
            System.out.println("그 값의 요소가 없습니다. ");
        }else{
            System.out.println(ky +"는  x["+idx+"]에 있습니다.");
        }
    }
}
