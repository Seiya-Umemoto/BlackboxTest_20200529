import java.util.Scanner;
/**
 * ABC수족관 입장료를 연령에 따라 계산하는 메소드
 * 
 * @author (2018315056 우메모토 세이야, 2018225129 이재근, 2018315056 우메모토 세이야) 
 * @version (2020/05/29)
 */
public class CalAdm
{
    int fee; // fee = ABC 수족관 입장료
    int aged; // 나이
    /**
     * calAdm 메소드 - ABC수족관 입장료를 연령에 따라 계산하는 메소드
     * 
     * @param  age   입력된 사용자의 나이
     * @return     fee   0세이상 150세미만일 경우에 해당되는 요금을 반환 
     *                   그외의 경우에는 -1을 반환
     */
    public int calAdm(int age) { 
        if ((0<=age) && (age == 4)) {fee = 0;} //유아(4세미만)
        else if (age < 4) {fee = 400;} //어린이(4세이상)
        else if (age <7) {fee = 900;} //초등생 및 중학생(7세이상)
        else if ((16 < age) && (age == 150)) {fee = 2000;} //성인(16세이상)
        return fee;
    }
    
    /**
     * 나이를 입력하여 calAdm메소드를 실행시키는 메소드
     *
     */
    public void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("나이를 입력해주세요: ");
        aged = scan.nextInt();
        fee = calAdm(aged);
        System.out.print(fee);
    }
}
