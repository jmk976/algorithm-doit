public class PrimeNumber22 { //1000안에서의 소수

    public static void main(String[] args){
        int counter =0; //나눗셈의 횟수
        int ptr = 0; //찾은 소수의 개수
        int[] prime = new int[500]; //소수 저장 배열


        prime[ptr++] =2;

        for(int n = 3; n <= 1000; n+=2){
            int i; // 찾은 소수로 나누기 위해 소수 꺼내기
            for(i = 1; i <ptr; i++){
                counter++;
                if(n%prime[i]==0){// 나누어 떨어지면 소수가 아니다
               
                    break;

                }
                
            }
            if(i == ptr){
                prime[ptr++]=n;
            }


        }

        for(int i =0; i < ptr; i++){
            System.out.println(prime[i]);


        }
        System.out.println("나눗셈을 수행한 횟수: "+ counter);
    }
    
}
