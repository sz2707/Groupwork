class RootApp implements Roots {
    @Override
    public double inverse(double x) {
        return 1 / x;
    }
    @Override
    public double cubeRoot(double x) {
        return Math.cbrt(x);
    }
    public double powerTen(double x) {
        return Math.pow(10, x);
    }
    @Override
    public double percentage(double x) {
        return x*1/100;
    }
}