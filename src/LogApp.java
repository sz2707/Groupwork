public class LogApp implements Logs {
    @Override
    public double root(double x, double y) {
        return Math.pow(x, 1/y);
    }

    @Override
    public double ln(double x) {
        return Math.log(x);
    }

    @Override
    public double log10(double x) {
        return Math.log10(x);
    }

    @Override
    public double sqrt(double x) {
        return Math.sqrt(x);
    }

    @Override
    public double square(double x) {
        return x * x;
    }

    @Override
    public double cube(double x) {
        return x * x * x;
    }

    @Override
    public double power(double x, double y) {
        return Math.pow(x, y);
    }

    @Override
    public double exponential(double x) {
        return Math.exp(x);
    }

    @Override
    public double factorial(int x) {
        double fact = 1;
        if (x == 0 || x == 1) {
            fact = 1;
        } else {
            for (int i = 2; i <= x; i++) {
                fact *= i;
            }
        }
        return fact;

    }
}