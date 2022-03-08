import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {

    // 1) Get the user input of type string.
    // 2) Split the result and make it an array
    // 3) Create Case Switch statement with operator
    // 4) result counter of 0. variables num1/num2

        Scanner input = new Scanner(System.in);
        String expression = input.nextLine();
        String[] component = expression.split("");
        int num1 = Integer.parseInt(component[0]);
        int num2 = Integer.parseInt(component[2]);

        String operator = component[1];
        int result = 0;
        switch(operator){
            case "+":
                result = num1 + num2;
                break;

            case "-":
                result = num1 - num2;
                break;

            case "/":
                result = num1 / num2;
                break;

            case "*":
                result = num1 * num2;
                break;
        }
        System.out.println(num1 + operator + num2 + "=" + result);
    }
}
