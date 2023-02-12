interface firstParent{
    void meth1();
    void meth2();
}
interface secondParent extends firstParent{
    void meth3();
    void meth4();
}
class FirstChild implements secondParent{
    public void meth1(){
        System.out.println("Meth 1");
    }
    public void meth2(){
        System.out.println("Meth 2");
    }
    public void meth3(){
        System.out.println("Meth 3");
    }
    public void meth4(){
        System.out.println("Meth 4");
    }
}
public class first{
    public static void main(String[] args){
        secondParent obj=new FirstChild();
        obj.meth1();
        obj.meth4();
    }
}