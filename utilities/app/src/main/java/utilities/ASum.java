package utilities;

public class ASum {

    public static long findNb(long m){
        long sum = 0;
        int n = 0;
        while(sum < m){
            n++;
            sum += (long) n*n*n;
        }
        if(sum == m){
            return n;
        }
        return -1;
    }
}
