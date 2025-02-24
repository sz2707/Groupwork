class TrigApp implements Trig {
    @Override
    public double sin(double x) {
        return Math.sin(Math.toRadians(x));
    }
    @Override
    public double cos(double x) {
        return Math.cos(Math.toRadians(x));
    }
    @Override
    public double tan(double x) {
        return Math.tan(Math.toRadians(x));
    }
    @Override
    public double sinh(double x) {
        return Math.sinh(x);
    }
    @Override
    public double cosh(double x) {
        return Math.cosh(x);
    }
    @Override
    public double tanh(double x) {
        return Math.tanh(x);
    }
}
