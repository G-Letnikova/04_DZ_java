import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

//В калькулятор добавьте возможность отменить последнюю операцию.
// Пример 
// 1
// +
// 2
// ответ:
// 3

// +
// 4
// ответ:
// 7
// +
// 2

// ответ:

// 9
// 1
// Ответ 8
// Отмена -> 9
// Отмена -> 7


public class DZtask3 {
    public static void main(String[] args) {
        Deque<String> dq = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        String inputStr = "";
        int result=0;
        int num1 = 0;
        int num2 = 0;

        System.out.println("Добро пожаловать в калькулятор");
        System.out.println("вводите числа и действия поочередно");
        System.out.println("для отмены последнего действия наберите \"back\"");
        System.out.println("для выхода из калькулятора наберите \"stop:\"");

        inputStr = sc.nextLine();
    
        if (isDigit(inputStr)) {
            dq.add(inputStr);               
            inputStr = sc.nextLine();
        }

        while(!inputStr.equals("stop")) {

            if (inputStr.equals("back")) {
                dq.removeLast();
                num1 =  (!dq.isEmpty()) ? Integer.parseInt(dq.peekLast()) : 0;
                System.out.println("возврат к " + num1);
            }

            else {
                num2 = Integer.parseInt(sc.nextLine());
                num1 = Integer.parseInt(dq.peekLast());

                switch (inputStr){
                    case "+":
                        result = num1 + num2;
                        break;

                    case "-":
                        result = num1 - num2;
                        break;

                    case "*":
                        result = num1 * num2;
                        break;

                    case "/":
                        result = num1 / num2;
                        break;

                    default:
                        System.out.println("error");
                        break;
                }
                System.out.println("Ответ: " + result);
                dq.add(Integer.toString(result));
            } 
            inputStr = sc.nextLine();
        }   
        sc.close();    
    }

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
