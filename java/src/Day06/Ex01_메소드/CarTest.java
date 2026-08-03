package Day06.Ex01_메소드;

public class CarTest {

    public static void main(String[] args) {
        // 객체 생성
        Car car = new Car();
        car.model = "페라리";
        car.setSpeed(140);

        System.out.println("model : " + car.model);
        System.out.println("speed : " + car.getSpeed());
        
        car.setSpeed(-50);
        System.out.println("speed : " + car.getSpeed());

        car.setSpeed(400);
        System.out.println("speed : " + car.getSpeed());
    }

    
}
