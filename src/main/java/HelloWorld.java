public class HelloWorld {

    public native void print();

    public native int isItFive();

    static {
        System.loadLibrary("hello");
    }

    public static void main(String [] args){
        HelloWorld hello = new HelloWorld();
        hello.print();
        System.out.printf("Is it Five? %d\n", hello.isItFive());
    }
}
