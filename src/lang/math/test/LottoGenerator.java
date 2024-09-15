package lang.math.test;

import java.util.Random;

public class LottoGenerator {

    private final Random rand = new Random();
    private int[] lottoNumbers;
    private int count;

    //생성자를 통해 로또 번호를 생성하는 로직
    public int[] generator(){
        lottoNumbers = new int[6];
        count = 0;

        while(count < 6) {
            //1부터 45의 숫자를 형성
            int number = rand.nextInt(45) + 1;
            if (isUnique(number)) {
                lottoNumbers[count] = number;
                count++;
            }


        }
        return lottoNumbers;
    }

    //생성번호와 중복되는지 검사하는 로직
    private boolean isUnique(int number) {
        for(int i =0; i < count; i++){
            if(lottoNumbers[i] == number){
                return false;
            }
        }
        return true;
    }
}
