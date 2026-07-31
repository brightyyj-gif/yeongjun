package a0731.account2;

public class Account {
    String owner; //예금주
    int balance; //잔액
    public Account(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }
    public void deposit(int i) {
        balance += i;
        System.out.printf("[%s] %d원 입금 -> 잔액: %d원\n", owner, i, balance);
    
    }

    public boolean withdraw(int i) {
        if (i > balance) {
            System.out.printf("[%s] 출금실패(잔액부족)\n", owner);
            return false;
        }
        balance -= i;
        System.out.printf("[%s] %d원 출금 -> 잔액: %d원\n", owner, i, balance);
        return true;
    }
    public boolean transfer(Account b, int i) {
        if(balance < i){
            System.out.println("(%s => %s) 송금 실패(잔액부족)\n", owner, target.owner);
            return false;
        }
        this.balance -= i; //철수의 잔액감소
        target.balance += i;
        }
    }
    

