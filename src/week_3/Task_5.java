package week_3;

public class Task_5 {
        public static double fy(double a, int n) {
            if (n == 0) {
                return 1;

            }
            if (a == 0) {
                return 0;

            }
            return Math.pow(a,n);
        }

        public static void main(String[] args) {
        System.out.println(fy(2,3));
    }
}


