package ManojJavaJun;


class Getterclass{

    int salary ;
    String name ;


    public void printname(){
        System.out.println(this.name);
    }
    public void setName(String xyz){
        this.name = xyz;
    }

    public String getName(){
       return this.name;
    }
    public void allInfo(){

        System.out.println(this.name);
        System.out.println(this.salary);

    }



}

public class GetterSetterPract {
    public static void main(String[] args) {
        Getterclass g1 = new Getterclass();


        g1.salary = 30000;
        g1.setName("Poco");

        g1.printname();
        g1.allInfo();


    }

}
