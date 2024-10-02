class DongVat  {
    void Keu() {
        System.out.println("Động vật đang Keu");
    }
}

class Dog extends DongVat  {
    @Override
    void Keu() {
        System.out.println("Gâu gâu");
    }
}

class Cat extends DongVat  {
    @Override
    void Keu() {
        System.out.println("Meow meow");
    }
}
public class tk_Class_OPP_DaHinh {
    public static void main(String[] args) {
        DongVat dongVat= new  DongVat();
        DongVat dog= new  Dog();
        DongVat cat= new  Cat();
        dog.Keu();
        cat.Keu();
    }
    
}