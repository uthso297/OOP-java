public class Main {
    int x=5;
    int y;
    static void method(){
        for(int i=0;i<=10;i++){
            System.out.println(i);
        }
    }
    public void publicmethod(){
        System.out.println("This is public method");
    }
    public void car(){
        System.out.println("The car is going as fast as it can");
    }
    public void speed(int maxspeed){
            System.out.println("Max speed is " +maxspeed);
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Main myObj1 = new Main();
        System.out.println(myObj1.x);
        method();
        Main myObj2 = new Main();
        myObj2.y = 20;
        System.out.println(myObj2.y);
        Main myObj3 = new Main();
        myObj3.publicmethod();
        Main myCar = new Main();
        myCar.car();
        myCar.speed(59);
    }
}
