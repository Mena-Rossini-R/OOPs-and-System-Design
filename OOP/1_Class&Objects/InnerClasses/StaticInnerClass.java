package InnerClasses;

public class StaticInnerClass {
    public static void main(String[] args){
        A.B inner = new A.B(); // to create a inner obj
        inner.display();
    }
}

class A{
    private static int a = 8;
    private static  int b = 9; //cant access a non static members in a static content
    static class B{
        public void display(){
            System.out.println(a + " " + b);
        }
    }

}
/* static = for calling the thing which has static we dont have to call the obj for that


so to call class B....we dont need to create an obj of class A

but as the method inside class B is not static 
 
 */