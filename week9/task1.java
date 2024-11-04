   class task1 {
    public static void main(String[] args) {
        Circle circle1 = new Circle(); // obejct-1
        System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());
        Circle circle2 = new Circle(25); // obejct-2
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
// Create a cricle with radius 125
        Circle circle3 = new Circle(125);
        System.out.println("The area of the circle of radius " + circle3.radius + " is " + circle3.getArea());
        circle2.radius = 100;
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
    }
}

    class Circle {
        double radius;
        Circle() {
            radius = 1;
        }
            Circle (double newRadius){
                radius = newRadius;
            }
            double getArea (){
                return radius * radius * Math.PI;
            }
            double getPerimeter(){
                return 2 * Math.PI * radius;
            }
            void setRadius (double newRadius) {
                radius = newRadius;}
}
