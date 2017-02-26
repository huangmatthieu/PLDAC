package lfi.fuzzy.linguistic;

import lfi.fuzzy.partitions.FuzzyPart;
import lfi.fuzzy.partitions.MShips;

/**
 * 
 * Variables linguistiques continues
 * @author Matthieu
 *
 */


public class LVContinuous extends LingVar<Double> {
	
	private FuzzyPart part;
	
	public LVType getType() {
		return LVType.CONTINUOUS;
	}

	public FuzzyPart getPart() {
		return part;
	}
	
	public void setPart(FuzzyPart part) {
		this.part = part;
	}

	@Override
	public MShips mShip(Double x) {
		return part.mShip(x);
	}

	public MShips mShip(String x) {
		return part.mShip(Double.parseDouble(x));
	}

	

}