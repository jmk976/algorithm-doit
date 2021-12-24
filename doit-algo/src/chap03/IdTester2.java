 class Id2 {

    private static int counter=0;
    private int id;

    public Id2(){id=++counter;}
    
    public int getId() { return id; }

    public static int getCounter(){ return counter; }
}

public class IdTester2{
    public static void main(String[] args){
        Id2 a = new Id2();
        Id2 b = new Id2();


        System.out.println("a의 아이디 : "+ a.getId());
        System.out.println("b의 아이디 : "+ b.getId());

        System.out.println(" 아이디 갯수 : "+ Id2.getCounter());  
    }
}
