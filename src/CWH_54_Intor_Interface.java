import java.util.SortedMap;

interface Cycle {
    public void Speedup(int Speed);

    public void Speeddown(int Break);
}
interface Cycle2{
    public void SpeepupC2(int Speed1);

    public void SpeeddownC2(int Break1);
}

class heroCycle implements Cycle,Cycle2 {
    int Speed;
    int Break;
@Override
    public void Speedup(int Speed) {
        this.Speed = Speed;
        System.out.println(Speed);
    }
@Override
     public void Speeddown(int Break) {
        this.Break = Break;
        System.out.println(Break);
    }
@Override
    public void SpeepupC2(int Speed1) {

    }
@Override
    public void SpeeddownC2(int Break1) {

    }
}

public class CWH_54_Intor_Interface {
    public static void main(String[] args) {
        Cycle C1 = new heroCycle(); // Can access only specific interface function & methods due to REFERANCE of fist inheritance.

        C1.Speeddown(10);
        C1.Speedup(90);

        heroCycle h1 = new heroCycle(); // CAN ACCESS ALL inhereted methods & function

    }



}
