package P8;
public abstract class Softdrinks{
	public static final String RT = "\u001B[0m";
	public static final String PU = "\u001B[35m";
	public static final String SK = "\u001B[38;5;117m";
	public abstract void sevenup();
	public abstract void sprite();
	public abstract void coco_cola();
	public abstract void thumbsup();
	public abstract void fanta();
	public abstract void mirnda();
	public abstract void mountain_dew();
	public abstract void pepsi();
	public abstract void Limca();
	public abstract void coconut_water();
	public abstract void redbull();
	public abstract void Monster();
	public abstract void Coolberg();
	public abstract void Maaza();
	public abstract void pulpyOrange();
	public abstract void Amullassi();
	public abstract void KinleyStrongSoda();
	public abstract void Coco_cola_Zerosugar();
	public abstract void Pepsi_ZeroSugar();
	public static void display_softdrinks(){
		System.out.println(SK+"1.7UP---------------------1 litre-------$45");
		System.out.println("2.sprite------------------1 litee-------$40");
		System.out.println("3.coco_cola---------------1 litre-------$50");
		System.out.println("4.thumbsup----------------1 litre-------$45");
		System.out.println("5.fanta-------------------1 litre-------$65");
		System.out.println("6.mirinda-----------------1 litre-------$55");
		System.out.println("7.mountain dew------------1 litre-------$55");
		System.out.println("8.pepsi-------------------1 litre-------$45");
		System.out.println("9.Limca-------------------1 litre-------$40");
		System.out.println("10.coconut_water----------1 litre-------$120 ");
		System.out.println("11.redbull----------------1 tin---------$115");
		System.out.println("12.Monster ---------------1 tin---------$90");
		System.out.println("13.Coolberg---------------1 glass-------$92");
		System.out.println("14.maaza------------------1 litre-------$45");
		System.out.println("15 puplyOrange------------1 litre-------$75");
		System.out.println("16.Amul lassi ------------1 tetra box---$35");
		System.out.println("17.KinleyStrongsoda-------1 litre-------$72");
		System.out.println("18. coco_cola_Zerosugar---1 litre-------$45");
		System.out.println("19 pepsi zero sugar-------1 litre-------$52"+RT);
		System.out.println(PU+"99.Go Back to display menu");
		System.out.println("press 100 to Checkout with selected item"+RT);
	}
}