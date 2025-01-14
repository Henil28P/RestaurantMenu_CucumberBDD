package restaurantmenu.cucumberbddproject;

import java.text.DecimalFormat;

public class BillCalculationHelper {
	public static double CalculateBillForCustomer(double BillAmount, double taxRate)
	{
		double FinalBillAmount = BillAmount * (1 + taxRate / 100);
		DecimalFormat df = new DecimalFormat("0.00");
		String result = df.format(FinalBillAmount);
		return Double.parseDouble(result);
	}
}
