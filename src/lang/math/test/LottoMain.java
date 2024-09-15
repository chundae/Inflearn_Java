package lang.math.test;

import java.util.Arrays;

public class LottoMain {

    public static void main(String[] args) {

        LottoGenerator lottoGenerator = new LottoGenerator();
        //생성된 로또번호를 sorted() 즉 순서대로 정렬
        int [] lottoNumber = Arrays.stream(lottoGenerator.generator()).sorted().toArray();

        System.out.print("로또 번호 : ");
        for (int i : lottoNumber) {
            System.out.print(i + " ");
        }
    }
}
