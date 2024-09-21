public class BmiService {
    public static int calculateBmi(double weight, double height) {
        double bmi = weight / (height * height);
        return (int) Math.round(bmi);
    }
}
