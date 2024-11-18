public class week11t11 {
    public static void main(String[] args) {
        int[][] workHours = {
                {2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9}
        };
        int numEmployees = workHours.length;
        int[][] employeeTotalHours = new int[numEmployees][2];
        for (int i = 0; i < numEmployees; i++) {
            int totalHours = 0;
            for (int j = 0; j < 7; j++) {
                totalHours += workHours[i][j];
            }
            employeeTotalHours[i][0]=i;
            employeeTotalHours[i][1]=totalHours;
        }
        for (int i = 0; i < numEmployees - 1; i++) {
            for (int j = 0; j < numEmployees - i - 1; j++) {
                if (employeeTotalHours[j][1]<employeeTotalHours[j + 1][1]) {
                    int temp0 = employeeTotalHours[j][0];
                    int temp1 = employeeTotalHours[j][1];
                    employeeTotalHours[j][0]=employeeTotalHours[j + 1][0];
                    employeeTotalHours[j][1]=employeeTotalHours[j + 1][1];
                    employeeTotalHours[j + 1][0]=temp0;
                    employeeTotalHours[j + 1][1]=temp1;
                }
            }
        }
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Employee " + employeeTotalHours[i][0] + " total hours: " + employeeTotalHours[i][1]);
        }
    }
}
