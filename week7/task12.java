import java.util.Scanner;
public class task12 {public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

// 输入年份和月份
    System.out.print("Enter full year (e.g., 2012): ");
    int year = input.nextInt();
    System.out.print("Enter month as number between 1 and 12: ");
    int month = input.nextInt();

    printMonth(year, month);
}

    public static void printMonth(int year, int month) {
// 打印月份标题
        System.out.println(" " + getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

// 找到该月份的第一天
        int startDay = getStartDay(year, month);
        int numberOfDays = getNumberOfDaysInMonth(year, month);

// 移动到第一个星期天前的空格
        for (int i = 0; i < startDay; i++) {
            System.out.print(" ");
        }

// 打印该月份的日期
        for (int day = 1; day <= numberOfDays; day++) {
            System.out.printf("%3d ", day);
            if ((day + startDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static String getMonthName(int month) {
        String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];
    }

    public static int getStartDay(int year, int month) {
// 计算该月的第一天是星期几（0=星期天, 1=星期一，...）
// 使用Zeller's Congruence或其他算法
        return 0; // 替换为实际实现
    }

    public static int getNumberOfDaysInMonth(int year, int month) {
// 返回该月的天数
        return 30; // 替换为实际实现
    }
}
