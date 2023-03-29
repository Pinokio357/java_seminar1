import  java.util.Scanner;
public class zadacha1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("int n: ");
        int n = sc.nextInt();
        int sum = 0;
        int fac = 1;

        for (int i = 1; i <= n ; i++) {
            sum += i;
            fac *= i;

        }
        System.out.println(sum);
        System.out.println(fac);


    }
}
