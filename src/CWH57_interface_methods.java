import javax.jws.soap.SOAPBinding;

interface F1 {
    void f1();

    void f2();
}

interface FF2 extends F1 {
    void FF1();

    void FF2();
}

class C1 {
    public void C1CHECK() {
        System.out.println("Calss one C1");
    }
}

class C2 extends C1 implements FF2 {

    public void f1() {
        System.out.println("f1 printing from class C2");
    }

    public void f2() {
        System.out.println("f2");
    }

    public void FF1() {
        System.out.println("ff1 printing from class C2");
    }

    public void FF2() {
        System.out.println("ff2");
    }

}


public class CWH57_interface_methods {
    public static void main(String[] args) {
        C2 c = new C2();
        c.f1();
        c.f2();
        c.FF1();
        c.FF2();

    }


}
