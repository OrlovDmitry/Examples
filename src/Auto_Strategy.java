public class Auto_Strategy {
    FillStrategy fillStrategy;

    public Auto_Strategy(FillStrategy fillStrategy) {
        this.fillStrategy = fillStrategy;
    }

    public void gas(){
        System.out.println ("������");
    }
    public void stop(){
        System.out.println ("��������");
    }
    public void fill (){
        fillStrategy.fill();
    }

    public void setFillStrategy(FillStrategy fillStrategy) {
        this.fillStrategy = fillStrategy;
    }
}
class Audi extends Auto_Strategy{

    public Audi() {
        super (new PetrolFilling ());
    }

}

interface FillStrategy{
    public void fill();
}

class PetrolFilling implements FillStrategy{
    public void fill(){
        System.out.println ("������������ ������");
    }
}
class GasFilling implements FillStrategy{
    public void fill(){
        System.out.println ("������������ �����");
    }
}
