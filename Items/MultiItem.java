package Items;

import Astronaut.Astronaut;
import Building.MainBase;

public abstract class MultiItem extends Item {

	private int numberOfThisItem;
	
	public MultiItem(Astronaut astro, MainBase base) {
		super(astro, base);
		numberOfThisItem=0;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int cycleModifier() {
		for (int i=0;i<numberOfThisItem;i++)
		{
			cycleModifierOnce();
		}
		return 0;
	}

	@Override
	public int aquisitionModifier() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public abstract int cycleModifierOnce();

	public int getNumberOfThisItem() {
		return numberOfThisItem;
	}

	public void add2NumberOfThisItem(int num) {
		this.numberOfThisItem +=num;
	}

}
