import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine().trim();
        long result = evaluate(expression);
        System.out.println(result);
        scanner.close();
    }

    public static long evaluate(String s) {
        Stack<Long> numbers = new Stack<>();
        Stack<Character> operators = new Stack<>();
        int i = 0;
        boolean lastWasNumber = false;

        while (i < s.length()) {
            char c = s.charAt(i);

            if (c == ' ') {
                i++;
                continue;
            }

            // Обработка чисел, включая отрицательные
            if (Character.isDigit(c) || c == '-' && (i + 1 < s.length() && (Character.isDigit(s.charAt(i + 1)) || s.charAt(i + 1) == '(' || s.charAt(i + 1) == '-'))) {
                if (c == '-') {
                    // Обработка унарного минуса
                    if (lastWasNumber || (i > 0 && s.charAt(i - 1) == '(')) {
                        operators.push('-');
                        i++;
                        continue;
                    } else {
                        // Это начало отрицательного числа
                        int minusCount = 0;
                        while (i < s.length() && s.charAt(i) == '-') {
                            minusCount++;
                            i++;
                        }
                        boolean isNegative = (minusCount % 2 == 1);

                        if (i < s.length() && Character.isDigit(s.charAt(i))) {
                            int start = i;
                            while (i < s.length() && Character.isDigit(s.charAt(i))) i++;
                            long num = Long.parseLong(s.substring(start, i));
                            numbers.push(isNegative ? -num : num);
                            lastWasNumber = true;
                            continue;
                        } else if (i < s.length() && s.charAt(i) == '(') {
                            // Унарный минус перед скобкой
                            numbers.push(0L);
                            operators.push('-');
                            continue;
                        }
                    }
                } else {
                    // Положительное число
                    int start = i;
                    while (i < s.length() && Character.isDigit(s.charAt(i))) i++;
                    long num = Long.parseLong(s.substring(start, i));
                    numbers.push(num);
                    lastWasNumber = true;
                    continue;
                }
            }

            if (c == '+' || c == '-') {
                while (!operators.isEmpty() && operators.peek() != '(') {
                    compute(numbers, operators);
                }
                operators.push(c);
                lastWasNumber = false;
                i++;
            } else if (c == '(') {
                operators.push(c);
                lastWasNumber = false;
                i++;
            } else if (c == ')') {
                while (!operators.isEmpty() && operators.peek() != '(') {
                    compute(numbers, operators);
                }
                operators.pop(); // Удаляем '('
                lastWasNumber = true;
                i++;
            }
        }

        while (!operators.isEmpty()) {
            compute(numbers, operators);
        }

        return numbers.pop();
    }

    private static void compute(Stack<Long> numbers, Stack<Character> operators) {
        if (numbers.size() < 2 || operators.isEmpty()) return;
        char op = operators.pop();
        long b = numbers.pop();
        long a = numbers.pop();
        if (op == '+') {
            numbers.push(a + b);
        } else if (op == '-') {
            numbers.push(a - b);
        }
    }
}