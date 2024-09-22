import java.util.Scanner;
public class faktorial {
    public static void main(String[] args) {
        int angka, temp=1;
        Scanner s = new Scanner(System.in);
        System.out.println("masukan angka");
        angka=s. nextInt();
        for (int i = angka; i >=1; i--){
            System.out.println(i+"x");
            temp *=i;

        }
        System.out.println();
        System.out.println("total factorial: "+temp );
    }
}
