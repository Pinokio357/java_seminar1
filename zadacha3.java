import java.util.Scanner;
public class zadacha3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("input first number: ");
        Double num1 = sc.nextDouble();
        System.out.println("input symbol: ");
        String sign = sc.next();
        System.out.println("input second number: ");
        Double num2 = sc.nextDouble();
        Double res = 0.0;
        switch(sign) {
            case "+": res = num1 + num2;
                break;
            case "-": res = num1 - num2;
                break;
            case "*": res = num1 * num2;
                break;
            case "/":
                if(num2 != 0){
                    res = num1 / num2;
                    break;
                }else{
                    System.out.println("division by zero");
                    return;
                }

        }
        System.out.println(res);
    }
}
