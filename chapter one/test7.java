public class test7 {
    public static void main(String[] args) {
        double result1 = 0;
        double result2 = 0;
        int flag = 1;
        for ( double i = 1 ; i <= 13 ; i=i+2 ){
            if(i <= 11){
                result1+=flag * (1/i);
                result2+=flag * (1/i);
            }else{
                result2+=flag * (1/i);
            }
            flag = flag * (-1);
        }
        result1 = 4 * result1;
        result2 = 4 * result2;
        System.out.println("result1 = " + result1) ;
        System.out.println("result2 = " + result2) ;
    }
}
