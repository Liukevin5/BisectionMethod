import org.omg.Messaging.SyncScopeHelper;

public class Bisec {
	public static void main(String[] args) {
		Function f1 = new Func1();
		Function f2 = new Func2();
		Function f3 = new Func3();
		double root1 = Bisec(f1, 0, 1, .000000000000001);
		double root2 = Bisec(f2, .5, 2,.000000000000001);
		double root3 = Bisec(f3, 120, 130,.00000000000001);
		System.out.println("root1 = " + root1);
		System.out.println("root2 = " + root2);
		System.out.println("root3 = " + root3);
//		System.out.println(f1.Function(0.34729635533386105));
//		System.out.println(f2.Function(1.2361839280949407));
//		System.out.println(f3.Function(126.63243603998865));
	}
	
	static public double Bisec(Function f, double p1, double p2, double error){
		int i = 1;
		double pos;
		double neg;
		double input;
		double x = 1;
		if(f.Function(p1) * f.Function(p2) > 0){
			System.out.println("The two points are not opposite signed");
			return 0;
		}
		if(f.Function(p1) > 0){
			pos = p1;
			neg = p2;
		} else{
			pos = p2;
			neg = p1;
		}
		do{
			input = (pos + neg)/2.0;
			x = f.Function(input);
			if(x == 0){
				return input;
			}
			if(x > 0){
				pos = input;
			} 
			if(x < 0){
				neg = input;
			}

		}while(Math.abs(x) >= error);
		
		return input;
	}
}
