package Part7_repetitive_statment_2;


public class self_test08 {
    public static void main(String[] args) {

        for (int i = 2; i <= 4; i++) {



            for(int j=1 ; j <= 5 ; j++){
                System.out.printf("%d * %d =",i,j);
                System.out.printf("%3d",(i*j));
                System.out.print("   ");
            }
            System.out.println("");
        }
    }
}

