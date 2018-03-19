public class test extends PojoA{
    public test(String name, int age) {
        super(name, name);
    }
    public void print(){
        System.out.println("My name is "+getName()+", and I am "+getAge()+".");
    }
}
