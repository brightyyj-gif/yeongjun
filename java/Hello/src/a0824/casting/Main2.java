package a0824.casting;

public class Main2 {
    public static void main(String[] args) {
        Vehicle v = new Car();
        // 업캐스팅(자식의 객체를 부모 타입 변수에 담음)
        // 겉모습은 Vehicle 실제 안에 Car 객체가 들어있음
        v.start();
        // 다형성
        // Vehicle에 있는 start()를 호출하는 것 같지만 실제 객체는 Car이므로 오버라이딩 된 Car의 자동차 시동이 출력된다
        v.stop();
        // 부모에만 있는 메서드 호출 가능
        // 실제 객체가 Car에는 stop()이 없으므로 부모의 "차량 정지"가 출력됨

        // v.drive(); 부모타입의 눈에는 Car 전용메서드인 drive()보이지 않음

        Car c = (Car) v;
        // 다운캐스팅(부모 타입을 다시 원래의 자식타입으로 강제 형 변환)
        // v안에 들어있는 진짜 객체가 Car였기 때문에 안전하게 변환 가능
        c.drive();

        if(v instanceof Car) { // 정말 Car인지 확인하고 맞으면 
            ((Car) v).drive(); // 다운 캐스팅
        }
        if(v instanceof Car) { // Car인지 아닌지
            Car c1 = (Car) v;
            c1.drive();
        }
    }
}

class Vehicle {
    void start() {
        System.out.println("차량 시작");
    }

    void stop() {
        System.out.println("차량 정지");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("자동차 시동");
    }
     void drive() {
        System.out.println("자동차 주행");
     }
}
