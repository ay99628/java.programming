public class test11 {
    public static void main(String[] args) {
        int birth=7,death=13,h,immigrant=45,h1;
        double sum=312032486;
        h=birth-death;
        h1=h*immigrant+1;
        for(int i=1;i<=5;i++){
        sum=sum+365*(86400.0/immigrant)*h1;
        System.out.printf("第%d年人数: %f%n", i, sum);
        }
    }
}
