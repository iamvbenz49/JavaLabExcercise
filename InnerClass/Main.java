package InnerClass;

public class Main{
    public static void main(String[] args) {
        OuterClass oclass = new OuterClass();
        OuterClass.staticInnerClass innerStaticClass = new OuterClass.staticInnerClass();
        innerStaticClass.display();
        oclass.methodWInnerClass();
        oclass.displayInterface();
        OuterClass.innerClass innercls = oclass.new innerClass();
        innercls.display();
        
    }
}
class OuterClass{
    static class staticInnerClass{
        static void display(){
            System.out.println("Inner static Class");
        }
    }
    public class innerClass{
        void display(){
            System.out.println("Inner  class");
        }
    }
    void methodWInnerClass(){
        class methodInnerClass{
            void display(){
                System.out.println("Method Inner Class ");
            }
        }
        methodInnerClass method = new methodInnerClass();
        method.display();
    }
    interface Greeting{
        void greet();
    }
    void displayInterface(){
        Greeting greet = new Greeting(){
            public void greet(){
                System.out.println("Hello THere");
            }
        };
        greet.greet();
    }
}