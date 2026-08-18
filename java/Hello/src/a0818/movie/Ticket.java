package a0818.movie;

/**
 * Ticket
 */
public class Ticket {
    private ReservationManager reservationManager; //예약관리자

    public Ticket(ReservationManager reservationManager) {
        this.reservationManager = reservationManager;
    }

    //기존 예약 관리자를 받아서 사용하도록 변경

}
