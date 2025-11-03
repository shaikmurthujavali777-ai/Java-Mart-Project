import java.util.ArrayList;
import P6.electronics;
public class  E extends electronics{
	public static final String G = "\u001B[32m";
	public static final String RT = "\u001B[0m";
	@Override
	public void speaker(){
		System.out.println(G+"5W Black Speaker added"+RT);
		F.f.item.add("Speaker");
		F.f.cost.add(1099);
	}
	@Override
	public void smartwatch(){
		System.out.println(G+"1.83,Active black SmartWatch added"+RT);
		F.f.item.add("Smartwatch");
		F.f.cost.add(1299);
	}
	@Override
	public void earbuds(){
		System.out.println(G+"148TWS,Gunmetal black Earbuds added"+RT);
		F.f.item.add("Earbuds");
		F.f.cost.add(1199);
	}
	@Override
	public void hairdryer(){
		System.out.println(G+"1000W,Purple Hairdryer added"+RT);
		F.f.item.add("Hairdryer");
		F.f.cost.add(1849);
	}
	@Override
	public void coffeemaker(){
		System.out.println(G+"French Press, black CoffeeMaker added"+RT);
		F.f.item.add("Coffeemaker");
		F.f.cost.add(999);
	}
	@Override
	public void sandwichmaker(){
		System.out.println(G+"600W,Silver SandwichMaker added"+RT);
		F.f.item.add("Sandwichmaker");
		F.f.cost.add(899);
	}
	@Override
	public void massager(){
		System.out.println(G+"5W,Black Massager added"+RT);
		F.f.item.add("Massager");
		F.f.cost.add(4499);
	}
	@Override
	public void hairstraightener(){
		System.out.println(G+"1200W,Rose Gold Hairstraightener added"+RT);
		F.f.item.add("Hairstraightener");
		F.f.cost.add(4599);
	}
	@Override
	public void ricecooker(){
		System.out.println(G+"Butterfly,1.5 ltrs Ricecooker added"+RT);
		F.f.item.add("Ricecooker");
		F.f.cost.add(1499);
	}
	@Override
	public void juicermixer(){
		System.out.println(G+"500w,3 jars Juicermixer added"+RT);
		F.f.item.add("Juicermixer");
		F.f.cost.add(1499);
	}
	@Override
	public void grinder(){
		System.out.println(G+"Butterfly,1000w Grinder added"+RT);
		F.f.item.add("Grinder");
		F.f.cost.add(5599);
	}
	@Override
	public void ledlight(){
		System.out.println(G+"9W.gloden yellow Ledlight added"+RT);
		F.f.item.add("Ledlight");
		F.f.cost.add(59);
	}
	@Override
	public void washingmachine(){
		System.out.println(G+"7kgs,Grey Washingmachine added"+RT);
		F.f.item.add("Washingmachine");
		F.f.cost.add(25499);
	}
	@Override
	public void geyser(){
		System.out.println(G+"3ltr,3000W Geyser added"+RT);
		F.f.item.add("Geyser");
		F.f.cost.add(3899);
	}
	@Override
	public void airpurifier(){
		System.out.println(G+"21W,Corded Airpurifier added"+RT);
		F.f.item.add("Airpurifier");
		F.f.cost.add(7959);
	}
	@Override
	public void fan(){
		System.out.println(G+"55W,white Fan added"+RT);
		F.f.item.add("Fan");
		F.f.cost.add(1299);
	}
	@Override
	public void ac(){
		System.out.println(G+"5star,Bluestar AC added"+RT);
		F.f.item.add("AC");
		F.f.cost.add(29299);
	}
	@Override
	public void adapter(){
		System.out.println(G+"25W,White Adapter added"+RT);
		F.f.item.add("Adapter");
		F.f.cost.add(599);
	}
	@Override
	public void phone(){
		System.out.println(G+"68GB,5GB RAM,Black Phone added"+RT);
		F.f.item.add("Phone");
		F.f.cost.add(7929);
	}
	@Override
	public void usbcable(){
		System.out.println(G+"4K high speed USBcable added"+RT);
		F.f.item.add("USBcable");
		F.f.cost.add(199);
	}
	@Override
	public void tv(){
		System.out.println(G+"5 inch,2000W TV added"+RT);
		F.f.item.add("TV");
		F.f.cost.add(24499);
	}
	@Override
	public void laptop(){
		System.out.println(G+"21.4 inch,cloud grey Laptop added"+RT);
		F.f.item.add("Laptop");
		F.f.cost.add(65099);
	}
	@Override
	public void powerbanks(){
		System.out.println(G+"10000mAh,sliver Powerbanks added"+RT);
		F.f.item.add("Powerbanks");
		F.f.cost.add(1399);
	}
}

