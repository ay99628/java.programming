import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);


                int num1 = 5;
                int num2 = 9;
                int correctAnswer = num1 + num2;

                System.out.print("What is " + num1 + " + " + num2 + "? ");

                int userAnswer = scanner.nextInt(); // 用户输入答案


                while (userAnswer != correctAnswer) {
                    System.out.println("Wrong answer. Try again.");
                    System.out.print("What is " + num1 + " + " + num2 + "? ");
                    userAnswer = scanner.nextInt(); // 获取新的答案
                }


                System.out.println("You got it!");

                scanner.close();
            }
        }

