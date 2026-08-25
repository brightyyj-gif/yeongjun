package a0825.enum1;

public class Main1 {
    public static void main(String[] args) {
        Day today = Day.WEDNSDAY;
        if(today == Day.WEDNSDAY) {
            System.out.println("수요일은 스터디가 있는 날입니다.");
        }
// switch 문과 함께 쓸 때 매우 강력합니다.
        switch (today) {
            case MONDAY:
                System.out.println("월요병 극복!");
                break;
            case WEDNSDAY:
                System.out.println("주말까지 이틀 남음!");
                break;
            default:
                System.out.println("평일 또는 주말");
        }
    }
}
