//code of Inheritance, uses of super keyword, constructors in inheritance

public class practice4 {

    static class Base1{
//        private int x;

        //getter & setter
//        public int getX(){
//            return x;
//        }
//        public void setX(int x){
//            System.out.println("I am in the base and setting x now.");
//            this.x = x;
//        }
        Base1(){
            System.out.println("I am a constructor");
        }
        Base1(int x){
            System.out.println("I am an overloaded constructor with the value of x as : "+x);
        }
    }

    static class Derived1 extends Base1{
//        private int y;

        //getter & setter
//        public int getY(){
//            return this.y;
//        }
//        public void setY(int y){
//            System.out.println("I am in the derived and setting Y.");
//            this.y = y;
//        }
        Derived1(){
            System.out.println("I am a derived class constructor");
        }
        Derived1(int y){
            //super();
            System.out.println("I am an overloaded constructor of Derived1 with value of y as : "+y);
        }
        Derived1(int x, int y){
            super(x);
            System.out.println("I am an overloaded constructor of Derived1 with value of y as : "+y);
        }
    }

    static class childOfDerived extends Derived1{
        childOfDerived(){
            System.out.println("I am a child of derived constructor");
        }
        childOfDerived(int x, int y, int z){
            super(x, y);
            System.out.println("I am an overloaded constructor of childOfDerived with value of z as : "+z);
        }
    }
    //deleteable

    static class EkClass{
        int a;
        public int getA() {
            return a;
        }
        EkClass(int a){
            this.a = a;
        }
        public int returnone(){
            return 1;
        }
    }
    static class DoClass extends EkClass{
        DoClass(int c){
            super(c);
            System.out.println("I am a constructor");
        }
    }

    //Method overRiding
    static class A{
        public void met1(){
            System.out.println("I am the methode 1 of class A");
        }
    }

    static class B extends A{
        public void met1(){
            System.out.println("I am the methode 1 of class B");
        }
    }

    public static void main(String[] args) {

//        Base1 b1 = new Base1();
//        Base1 b2 = new Base1(4);

//        Derived1 d1 = new Derived1();
//        Derived1 d2 = new Derived1(5);
//        Derived1 d3 = new Derived1(6,7);

//        childOfDerived c1 = new childOfDerived();
//        childOfDerived c2 = new childOfDerived(8, 9, 10);

//        EkClass e = new EkClass(65);
//        DoClass d = new DoClass(5);
//        System.out.println(e.getA());

        //Methode overriding
        A a = new A();
        a.met1();

        B b = new B();
        b.met1();
    }
}
