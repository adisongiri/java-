public class Main {
    public static void main(String[] args)
    {
        int [] x={10,20,30};
        int [][] y={{10,20,30},
                {20,90,100},
                {30,60,90}};
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println(y[i][j]);
            }
           // System.out.println(x[i]);
        }
//        System.out.println(x[2]);
//        System.out.println(y[0][1]);
    }
}