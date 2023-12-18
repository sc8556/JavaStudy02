class inheritanceAnimal{
    String name;
    void setName(String name){
        this.name = name;
    }
}

class Dog extends inheritanceAnimal{
    void sleep(){
        System.out.println(this.name + " zzz");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("happy");
        System.out.println(dog.name);
        dog.sleep();
    }
}
