package practice;

class Min3{

    static int min3(int a, int b, int c){
        int min =a;
        if(min > b) min = b;
        if(min > c) min = c;
        
        return min;
    }

    public static void main(String[] args){

        int m = min3(5, 7, 3);
        System.out.println(m);
    }
}