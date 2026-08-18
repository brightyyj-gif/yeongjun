package a0818.movie;

import java.util.ArrayList;

public class User {
    private String name;
    private ArrayList<Integer> reservationNumbers;
    //예매번호 저장
    private ArrayList<String> reservedMovies;
    //예매한 영화 제목 저장
    private ArrayList<Integer> reservedSeats;
    //예매한 좌석 번호 저장
    private static int reservationCounter = 1;
    //모드ㅜㄴ 사용자가 공유하느 예매번호
    private int totalPaid = 0;
    //누적 결제 금액
    public User(String name) {
        this.name = name;
        this.reservationNumbers = new ArrayList<>();
        this.reservedMovies = new ArrayList<>();
        this.reservedSeats = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public ArrayList<Integer> getReservationNumbers() {
        return reservationNumbers;
    }
    public ArrayList<String> getReservedMovies() {
        return reservedMovies;
    }
    public ArrayList<Integer> getReservedSeats() {
        return reservedSeats;
    }
    public static int getReservationCounter() {
        return reservationCounter;
    }
    public int getTotalPaid() {
        return totalPaid;
    }
    
    public void addReservation(String title, int seatNumber){
          // TODO: 
        // 1. reservedMovies에 movieTitle 추가
        // 2. reservedSeats에 seatNumber 추가
        // 3. reservationCounter를 사용하여 예매번호 부여 (나중에 추가)
        reservedMovies.add(title);
        //예매한 영화 제목저장
        reservedSeats.add(seatNumber);
        //예매한 좌석 번호 저장
        reservationNumbers.add(reservationCounter++);
        //예매번호 부여후 증가
    }
    public void addTotalPaid(int amount) {
        totalPaid += amount; //금액누적
    }
}
