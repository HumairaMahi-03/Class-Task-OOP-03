package task01;

public class area_circle {

        public static void main(String[] args) {
            double a = 5;
            double b = 6;
            double c = 7;

            double s = (a + b + c) / 2;


            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            System.out.println(area);
        }
    }

