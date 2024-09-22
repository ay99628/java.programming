public class test10 {
    public static void main(String[] args) {
        double kilometers=14,mile,minute=45,second=30,hour,speed;
        hour=minute/60+second/3600;
        mile=1/1.6*kilometers;
        speed=mile/hour;
        System.out.println(speed);
    }

}
