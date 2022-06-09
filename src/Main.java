import java.io.IOException;


public class Main {
    public static void main(String[] args){
        Settings s1 = new Settings();
        Settings s2 = new Settings();

        s1.put("AAA", 2);   s2.put("AAA", 2);
        s1.put("BBB", 1);   s2.put("BBB", 1);
        s1.put("CCC", 2);   s2.put("CCC", 2);
        s1.put("AAA", 1);   s2.put("AAA", 4);


        System.out.println(s1);
        System.out.println(s2);

        if(s1.equals(s2))
            System.out.println(1);
        else
            System.out.println(0);




    }
}
