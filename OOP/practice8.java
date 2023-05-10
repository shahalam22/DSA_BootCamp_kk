//practice of abstract class
//https://www.codewithharry.com/videos/java-tutorials-for-beginners-54/

//abstract class is a standard class of the project. Jeta use kore amra program er onno class banate parbo ar ei onno class gulate must be abstract class er abstract methode thakte hobe. Mane notun create kora class e must be standard er methode ache eta ensure kora jay abstract class diye

//example one
abstract class phone{
    abstract void on();
}

class smartPhone extends phone{
    @Override
    void on() {
        System.out.println("Turning on...");
    }
}

//example two
abstract class parent2{
    public parent2(){
        System.out.println("hai base2 ka constructor hoon.");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}

class child2 extends parent2{
    @Override
    public void greet() {
        System.out.println("Good morning");
    }
    @Override
    public void greet2() {
        System.out.println("Good afternoon");
    }
}

//ekhane ekta class abstract class e extend korle hoy abstract class er sob abstract method oi class e thakte hobe nahole notun class ta ke abstract hote hobe
abstract class child3 extends parent2{
    public void th(){
        System.out.println("I'm good");
    }
}

public class practice8 {

    public static void main(String[] args) {

        //example one
        phone obj = new smartPhone();
        obj.on();

        //example two
        //parent2 p = new parent2();    //this shows error
        child2 c2 = new child2();
    }

}
