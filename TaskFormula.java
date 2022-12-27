import java.util.Scanner;

/*Используем наш код который мы писали на семинаре и дорабатываем, нужно сделать так что бы мы могли написать формулу и заполненить все элементов которые сами же и вели
 Например a + b + c 2  3 4 ответ 9
 */
public class TaskFormula {
    public static void main(String[] args) {
        Equation();
    }

    public static String GetFormula() {
        System.out.println("Введите формулу ->");
        Scanner str = new Scanner(System.in);
        String equation;
        equation = str.nextLine();
        return equation;
    }

    public static int GetNumber() {
        Scanner numberS = new Scanner(System.in);
        int number;
        while (true) {
            try {
                System.out.println("Введите число -> ");
                number = numberS.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Ошика ввода ");
            }
        }
        return number;
    }

    public static void Equation() {
        String equation = GetFormula();
            equation = String.format(equation).replace(" ", "");
            System.out.print(equation);
            String[] array = equation.split("\\+");
            array[0] = String.valueOf(GetNumber());
            array[1] = String.valueOf(GetNumber());
            array[2] = String.valueOf(GetNumber());
            int num01 = Integer.parseInt(array[0]);
            int num02 = Integer.parseInt(array[1]);
            int num03 = Integer.parseInt(array[2]);
            int res = num01 + num02 + num03;
            System.out.println(res);
        }
    }

