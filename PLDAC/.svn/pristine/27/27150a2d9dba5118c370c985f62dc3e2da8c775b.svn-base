package lfi.fuzzy.linguistic;

import lfi.fuzzy.general.FuzzySet;

/**
 * 
 * Quantificateur
 * 
 * @author Matthieu
 *
 */

public class Quantifier {
	private String name;
	private QType type;
	private FuzzySet fs;
	private String lingForm;
	/**
	 * @return the lingForm
	 */
	public String getLingForm() {
		return lingForm;
	}
	/**
	 * @param lingForm the lingForm to set
	 */
	public void setLingForm(String lingForm) {
		this.lingForm = lingForm;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the type
	 */
	public QType getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(QType type) {
		this.type = type;
	}
	/**
	 * @return the fs
	 */
	public FuzzySet getFs() {
		return fs;
	}
	/**
	 * @param fs the fs to set
	 */
	public void setFs(FuzzySet fs) {
		this.fs = fs;
	}
	
	/**
	 * Facilitateur pour accéder au membership - équivalent à getFs.mShip
	 * @param x
	 * @return
	 */
	public double mShip(double x){
		return fs.mShip(x);
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getName();
	}
 


}
