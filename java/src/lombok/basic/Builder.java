package lombok.basic;

public class Builder {
    public static void main(String[] args) {
        // Pikachu
        Pikachu pikachu = new Pikachu.PikachuBuilder()
                                     .energy(100)
                                     .type("전기")
                                     .level(10)
                                     .build();
        System.out.println(pikachu);
        pikachu.setEnergy(200);
        System.out.println("에너지 : " + pikachu.getEnergy());

        // Person
        Person person = new Person();
        Person person2 = new Person("원이", 20);
        Person person3 = new Person("제나", 20, 160, 40);
        System.out.println("이름 : " + person2.getName());
        System.out.println("이름 : " + person3.getName());

    }
}
