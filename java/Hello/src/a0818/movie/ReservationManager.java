package a0818.movie;

import java.util.ArrayList;
import java.util.Scanner;

public class ReservationManager {
    private ArrayList<Movie> movies; //영화목록
    private ArrayList<User> users; //사용자 목록
    private Scanner sc; //사용자 입력을 위한 스캐너
    private static Ticket ticket; //티켓 객체
    private int discountRate = 0;

    public ReservationManager(){
        movies = new ArrayList<>();
        users = new ArrayList<>();
        sc = new Scanner(System.in);
    }
    public void addMovie(Movie movie){
        movies.add(movie);
        //영화추가
    }

    public User getUser(String userName) {
        for(User user : users){
            if(user.getName().equals(userName)){
                return user;
            }
        }
        return null;
    }

    public Movie getMovie(String title) { // Movies를 순회하면서 이름이 일치하는 영화를 반환
        for(Movie movie : movies){
            if(movie.getTitle().equals(title)){
                return movie;
                //영화 제목이 같으면 해당 영화 객체를 반환
            }
        }
        return null;
    }
    public void showMovies() {
        System.out.println("\n 현재 상영 중인 영화 목록");
        for(Movie movie : movies){
            System.out.println(movie);
            //movie 클래스에 toString() 출력
        }
    }
    public void movieReservation() {
        System.out.println("영화 제목 입력 : ");
        String title = sc.nextLine();
        System.out.println("사용자 이름 입력 : ");
        String userName = sc.nextLine();
        Movie movie = getMovie(title);
        if(movie == null){
            System.out.println("해당 영화가 없습니다.");
        }
        movie.getTheater().displaySeats(); //좌석보기
        System.out.print("좌석 번호 선택 : ");
        int seatNumber = Integer.parseInt(sc.nextLine()); //문자를 숫자로

        if(bookSeat(userName, title, seatNumber)){
            int price = movie.getPrice();
            int discount = (price * discountRate) / 100;
            int finalPrice = price - discount;
            System.out.println("예매가 완료되었습니다.");
            System.out.println("원가 : " + price + "원");
            System.out.println("할인율 : " + discountRate + "%");
            System.out.println("할인된 금액 : " + discount + "원");
            System.out.println("결제 금액 : " + finalPrice + "원");
            //사용자에게 결제 금액 누적
            User user = getUser(userName);
            if(user != null){
                user.addTotalPaid(finalPrice);
            }
        } else{
            
        }
}
    private boolean bookSeat(String userName, String title, int seatNumber) {
        Movie movie = getMovie(title);
        if(movie == null){
            System.out.println("해당 영화가 없습니다.");
            return false;
        }
        if(!movie.getTheater().reserveSeat(seatNumber)){
            //좌석예약을 시도했는데 실패했다면 안내메세지 띄우고 작업중단
            System.out.println("이미 예약된 좌석이거나 잘못된 좌석입니다.");
            return false;
        }
        User user = getUser(userName); //유저 존재 확인
        if(user == null){
            //user가 없으면 새로 생성
            user = new User(userName);
            users.add(user);
        }
        user.addReservation(title, seatNumber); //유저 예약 추가(영화 제목과 좌석 번호)
        return true;
    }
    public void checkReservation() {
        System.out.println("사용자 이름 입력");
        String userName = sc.nextLine();
        User user = getUser(userName);
        for (int i = 0; i < user.getReservedMovies().size(); i++) {
            System.out.println("예매번호: " + user.getReservationNumbers().get(i) +
                               " | 영화: " + user.getReservedMovies().get(i) +
                               " | 좌석: " + user.getReservedSeats().get(i));
            }
            System.out.println("총 결재 금액 : " );

    }
    public void cancelReservation() {
        System.out.print("사용자 이름 입력: ");
        String userName = sc.nextLine();
        User user = getUser(userName);
    
        if (user == null || user.getReservedMovies().isEmpty()) {
            System.out.println(userName + "님은 예약된 내역이 없습니다.");
            return;
        }
        user.showReservations();
        //예약목록출력
        System.out.print("취소할 예매 번호를 입력하세요 : ");
        int reservationNumber = sc.nextInt();
        sc.nextLine();
        int index = user.getReservationNumbers().indexOf(reservationNumber);
        //내용이 같으면 인덱스 번호 다르면 -1
        if(index == -1) {
            System.out.println("해당 예매번호의 예약이 없습니다.");
            return;
        }
        String movieTitle = user.getReservedMovies().get(index);
        //영화제목 가져오기
        int seatNumber = user.getReservedSeats().get(;)

    }
}