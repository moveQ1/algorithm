import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        int index = 0;
        String champ = "";

        while(!StdIn.isEmpty()) { // 표준 입출력에 남아있는 문자열이 있을 경우
            String word = StdIn.readString(); // 표준 입출력 문자열 읽기
            Boolean chance = StdRandom.bernoulli(1 / (index + 1.0)); // 정수 1을 더할 경우 정수 나눗셈이 되어 첫 단어만 1이 되고 나머지는 모두 0
            if(chance) {
                champ = word;
            }
            index++;
        }
        StdOut.println(champ);
    }
}