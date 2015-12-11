/**
 * @author SFKiller
 *
 * Problem Description:
 *    Given an array nums, write a function to move all 0's 
 *    to the end of it while maintaining the relative order 
 *    of the non-zero elements.
 *
 *    For example,
 *        given nums = [0, 1, 0, 3, 12], 
 *        after calling your function, 
 *        nums should be [1, 3, 12, 0, 0].
 */
import java.lang.String;
public class MoveZeros {

    public void moveZeros(int[] num) {

        if (null == num || 0 == num.length) return;

        int i, j,temp;
        for (i = 0; i < num.length; i++) {
            if (0 == num[i]) {
                for (j = i; j < num.length; j++) {
                    if (0 != num[j]) {
                        temp = num[i];
                        num[i] = num[j];
                        num[j] = temp;
                        break;
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        MoveZeros mz = new MoveZeros();
        int[] num = {0, 0, 1, 0, 3, 12};
        mz.moveZeros(num);
        for (int i = 0; i < 6; i++) {
            System.out.println(String.valueOf(num[i]));
        }
    }
}
