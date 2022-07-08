import java.util.Scanner;


public class yildizlar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Basamak Sayısı Giriniz:");
        int n = input.nextInt();
        int i;
        int k;
        int j;

        for (i = 1; i <= n; i++) {

            for ( k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (i = n-1; 1<=i ; i-- ) {
            for(j=1; j<=(n-i); j++ ){
                System.out.print(" ");
            }

            for(k=1;k<=(2*i)-1 ; k++){

                System.out.print("*");
            }
            System.out.println();


        }
    }
}
