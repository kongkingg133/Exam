package Programmers20220713;
import java.util.Arrays;
import java.util.stream.Stream;


public class Solution1 {
    public static void main(String[] arg) {
        String par[] = {"mislav", "stanko", "mislav", "ana"};
        String com[] = {"stanko", "ana", "mislav"};

        solution(12345);


    }



        public static long[] solution(long n) {

                    long[] answer = {};
                    long[] arr = Stream.of(String.valueOf(n).split("")).mapToLong(Long::parseLong).toArray();
                    long[] arr1 = new long[arr.length];
                    System.out.println(Arrays.toString(arr));

                    for(int i = arr.length-1 , j = 0 ; ; i-- ) {
                        if(i == -1) {
                            break;
                        }
                        arr1[((int)j++)] = arr[(int) i];

                    }
                    System.out.println(Arrays.toString(arr1));
                    return arr1;
                }

            }







