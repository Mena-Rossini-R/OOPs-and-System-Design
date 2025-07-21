package InnerClasses;

public class MemberInnerClass{ 
    public static void main(String[] args){
        A outer = new A();
        A.B inner = outer.new B();
        inner.display();
    }
}

class A{
    private int a = 8;
    private int b = 9;
    class B{
        public void display(){
            System.out.println(a + " " + b);
        }
    }

}