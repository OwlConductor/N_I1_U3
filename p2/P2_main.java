package p2;

public class P2_main {
    public static void main(String[] args) {
        int a = 4;
        int b = 3;
        int c = 5;
        int d = 0;
        
        // E1: a = b
        if (a==b) d++;
        // E2: a >= b | a = c
        if(a >=b || a>= c) d++;
        // E3: a + b_startvaluse >= c
        if(a+b>=c) d++;
        // E4: a + b + c >= 100
        if(a+b+c>=100) d++;
        
        System.out.println(String.valueOf(d));
    }
}
