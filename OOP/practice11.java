//anonymous class, singleton class, enum class and related staffs

//https://www.programiz.com/java-programming/anonymous-class

public class practice11 {

    //anonymous class by extending SuperClass

//    static class polygon {
//        public void display(){
//            System.out.println("Inside the polygon class");
//        }
//    }
//
//    static class anonymousDemo{
//        public void createClass(){
//            polygon p1 = new polygon(){
//                //this is an anonymous class
//                public void display(){
//                    System.out.println("Inside an anonymous class");
//                }
//            };
//            p1.display();
//        }
//    }

    //anonymous class by implementing interface

    interface polygon{
        public void display();
    }

    static class anonymousDemo {
        public void createClass(){
            //creating anonymous class
            polygon p1 = new polygon() {
                @Override
                public void display() {
                    System.out.println("Inside an anonymous class");
                }
            };
            p1.display();
        }
    }

    public static void main(String[] args) {
        anonymousDemo an = new anonymousDemo();
        an.createClass();
    }
}
