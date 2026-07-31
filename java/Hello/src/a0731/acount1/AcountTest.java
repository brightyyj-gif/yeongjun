package a0731.acount1;

//하나의 .java 파일에는 public클래스를 하나만 만들 수 있다.
public class AcountTest {
    public static void main(String[] args) {
        Account a = new Account("123-45", 10000);
        Account b = new Account("567-89", 10000);
        while(a.transfer(b, 3000)) {
            //아무것도 안한다
        }
        System.out.println(a.toStr());
        System.out.println(b.toStr());
    }

    static class Account{
        String num; //계좌번호
        int balance; // 잔액

        public Account(String num, int balance) {
            this.num = num;
            this.balance = balance;
        }

        public String toStr() {
            return String.format("num : %s, balance : %d",num,balance);
        }

        public boolean transfer(Account b, int i) {
            if(balance < i){ //잔액이 송금액보다 작으면 거짓을 리턴
                return false;
            }
            balance = balance - i;
            b.balance = b.balance + i;
            return true;
        }
    }
    
}
