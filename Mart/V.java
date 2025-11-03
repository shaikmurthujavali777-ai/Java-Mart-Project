import java.util.ArrayList;
import P2.vegetables;
public class V extends vegetables{
	public static final String G = "\u001B[32m";
	public static final String RT = "\u001B[0m";	
	@Override
	public void tomato(){
		System.out.println(G+"1Kg Tomatoes added"+RT);
		F.f.item.add("Tomato");
		F.f.cost.add(63);
	}
	@Override
	public void potato(){
		System.out.println(G+"1Kg Potatoes added"+RT);
		F.f.item.add("Potato");
		F.f.cost.add(32);
	}
	@Override
	public void carrot(){
		System.out.println(G+"1Kg Carrot added"+RT);
		F.f.item.add("Carrot");
		F.f.cost.add(70);
	}
	@Override
	public void cucumber(){
		System.out.println(G+"1Kg Cucumber added"+RT);
		F.f.item.add("Cucumber");
		F.f.cost.add(69);
	}
	@Override
	public void onion(){
		System.out.println(G+"1Kg Onion added"+RT);
		F.f.item.add("Onion");
		F.f.cost.add(29);
	}
	@Override
	public void cabbage(){
		System.out.println(G+"1Piece Cabbage added"+RT);
		F.f.item.add("Cabbage");
		F.f.cost.add(26);
	}
	@Override
	public void beetroot(){
		System.out.println(G+"1Kg Beetroot added"+RT);
		F.f.item.add("Beetroot");
		F.f.cost.add(68);
	}
	@Override
	public void lemon(){
		System.out.println(G+"1Kg Lemon added"+RT);
		F.f.item.add("Lemon");
		F.f.cost.add(150);
	}
	@Override
	public void capsicum(){
		System.out.println(G+"1Kg Capsicum added"+RT);
		F.f.item.add("Capsicum");
		F.f.cost.add(148);
	}
	@Override
	public void chilli(){
		System.out.println(G+"1Kg Chilli added"+RT);
		F.f.item.add("Chilli");
		F.f.cost.add(160);
	}
	@Override
	public void drumstick(){
		System.out.println(G+"1Dozen Drumstick added"+RT);
		F.f.item.add("Drumstick");
		F.f.cost.add(196);
	}
	@Override
	public void ladiesfinger(){
		System.out.println(G+"1Kg LadiesFinger added"+RT);
		F.f.item.add("LadiesFinger");
		F.f.cost.add(74);
	}
	@Override
	public void garlic(){
		System.out.println(G+"1Kg Garlic added"+RT);
		F.f.item.add("Garlic");
		F.f.cost.add(210);
	}
	@Override
	public void ginger(){
		System.out.println(G+"1Kg Ginger added"+RT);
		F.f.item.add("Ginger");
		F.f.cost.add(110);
	}
	@Override
	public void beans(){
		System.out.println(G+"1Kg Beans added"+RT);
		F.f.item.add("Beans");
		F.f.cost.add(100);
	}
	@Override
	public void brinjal(){
		System.out.println(G+"1Kg Brinjal added"+RT);
		F.f.item.add("Brinjal");
		F.f.cost.add(76);
	}
	@Override
	public void cauliflower(){
		System.out.println(G+"1Kg CauliFlower added"+RT);
		F.f.item.add("Cauliflower");
		F.f.cost.add(300);
	}
	@Override
	public void mushroom(){
		System.out.println(G+"1Box Mushroom added"+RT);
		F.f.item.add("Mushroom");
		F.f.cost.add(52);
	}
	@Override
	public void peas(){
		System.out.println(G+"1Kg Peas added"+RT);
		F.f.item.add("Peas");
		F.f.cost.add(245);
	}
	@Override
	public void corn(){
		System.out.println(G+"1piece Corn added"+RT);
		F.f.item.add("Corn");
		F.f.cost.add(50);
	}

}