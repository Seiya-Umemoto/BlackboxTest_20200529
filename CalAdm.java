
/**
 * ABC수족관 입장료를 연령에 따라 계산하는 메소드
 * 
 * @author (2018315056 우메모토 세이야, 2018225129 이재근, 2018315056 우메모토 세이야) 
 * @version (2020/05/29)
 */
public class CalAdm
{
    int fee; // fee = ABC 수족관 입장료
    public int calAdm(int age) { //ABC수족관 입장료를 연령에 따라 계산하는 메소드, age = 연령
        if (age == 4) {fee = 0;} //유아(4세미만)
        else if (age < 4) {fee = 400;} //어린이(4세이상)
        else if (age <7) {fee = 900;} //초등생 및 중학생(7세이상)
        else if (16 < age) {fee = 2000;} //성인(16세이상)
        return fee;
    }
}
