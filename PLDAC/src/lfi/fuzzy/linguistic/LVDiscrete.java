package lfi.fuzzy.linguistic;

import java.util.HashMap;

import lfi.fuzzy.partitions.MShips;

/**
 * Variables linguistiques discrètes. <br />
 * Par exemple, la VL Saison est définie ainsi :
 * <ul>
 * <li>"Jan" appartient à "Hiver" à 1</li>
 * <li>"Fev" appartient à "Hiver" à 1</li>
 * <li>"Mar" appartient à "Hiver" à 0.6 et à "Printemps" à 0,4</li>
 * <li>"Avr" appartient à "Printemps" à 1</li>
 * <li>etc.</li>
 * </ul>
 * En supposant que les modalités soient:
 * <ul>
 * <li>modalities(0)="Hiver"</li>
 * <li>modalities(1)="Printemps"</li>
 * <li>etc.</li>
 * </ul>
 * alors la HashMap en interne contient :
 * <ul>
 * <li>lvd.Key</li>
 * </ul>
 * 
 * @author Matthieu
 *
 */

public class LVDiscrete extends LingVar<String>{

	private HashMap<String,HashMap<Integer,Double>> lvd;
	private MShips result = new MShips();

	/**
	 * @return the lvd
	 */
	public HashMap<String, HashMap<Integer, Double>> getLvd() {
		return lvd;
	}

	/**
	 * @param lvd the lvd to set
	 */
	public void setLvd(HashMap<String, HashMap<Integer, Double>> lvd) {
		this.lvd = lvd;
	}

	@Override
	public MShips mShip(String x) {
		HashMap<Integer, Double> oneVal = lvd.get(x);
		if(oneVal.size() == 1){
			result.fill1Mod((int)oneVal.keySet().toArray()[0],1);
		}else{
			int k1 = (int) oneVal.keySet().toArray()[0];
			int k2 = (int) oneVal.keySet().toArray()[1];
			double mu1 = (double) oneVal.values().toArray()[0];
			double mu2 = (double) oneVal.values().toArray()[1];
			result.fillGeneral(2,k1,mu1,k2,mu2);
		}
		return result;

	}

}