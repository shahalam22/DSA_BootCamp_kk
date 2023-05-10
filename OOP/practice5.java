//Dynamic method dispatch

//link to: https://www.codewithharry.com/videos/java-tutorials-for-beginners-49/

public class practice5 {

    //dynamic method dispatch
    static class Phone{
        public void showTime(){
            System.out.println("Time is 8 am");
        }
        public void on(){
            System.out.println("Turning on Phone...");
        }
    }

    static class SmartPhone extends Phone{
        public void music(){
            System.out.println("Playing Music...");
        }
        public void on(){
            System.out.println("Turning on SmartPhone...");
        }
    }

    public static void main(String[] args) {
        //Phone obj = new Phone();      //allowed
        //SmartPhone smobj = new SmartPhone();  //allowed

        Phone obj = new SmartPhone();       //allowed
        //SmartPhone obj2 = new Phone();    //not allowed

        obj.showTime();
        obj.on();
        //obj.music();    //not allowed. Can't access child class's attributes or methods from this.
    }
}
