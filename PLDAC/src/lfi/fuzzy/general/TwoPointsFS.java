package lfi.fuzzy.general;

/**
 * Classe abstraite mère des sef définis par deux points, i.e. "en S" et "en Z"
 * 
 * @author LIP6 / LFI
 *
 */
public abstract class TwoPointsFS extends FuzzySet {
	protected double a;
	protected double b;

	/**
	 * Constructueur par défaut - hérité par les classes filles 
	 */
	public TwoPointsFS() {}
		
	public TwoPointsFS(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public void setA(double a) {
		this.a = a;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	@Override
	public String toString() {
		return "S shaped Fuzzy Set - a = " + a + ", b = " + b;
	}
}
