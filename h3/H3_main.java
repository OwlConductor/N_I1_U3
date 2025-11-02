package h3;

public class H3_main {

    public static void main(String[] args) {
        int max = 0;
        int fix = 5;
        int wartend = 10;


        System.out.println("max     : "+ max);
        System.out.println("fix     : "+ fix);
        System.out.println("wartend : "+ wartend);

        // calculations can get wrong values due to Integer Overflow
        // fix seats get moved to waiting once, when they exceed the max * 
        // *already part of the conditions -> so shoudn't even happen
        fix = (fix+wartend<=max) ? (fix+wartend + (wartend = 0)) : (max + (wartend = fix + wartend - max) - (wartend));

        boolean istVoll = (fix==max);

        System.out.println("\nmax     : "+ max);
        System.out.println("fix     : "+ fix);
        System.out.println("wartend : "+ wartend);
        System.out.println("\nistVoll    : "+ istVoll);
    }
}
