public class PhysicalExamination2 {
// 신체검사 데이터의 알람표를 나타내고 평균키와 시력 분포를 보여준다

static final int VMAX = 21;

static class PhyscData{
    String name;
    int height;
    double vision;

    PhyscData(String name, int height, double vision){
        this.name = name;
        this.height = height;
        this.vision = vision;

    }
}

//키의 평균값
static double aveHeight(PhyscData[] dat){
    double sum =0;
    
    for(int i =0; i < dat.length; i++){
        sum+=dat[i].height;

      
    }
    return sum/dat.length;
}

//시력분포를 구함
 static void distVision(PhyscData[] dat, int[] dist){

    int i =0;

    dist[i] =0;
    for(i=0; i< dat.length; i++){
        if(dat[i].vision>=0.0 && dat[i].vision <= VMAX/10.0){
            dist[(int)(dat[i].vision*10)]++;
        }
    }


 }

 public static void main(String[] args){

    PhyscData[] x ={
        new PhyscData("김민규",164,0.3),
        new PhyscData("김민규",174,0.4),
        new PhyscData("김민규",184,0.5),
        new PhyscData("김민규",174,0.6),


    };

    int[] vdist = new int[VMAX];
    System.out.println("신체 검사 리스크 ");
    System.out.println("이름       키   시력");

    System.out.println("--------------------- ");

    for(int i = 0; i <x.length; i ++){
        System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);

    }
    System.out.printf("\n평균 키 : %5.1fcm/n", aveHeight(x));

    distVision(x, vdist);

    System.out.println("\n시력 분포");
    for(int i = 0; i <VMAX; i++){
        System.out.printf("%3.1f~: %2d명 \n", i /10.0, vdist[i]);
    }

 }
    
}
