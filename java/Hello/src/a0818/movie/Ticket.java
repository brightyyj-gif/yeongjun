package a0818.movie;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Ticket
 */
// 의존성(Dependency) - Ticket 클래스가 정상적으로 동작하려면 ReservationManager(예약 관리자)가 필요함 이를 의존한다 표현
// 주입(injection) : Ticket이 직접 ReservationManager를 코드내부 생성하는것이 아니라
// 객체를 만드는 주체(외부)기 생성해서 생성자의 매개변수로 쏙 넣어주는(주입하는) 방식
public class Ticket {
    private ReservationManager reservationManager; //예약관리자

    //기존 예약 관리자를 받아서 사용하도록 변경 - DI (의존성 주입)
    public Ticket(ReservationManager reservationManager) {
        this.reservationManager = reservationManager;
    }

    public void printTicket(int reservationNum) {
        try {
            File dir = new File("C:\\movieTicketer");
            if(!dir.exists()){ //폴더가 없으면
                dir.mkdir(); //디렉토리(폴더) 생성
            }
            File file = new File(dir, "ticket_" + reservationNum + ".txt");
            boolean isNewFile = file.createNewFile();
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))){
                if(file.canWrite()) {
                    if(!isNewFile) {
                        bufferedWriter.newLine();
                    }
                    //예매 정보를 가져와서 저장
                    String ticketInfo = reservationManager.getReservationDetails(reservationNum);
                    if(ticketInfo == null) {
                        System.out.println("예매 정보를 찾을 수 없습니다.");
                        return;
                    }
                    bufferedWriter.write(ticketInfo);
                    bufferedWriter.flush(); //저장
                    System.out.println("티켓출력 성공");
                } else{
                    System.out.println("티켓 출력 실패 : 권한문제");
                }

            }

        } catch (Exception e) {
            System.out.println("티켓 출력 실패 : " + e.getMessage());
        }
    }

    public void updateMovieList() {
        File file = new File("C:\\movieTicketer\\movieList.txt");

        if(!file.exists()){
            System.out.println("movieList.txt 파일이 존재하지 않습니다.");
            return;
        }
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"))) {
            String line;
            System.out.println("======================================");

            while ((line = bufferedReader.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue; //빈줄일 때는 ㅇ돌아감     
                
                String[] movies = line.split("/");
                if(movies.length != 4){
                    System.out.println("잘못된 형식의 영화 정보 : " + line );
                }
                try {
                    String title = movies[0];//영화제목
                    String genre = movies[1];//상영시간
                    int rows = Integer.parseInt(movies[2]);//가격
                    int totalSeats = Integer.parseInt(movies[3]);//총좌석
                    //중복영화확인
                     if (reservationManager.getMovie(title) != null) {
                        System.out.println("중복된 영화 [" + title + "] 은(는) 추가되지 않습니다.");
                        continue;
                    }
                    Movie movie = new Movie(title, genre, rows, totalSeats);
                    reservationManager.addMovie(movie);
                    System.out.println("영화 추가됨: "+ movie.getTitle());
                    
                } catch (NumberFormatException e) {
                    System.out.println("좌석 수 또는 행 수가 잘못된 숫자입니다." + line);
                }
            }
            
        } catch (IOException e) {
            System.out.println("파일 읽기 오류" + e.getMessage());
        }
    }

    

}
