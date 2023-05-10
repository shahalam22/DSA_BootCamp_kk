//practiced constructors, getters, setters, this keyword etc

public class practice2 {
    public static void main(String[] args) {
        //CWH class
//        CWH obj1 = new CWH();
//        CWH obj2 = new CWH("Code with harry", 42);

        //employee class
//        employee emp1 = new employee();
//        employee emp2 = new employee("Rahul");
//        employee emp3 = new employee("Abir", 39);
//        System.out.println(emp1.getName());
//        System.out.println(emp2.getName());
//        System.out.println(emp3.getName());
    }

    static class CWH{
        //default constructor
        CWH(){
            System.out.println("This is the default constructor.");
        }
        //non-default or parameterized constructor
        CWH(String s, int b){
            System.out.println("This is the " +b+ "th video of the "+s);
        }
    }

    //constructor overloading, getters, setters, this keyword
    static class employee{
        private int id;
        private String name;

        //default constructor
        public employee(){
            this.id = 0;
            this.name = "Your-Name-Here";
        }
        public employee(String name){
            this.id = 1;
            this.name = name;
        }
        public employee(String name, int id){
            this.id = id;
            this.name = name;
        }

        //getters
        public int getId(){
            return this.id;
        }
        public String getName(){
            return this.name;
        }

        //setters
        public void setId(int id){
            this.id = id;
        }
        public void setName(String name){
            this.name = name;
        }
    }
}
