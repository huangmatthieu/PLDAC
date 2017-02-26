package lfi.fuzzy.partitions;

/**
 * Partition floue abstraite
 * @author LIP6 / LFI
 *
 */
public abstract class FuzzyPart {
	protected int m;
	protected double min;
	protected double max;
	protected MShips result;
	
	/**
	 * Constructeur par défaut  - construit l'objet MShips et initialise les variables
	 */
	public FuzzyPart() {
		m = 0;
		min = 0;
		max = 0;
		result = new MShips();
	}
	
	public void setMin(double min){
		this.min=min;
	}
	public void setMax(double max){
		this.max=max;
	}
	public void setM(int m){
		this.m=m;
	}
	
	/**
	 * @return the m
	 */
	public int getM() {
		return m;
	}

	/**
	 * @return the min
	 */
	public double getMin() {
		return min;
	}

	/**
	 * @return the max
	 */
	public double getMax() {
		return max;
	}

	/**
	 * Renvoie l'appartenance de x � 1 ou 2 modalit�s - le r�sultat est revnoy� dans l'objet MShips  
	 * @param x
	 * @return appartenance � 1 ou 2 modalit�s
	 */
	public abstract MShips mShip(double x);


}
