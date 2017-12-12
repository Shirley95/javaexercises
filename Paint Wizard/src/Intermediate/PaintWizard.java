package Intermediate;

import java.util.ArrayList;

public class PaintWizard {
	public ArrayList<Paint> paintBrand = new ArrayList<Paint>();

	public PaintWizard() {
		super();
		this.paintBrand.add(new Paint("CheapoMax", 20, 19.99, 10));
		this.paintBrand.add(new Paint("AverageJoes", 15, 17.99, 11));
		this.paintBrand.add(new Paint("DuluxourousPaints", 10, 25, 20));
	}
	
	public String cheapPaintOption(int area)
	{
		double temp = Double.MAX_VALUE;
		String best = "";
		
		for (Paint a : paintBrand)
		{
			double amountCovered = a.getArea()*a.getWeight();
			double tinsNeeded = Math.ceil(area/amountCovered);
			double totalCost = tinsNeeded * a.getPrice();
			
			
			if (temp > totalCost)
			{
				temp = totalCost;
				best = a.getName();
			}
			
			
			
		}
		return best;
		
	}
}
