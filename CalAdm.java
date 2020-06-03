
/**
 * ABC수족관 입장료를 연령에 따라 계산하는 메소드
 * 
 * @author (2018315056 우메모토 세이야, 2018225129 이재근, 2018315056 우메모토 세이야) 
 * @version (2020/06/03)
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
        if ((0<=age) && (age == 4)) {fee = 0;} 
        else if (age < 4) {fee = 400;} 
        else if (age <7) {fee = 900;} 
        else if ((16 < age) && (age == 150)) {fee = 2000;}
        else {fee = -1;}
        return fee;
    }
}
