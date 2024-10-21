import java.util.Scanner;
public class task13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

// 输入十六进制数字
        System.out.print("Enter a hexadecimal number: ");
        String hex = input.nextLine();

        int decimalValue = hexToDecimal(hex);
        System.out.println("The decimal value is: " + decimalValue);
    }

    // 将十六进制数字转换为十进制
    public static int hexToDecimal(String hex) {
        int decimalValue = 0;

// 遍历每个字符
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            decimalValue *= 16; // 每次迭代时将当前十进制值乘以16

// 将十六进制字符转换为十进制值
            if (hexChar >= '0' && hexChar <= '9') {
                decimalValue += hexChar - '0';
            } else if (hexChar >= 'A' && hexChar <= 'F') {
                decimalValue += hexChar - 'A' + 10;
            } else if (hexChar >= 'a' && hexChar <= 'f') {
                decimalValue += hexChar - 'a' + 10;
            }
        }

        return decimalValue;
    }
}
