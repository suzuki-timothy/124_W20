
public class MyMath {

	public static double sqrt(double arg) {
		double r = 1.0;
		while (Math.abs(r * r - arg) > 0.0000000001) {
			r = (r + arg / r) / 2;
		}
		return r;
	}

}
