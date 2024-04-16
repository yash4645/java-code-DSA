 import java.util.*;

public class odooQuestion2 {
    public static String compress(int[] signal) {
        List<String> compressedSegments = new ArrayList<>();
        
        int i = 0;
        while (i < signal.length) {
            int start = i;
            
            // Check for sequence of identical numbers
            int count = 1;
            while (i + 1 < signal.length && signal[i] == signal[i + 1]) {
                count++;
                i++;
            }
            if (count >= 2) {
                compressedSegments.add(signal[start] + "*" + count);
                i++;
                continue;
            }
            
            // Check for sequence of consecutive numbers
            int end = i;
            while (i + 1 < signal.length && signal[i] + 1 == signal[i + 1]) {
                i++;
            }
            if (end != i) {
                compressedSegments.add(signal[start] + "-" + signal[i]);
                i++;
                continue;
            }
            
            // Check for sequence of numbers with same interval
            if (i - start >= 2) {
                int interval = signal[i] - signal[i - 1];
                while (i + 1 < signal.length && signal[i] - signal[i - 1] == interval) {
                    i++;
                }
                compressedSegments.add(signal[start] + "-" + signal[i - 1] + "/" + interval);
            } else {
                compressedSegments.add(Integer.toString(signal[start]));
            }
            i++;
        }
        
        return String.join(",", compressedSegments);
    }

    public static void main(String[] args) {
        int[] signal1 = {1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20};
        int [] str2={2,4,6,8,1,2,3,5,9,3,5,5,5,5,5};

        System.out.println(compress(str2));
    }
}


