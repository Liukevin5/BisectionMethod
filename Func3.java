
public class Func3 implements Function {
	public double Function(double i) {
		double x = i + 10 - i * Math.cosh(50.0 / i);
		return x;
	}

}
