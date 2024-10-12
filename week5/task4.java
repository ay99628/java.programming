public class task4 {
        public static void main(String[] args) {
// 使用 Math.max() 和 Math.min()
            System.out.println("Math.max(2, 3) = " + Math.max(2, 3)); // 返回 3
            System.out.println("Math.min(2.5, 4.6) = " + Math.min(2.5, 4.6)); // 返回 2.5
            System.out.println("Math.max(Math.max(2.5, 4.6), Math.min(3, 5.6)) = " +
                    Math.max(Math.max(2.5, 4.6), Math.min(3, 5.6))); // 返回 4.6
            System.out.println("Math.abs(-2) = " + Math.abs(-2)); // 返回 2
            System.out.println("Math.abs(-2.1) = " + Math.abs(-2.1)); // 返回 2.1

// 生成随机数
            int randomNum0to9 = (int) (Math.random() * 10); // 0 到 9 的随机整数
            int randomNum50to99 = 50 + (int) (Math.random() * 50); // 50 到 99 的随机整数

            System.out.println("Random integer（0to9）: " + randomNum0to9);
            System.out.println("Random integer（50to99）: " + randomNum50to99);
        }
    }


