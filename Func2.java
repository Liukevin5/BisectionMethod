
public class Func2 implements Function{

	@Override
	public double Function(double i) {
		double x = Math.pow(i, 3) - 2*Math.sin(i);
		return x;
	}

}
