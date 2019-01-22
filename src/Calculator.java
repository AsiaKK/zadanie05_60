public class Calculator {

    public void performOperation(double a, double b) {
        if (a > b) {
            countSumAndShow(a, b);
        } else if (a < b) {
            multiplyAndShow(a, b);
        } else {
            squareAndShow(a, b);
        }
    }

    private void countSumAndShow(double a, double b) {
        double sum = a + b;
        System.out.println("Suma liczby a i liczby b =  " + sum);
    }

    private void multiplyAndShow(double a, double b) {
        double ratio = a * b;
        System.out.println("Iloczyn liczby a i b =  " + ratio);
    }

    private void squareAndShow(double a, double b) {
        double count = a * a;
        System.out.println("Kwadrat z liczby a lub liczby b =   " + count);
    }


}
