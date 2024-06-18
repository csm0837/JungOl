package Part4_debugging;


//디버깅 - 형성평가3 #118//
public class test04 {
    public static void main(String[] args) {

        int a = 5;
        a += 10;
        a = a - 1;
        System.out.printf("%d\n", ++a);
    }
}