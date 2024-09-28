class DongVat {
    void Keu() {
        System.out.println("Động vật đang Keu");
    }
}

class dog extends DongVat {
    @Override
    void Keu() {
        System.out.println("Gâu gâu");
    }
}

class cat extends DongVat {
    @Override
    void Keu() {
        System.out.println("Meow meow");
    }
}
public class Test{
     public static void main(String[] args) {
          DongVat vat = new dog();
          DongVat dong= new DongVat();
          dong.Keu();
          cat cat= new cat();
          cat.Keu();
          vat.Keu();
     }
}