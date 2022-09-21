import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz : ");
        int n1 = scan.nextInt();
        System.out.print("n2 sayısını giriniz : ");
        int n2 = scan.nextInt();
        int ebob=1, ekok=1, i=1, k=1;
        boolean isTrue;

        if(n1<=n2){
            isTrue= true;
        }else {
            System.out.println("İlk sayı ikinci sayıdan daha küçük olmalıdır!");
            isTrue=false;
        }

        while (isTrue) {
            while (i <= n1) {
                if ((n1 % i == 0) && (n2 % i == 0)){
                    ebob = i;
                }
                i++;
            }

            while (k<=(n1*n2)){
                if ((k%n1==0) && (k%n2==0)){
                    ekok = k;
                    break;
                }
                k++;
            }
            System.out.println("Ebob : " + ebob + " " +"\nEkok : " + ekok);
            isTrue = false;

        }

    }
}
