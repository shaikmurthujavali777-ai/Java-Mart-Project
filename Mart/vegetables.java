package P2;
public abstract class vegetables{
	public static final String RT = "\u001B[0m";
	public static final String BL = "\u001B[34m";
	public static final String PU = "\u001B[35m";
	public abstract void tomato();
	public abstract void potato();
	public abstract void carrot();
	public abstract void cucumber();
	public abstract void onion();
	public abstract void cabbage();
	public abstract void beetroot();
	public abstract void lemon();
	public abstract void capsicum();
	public abstract void chilli();
	public abstract void drumstick();
	public abstract void ladiesfinger();
	public abstract void garlic();
	public abstract void ginger();
	public abstract void beans();
	public abstract void brinjal();
	public abstract void cauliflower();
	public abstract void mushroom();
	public abstract void peas();
	public abstract void corn();
	public static void display_vegetables(){
	System.out.println(BL+"1.Tomato-----------1Kg----$63");
	System.out.println("2.Potato-----------1Kg----$32");
	System.out.println("3.Carrot-----------1Kg----$70");
	System.out.println("4.Cucumber---------1Kg----$69");
	System.out.println("5.Onion------------1Kg----$29");
	System.out.println("6.Cabbage----------1Pc----$26");
	System.out.println("7.Beetroot---------1Kg----$68");
	System.out.println("8.Lemon------------1Kg----$150");
	System.out.println("9.Capsicum---------1Kg----$148");
	System.out.println("10.Chilli----------1Kg----$160");
	System.out.println("11.Drumstick-------12Pc---$196");
	System.out.println("12.LadiesFinger----1Kg----$74");
	System.out.println("13.Garlic----------1Kg----$210");
	System.out.println("14.Ginger----------1Kg----$110");
	System.out.println("15.Beans-----------1Kg----$100");
	System.out.println("16.Brinjal---------1Kg----$76");
	System.out.println("17.Cauliflower-----1Kg----$300");
	System.out.println("18.Mushroom--------1Box---$52");
	System.out.println("19.Peas------------1Kg----$245");
	System.out.println("20.Corn------------1Kg----$50"+RT);
	System.out.println(PU+"99.Go Back to display menu");
	System.out.println("press 100 to Checkout with selected item"+RT);

	}
}