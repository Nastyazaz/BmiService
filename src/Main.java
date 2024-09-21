public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 98; // вес
        double height = 1.87; // рост
        int bmi = service.calculateBmi(weight, height);
        System.out.println("BMI: " + bmi);
    }
}