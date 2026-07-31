package a0731.aven;

public class Avenger {
    String name; //이름 - 멤버변수
    int hp; //
    public Avenger(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }
    public void punch(Avenger enemy) {
        System.out.printf("[%s]의 펀치", name);
        enemy.hp -= 10;
        System.out.printf("-> %s의 체력 %d\n: ", enemy.name, enemy.hp);
        // %s는 문자열을 받을 때
    }
}
