public class CtoFTableDisplay {


        public static void main(String[] args) {
            System.out.println("Celcius Fahrenheit ");
            for (int i = -100; i <= 100; i++) {
                System.out.println(i + " " + CtoF(i));
            }
        }
        public static double CtoF(double celcius) {
            double far = (celcius * 9 / 5) + 32;
            return far;
        }

    }
