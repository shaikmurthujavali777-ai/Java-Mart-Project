package P1;
public abstract class fruit_items{
	public static final String RT = "\u001B[0m";
    	public static final String R = "\u001B[31m";
    	public static final String PU = "\u001B[35m";

	public abstract void apple();
	public abstract void orange();
	public abstract void grapes();
	public abstract void bananas();
	public abstract void avocado();
	public abstract void watermelon();
	public abstract void cherries();
	public abstract void kiwi();
	public abstract void mangoes();
	public abstract void pineapple();
	public abstract void guava();
	public abstract void papaya();
	public abstract void promogranate();
	public abstract void muskmelon();
	public abstract void dragonfruit();
	public abstract void blueberry();
	public abstract void mosambi();
	public abstract void strawberry();
	public abstract void jackfruit();
	public abstract void custardapple();
	public static void display_fruits(){
		System.out.println(R+"1.Apples-----------1Kg-----$200");
		System.out.println("2.Oranges----------1Kg-----$70");
		System.out.println("3.Grapes-----------1Kg-----$90");
		System.out.println("4.Bananas----------1-dozen-$50");
		System.out.println("5.Avocado----------1Kg-----$240");
		System.out.println("6.watermelon-------1Q------$70");
		System.out.println("7.cherries---------1Kg-----$620");
		System.out.println("8.Kiwi fruit-------1Kg-----$650");
		System.out.println("9.Mangoes----------1Kg-----$150");
		System.out.println("10.Pineapple-------1Q------$60");
		System.out.println("11.Guava-----------1Kg-----$25");
		System.out.println("12.Papaya----------1Kg-----$30");
		System.out.println("13.Promogranate----1Kg-----$150");
		System.out.println("14.Muskmelon-------1Kg-----$15");
		System.out.println("15.Dragonfruit-----1Kg-----$200");
		System.out.println("16.Blueberry-------1Kg-----$800");
		System.out.println("17.Mosambi---------1Kg-----$60");
		System.out.println("18.Strawberry------1Kg-----$400");
		System.out.println("19.Jackfruit-------1Kg-----$60");
		System.out.println("20.Custardapple----1Kg-----$150"+RT);
		System.out.println(PU+"99.Go Back to display menu");
		System.out.println("press 100 to Checkout with selected item"+RT);
	}
}