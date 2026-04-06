
package inheritanceExercises;

public class ChildClass extends ParentClass {
    
    int multi(int a, int b)
    {
        return a*b;
    }
    
    public static void main(String[] args)
    {
        ChildClass c1 = new ChildClass();
        int b = c1.addition(5, 10);
        System.out.println(b);
    }
    
}
