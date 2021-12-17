public class DayOfYear2 { // y년  i 월의 일수를 mdays[isLeap(y)][i-1]로 구하기
    static int[][] mdays={
        {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, //평년
        {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, //윤년

    };

    //서기 year은 윤년인가? yes:1
    static int isLeap(int year){
        return(year%4==0&&year%100!=0||year%400==0)? 1:0;
    }

    //서기 y년 m월 d일의 그 해 경과 일 수 를 구함
    static int dayOfYear(int y, int m, int d){
        int day=0;
        for(int i = 0; i <m-1; i++)
           day+=mdays[isLeap(y)][i];
        
        day+=d;
      return day;
    }
    
    public static void main(String[] args){
        System.out.println(dayOfYear(2021, 12, 25));
    }
}
