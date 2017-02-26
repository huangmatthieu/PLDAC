package lfi.fuzzy.linguistic;

import java.util.ArrayList;

import lfi.fuzzy.linguistic.LVType;
 
import lfi.fuzzy.partitions.MShips;

/**
 * 
 * Variables linguistiques abstraites
 * @author Matthieu
 *
 */

public abstract class LingVar<T> {
	protected String name;
	protected ArrayList<String> modalities;
	protected LVType type;
	protected ArrayList<String> TabRForm;
	protected ArrayList<String> TabPForm;
	
	public ArrayList<String> getTabRForm(){
		return TabRForm;
	}
	
	public ArrayList<String> getTabPForm(){
		return TabPForm;
	}

	/**
	 * @return the modalities
	 */
	public ArrayList<String> getModalities() {
		return modalities;
	}
	/**
	 * @param modalities the modalities to set
	 */
	public void setModalities(ArrayList<String> modalities) {
		this.modalities = modalities;
	}
	/**
	 * @return the rForm
	 */
	public String getRForm(int i) {
		if(TabRForm.size() == 1)
			return TabRForm.get(0).trim();
		return TabRForm.get(i);
	}
	/**
	 * @param rForm the rForm to set
	 */
	public void setTabRForm(ArrayList<String> rForm) {
		TabRForm = rForm;
	}
	/**
	 * @return the pForm
	 */
	public String getPForm(int i) {
		if(TabPForm.size() == 1)
			return TabPForm.get(0).trim();
		return TabPForm.get(i);
	}
	

	/**
	 * @param pForm the pForm to set
	 */
	public void setTabPForm(ArrayList<String> pForm) {
		TabPForm = pForm;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LVType getType() {
		return type;
	}
	public void setType(LVType type) {
		this.type = type;
	}
	
	public abstract MShips mShip(T x);
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	public abstract MShips mShip(String x);
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getName();
	}

}