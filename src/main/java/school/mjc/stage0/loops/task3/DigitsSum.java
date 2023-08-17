package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        String a = Integer.toString(t);
        int sum = 0;
        for(int i = 0; i <= a.length(); i++){
            char digit = a.charAt(i);
            sum += digit - '0';
        }
        System.out.println(sum);
    }
}
