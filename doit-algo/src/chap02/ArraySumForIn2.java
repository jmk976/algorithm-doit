public class ArraySumForIn2 {
    public static void main(String[] args){
        double[] a ={1.0, 2.0, 3.0, 4.0, 5.0};

        double sum = 0.0;

        for(double i: a){
            sum += i;
        };

        System.out.println(sum);
    }
    
}
