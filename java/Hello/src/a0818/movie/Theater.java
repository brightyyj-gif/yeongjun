package a0818.movie;

import java.util.ArrayList;

/**
 * Theater
 */
public class Theater {
    private ArrayList<String> seats;

        public Theater(int seatCount) {
            seats = new ArrayList<>();
            for(int i = 0; i < seatCount; i++){
                seats.add((i+1) + ""); //문자로 저장("")
                //초기 좌석 번호 저장
            }
        }
        public void displaySeats(){
            System.out.println("\n 좌석 배치 (예약돤좌석: X)");
            for(int i = 0; i < seats.size(); i++){
                System.out.printf("%2s ", seats.get(i));
                //좌석 번호 또는 "X" 출력
                if((i + 1) % 10 == 0) System.out.println(); //10개가 채워지면 줄바꿈
            }
        }

        // TODO: 
    // 1. seatNumber가 유효한 범위인지 확인 (1 ~ seats.size())
    // 2. 해당 좌석이 이미 예약되었는지 확인 ("X"인지 확인)
    // 3. 예약되지 않았다면 "X"로 변경하고 true 반환
    // 4. 그렇지 않으면 false 반환
    // 주의: 인덱스는 0부터 시작하므로 seatNumber - 1 사용
        public boolean reserveSeat(int seatNumber){
            if(seatNumber > 0 && seatNumber <= seats.size() && !seats.get(seatNumber-1).equals("X")){
                seats.set(seatNumber - 1, "X");
                //좌석예약시 인덱스 번호 해당하는 값을 "X" 변경
                return true;
            }
            return false;
        }
        public int getAvailableSeats(){
            int count = 0;
            for(String seat : seats){
                if(!seat.equals("X")) count++;
                //예약되지 않은 좌석 수 카운트
            }
            return count;
            //"X"가 아닌 좌석의 개수를 세어서 반환
        }
        public void cancelSeat(int seatNumber) {
            if(seatNumber > 0 && seatNumber <= seats.size() && seats.get(seatNumber -1).equals("X"));
            seats.set(seatNumber-1, String.valueOf(seatNumber)); //seatNumber 를 문자로 변경저장
        }
    }

