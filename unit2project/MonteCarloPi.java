package unit2project;
import java.util.Random;
public class   MonteCarloPi {
        public static void main(String[] args) {
            int numPoints = 1000000;
            int insideCircle = 0;
            Random random = new Random();
            for (int i = 0; i < numPoints; i++) {
                double x = random.nextDouble();
                double y = random.nextDouble();
                if (x * x + y * y <= 1) {
                    insideCircle++;
                }
            }
            double pi = 4.0 * insideCircle / numPoints;
            System.out.println("Estimated value of π: " + pi);
        }
    }