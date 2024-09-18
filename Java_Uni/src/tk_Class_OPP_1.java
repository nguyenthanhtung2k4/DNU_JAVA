

//  Vd: OPP cơ bản 


class Animal {
        String name;
        // Ham aniamal
        Animal(String name) {
            this.name = name;
            System.out.println("Animal constructor: " + name);
        }
    }
//  Ham, Dog chưa  Animal
class Dog extends Animal {
        // Ham Dog
        Dog() {
            // hàm gọi lại Animal  trong Dog ( Thằng cha trong thằng con)
            super("Buddy");
            System.out.println("Dog constructor");
        }
    }

public class tk_Class_OPP_1 {
        public static void main(String[] args) {
            Dog myDog = new Dog();
            System.out.println("dog :\n"+myDog);
        }
    }