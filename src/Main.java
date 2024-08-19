public class Main {
    int x=5;
    int y;
    static void method(){
        for(int i=0;i<=10;i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Main myObj1 = new Main();
        System.out.println(myObj1.x);
        method();
        Main myObj2 = new Main();
        myObj2.y = 20;
        System.out.println(myObj2.y);
    }
}
