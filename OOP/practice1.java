//practiced making classes and related staffs

public class practice1 {
    public static void main(String[] args) {

        //problem 1
//        employee harry = new employee();
//        harry.setName("Code with harry");
//        harry.salary = 233;
//        System.out.println(harry.getSalary());
//        System.out.println(harry.getName());

        //problem 2
//        cellPhone asus = new cellPhone();
//        asus.ring();
//        asus.vibrate();
//        asus.callFriend();

        //problem3
//        square sq = new square(4);
//        System.out.println(sq.area());
//        System.out.println(sq.perimeter());

        //problem 5
//        tommyVecetti player1 = new tommyVecetti();
//        player1.fire();
//        player1.hit();
//        player1.run();

    }

//    1.    Create a class Employee with the following properties and methods:
//          Salary (property) (int)
//          getSalary (method returning int)
//          name (property) (String)
//          getName (method returning String)
//          setName (method changing name)

    static class employee{
        private int salary;
        private String name;

        public int getSalary(){
            return salary;
        }
        public void setSalary(int salary){
            this.salary = salary;
        }
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }
    }

//    2.    Create a class cellphone with methods to print “ringing…”, “vibrating…”, etc.

    static class cellPhone{
        public void ring(){
            System.out.println("Ringing...");
        }
        public void vibrate(){
            System.out.println("Vibrating...");
        }
        public void callFriend(){
            System.out.println("Calling Mukul...");
        }
    }

//    3.    Create a class Square with a method to initialize its side, calculating area, perimeter etc.

    static class square{
        int side;
        public square(int side){
            this.side = side;
        }
        public int area(){
            return side*side;
        }
        public int perimeter(){
            return 4*side;
        }
    }

//    4.    Create a class Rectangle & problem 3.

    static class rectangle{
        int a, b;
        public rectangle(int a, int b){
            this.a = a;
            this.b = b;
        }
        public int area(){
            return a*b;
        }
        public int perimeter(){
            return 2*(a+b);
        }
    }

//    5.    Create a class TommyVecetti for Rockstar Games capable of hitting (print hitting…), running, firing, etc.

    static class tommyVecetti{
        public void hit(){
            System.out.println("Hitting...");
        }
        public void run(){
            System.out.println("Running...");
        }
        public void fire(){
            System.out.println("Firing...");
        }
    }

//    6.    Repeat problem 4 for a circle.

    static class circle{
        int radius;
        public circle(int radius){
            this.radius = radius;
        }
        public double area(){
            return 3.1416*radius*radius;
        }
        public double perimeter(){
            return 3.1416*2*radius;
        }
    }
}
