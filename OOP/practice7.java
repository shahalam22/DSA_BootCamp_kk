//Exercise & Practice Questions on Inheritance
//https://www.codewithharry.com/videos/java-tutorials-for-beginners-52/

public class practice7 {

    static class circle{
        private int radius;

        public int getRadius() {
            return radius;
        }
        public void setRadius(int radius) {
            this.radius = radius;
        }

        public circle(int radius){
            this.radius = radius;
        }
        public double area(){
            return 3.1416*radius*radius;
        }
        public double perimeter(){
            return 2*3.1416*radius;
        }
    }

    static class cylinder extends circle{
        private int height;

        public int getHeight() {
            return height;
        }
        public void setHeight(int height) {
            this.height = height;
        }

        public cylinder(int radius, int height){
            super(radius);
            this.height = height;
        }
        public double perimeter(){
            return 4*super.getRadius() + 2*height;
        }
        public double area(){
            return (2*super.perimeter())+(2*3.1416*super.radius*height);
        }
        public double volume(){
            return height*super.area();
        }
    }

    static class rectangle{
        private int b, h;

        public int getB() {
            return b;
        }
        public void setB(int b) {
            this.b = b;
        }
        public int getH() {
            return h;
        }
        public void setH(int h) {
            this.h = h;
        }

        public rectangle(int b, int h){
            this.b = b;
            this.h = h;
        }
        public double area(){
            return b*h;
        }
        public double perimeter(){
            return 2*(b+h);
        }
    }

    static class cuboid extends rectangle{
        int l;
        public cuboid(int b, int h, int l){
            super(b, h);
            this.l = l;
        }
        public double perimeter(){
            return ((2*super.perimeter())+(4*l));
        }
        public double area(){
            return l*super.area();
        }
        public double totalSurfaceArea(){
            return ((2*super.area())+(l*super.perimeter()));
        }
        public double volume(){
            return l*super.getH()*super.getB();
        }
    }

    public static void main(String[] args) {
        //implementing circle
//        circle c = new circle(5);
//        System.out.println(c.area());
//        System.out.println(c.perimeter());

        //implementing cylinder
//        cylinder cy = new cylinder(2, 4);
//        System.out.println(cy.area());
//        System.out.println(cy.perimeter());

        //implementing rectangle
//        rectangle rec = new rectangle(2, 3);
//        System.out.println(rec.area());
//        System.out.println(rec.perimeter());

        //implementing cuboid
//        cuboid cub = new cuboid(1, 2, 3);
//        System.out.println(cub.area());
//        System.out.println(cub.totalSurfaceArea());
//        System.out.println(cub.perimeter());
    }
}
