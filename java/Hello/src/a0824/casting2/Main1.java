package a0824.casting2;

public class Main1 {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[5];
        vehicles[0] = new Sedan("아반떼", 1, 50000, 20000);
        vehicles[1] = new Truck("포터", 2, 0, 8, 15000);
        vehicles[2] = new ElectricCar("아이오닉", 3, 80000, 10000, 5);
        vehicles[3] = new Sedan("소나타", 4, 60000, 25000);
        vehicles[4] = new Truck("마이티", 5, 0, 6, 18000);

        System.out.println("==== 모든 차량 정보 출력 ====");
        for(Vehicle vh : vehicles){
            vh.printInfo();
        }
        System.out.println("==== 전체 요금 합계 ====");
        double totalFee = 0;
        for(Vehicle vh : vehicles){
            totalFee = totalFee + vh.calculateFee();
        }
        System.out.println("전체 요금 합계: " + String.format("%,.0f", totalFee));

        System.out.println("==== 차량 타입별 처리 ====");
        for(Vehicle vh : vehicles) {
            if(vh instanceof Sedan) {
                Sedan sd = (Sedan) vh;
                sd.driveSedan();
            }else if(vh instanceof Truck) {
                Truck tr = (Truck) vh;
                tr.haulCargo();
            }else if (vh instanceof ElectricCar) {
                ElectricCar ec = (ElectricCar) vh;
                ec.chargeBattery();
            }
        }
        System.out.println("\n=== 특정 차량 검색 ===");
        String searchName = "아반떼";
        Vehicle found = findVehicle(vehicles, searchName);
        if(found != null) {
            System.out.println("검색 결과");
            found.printInfo();
        } else {
            System.out.println(searchName + "을(를) 찾을 수 없습니다.");
        }
    }

    private static Vehicle findVehicle(Vehicle[] vehicles, String searchName) {
        for(Vehicle vh : vehicles) {
            if(vh.getName().equals(searchName)){
                return vh;
            }
        }
        return null;
    }
}
