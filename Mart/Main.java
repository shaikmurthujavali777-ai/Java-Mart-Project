import static java.lang.System.out;
import java.util.ArrayList;
import P1.fruit_items;
import P2.vegetables;
import P3.grocery_items;
import P4.beauty_items;
import P5.Snacks;
import P6.electronics;
import P7.Homeessentials;
import P8.Softdrinks;
import java.util.Scanner;
import java.util.InputMismatchException;

class Mart{
	public static final String G = "\u001B[32m";
	public static final String RT = "\u001B[0m";
    	public static final String R = "\u001B[31m";
    	public static final String TR = "\u001B[1;31m";
    	public static final String TG = "\u001B[32m";
    	public static final String B = "\u001B[38;5;94m";
    	public static final String LB = "\u001B[38;5;180m";
    	public static final String P = "\u001B[95m";
    	public static final String BL = "\u001B[34m";
    	public static final String TB = "\u001B[1;34m";
    	public static final String PU = "\u001B[35m";
    	public static final String SK = "\u001B[38;5;117m";
	static int x=0;
	private String username;
	private String password;
	void setUsername(String username){
		this.username=username;
		out.println(TG+"\t\t\t\t\t\t\t\t\t\tEmail ID updated successfully"+RT);
	}
	void setPassword(String password){
		this.password=password;
	}
	String getUsername(){
		return username;
	}
	String getPassword(){
		return password;
	}
	Mart(String username,String password){
		this.username=username;
		this.password=password;
		x++;
		if(x==1)
			out.println(PU+"\t\t\t\t\t\t\t\t\t\tAccount created Successfully "+RT);
	}
}


class User{
	public static final String G = "\u001B[32m";
	public static final String RT = "\u001B[0m";
    	public static final String R = "\u001B[31m";
    	public static final String TR = "\u001B[1;31m";
    	public static final String TG = "\u001B[32m";
    	public static final String B = "\u001B[38;5;94m";
    	public static final String LB = "\u001B[38;5;180m";
    	public static final String P = "\u001B[95m";
    	public static final String BL = "\u001B[34m";
    	public static final String TB = "\u001B[1;34m";
    	public static final String PU = "\u001B[35m";
    	public static final String SK = "\u001B[38;5;117m";
	static int d=0;
	static User menu= new User();
		// Helper method to safely get integer input
	public static int getIntInput(Scanner sc, String prompt) {
		while (true) {
			try {
				if (prompt != null) {
					System.out.print("\t\t\t\t\t\t\t\t\t\t"+prompt);
				}
				return sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println(R+"\t\t\t\t\t\t\t\t\t\tInvalid input! Please enter a valid number."+RT);
				sc.nextLine(); // Clear the invalid input from scanner
			}
		}
	}
	
	// Helper method to safely get long input
	public static long getLongInput(Scanner sc, String prompt) {
		while (true) {
			try {
				if (prompt != null) {
					System.out.print("\t\t\t\t\t\t\t\t\t\t"+prompt);
				}
				return sc.nextLong();
			} catch (InputMismatchException e) {
				System.out.println(R+"\t\t\t\t\t\t\t\t\t\tInvalid Mobile number"+RT);
				sc.nextLine(); // Clear the invalid input from scanner
			}
		}
	}
	void display_menu(){
		System.out.println("\t\t\t\t\t\t\t\t\t\tClick on items to see all products");
        System.out.println(R+"               =#=-===--: "+BL+"          +*#                    "+G+"            " + "          ---------------------------------==     "+P+"    " + "                === ======                     "+RT);
        System.out.println(R+"         :-+++**#%+====+++++=: "+BL+"     ***                       "+G+"         " + "          ---------=====--------------------=     "+P+"    " + "                     =====                     "+RT);
        System.out.println(R+"     :===++*#***#=++*###%%%##*:   "+BL+"     **                        "+G+"      " + "          --------=#@%%%%%%%%%%%@@@#---------    "+P+"     " + "                     ===+=                     "+RT);
        System.out.println(R+"   -+**###############%%%%%%%%*=   "+BL+"  +=--++****                  "+G+"     " + "          --------=#@+===+++++++++#%---------        "+P+" " + "                    +++++*+                    "+RT);
        System.out.println(R+" :+##*+===+*##%%%%%%%%%%%%%%%%%#=  "+BL+"   -+==++*#@@@@                 "+G+"    " + "          --------=#@+===*%%%%%+==#%=--------   "+P+"      " + "                    +++++*+                    "+RT);
        System.out.println(R+" +#####*+**#%%%%%%%%%%%%%%%%%%%%#-  "+BL+" +=++++#%@@@@@@@                 "+G+"  " + "          ---------#@===%%+===+*==#%=--------      "+P+"   " + "                    +++++*+                    "+RT);
        System.out.println(R+"-##%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*: "+BL+" *++%%%%%%%@@@@@@@@          "+G+"      " + "          ---------#@==*%*========#%+--------         "+P+"" + "                    +++***+                    "+RT);
        System.out.println(R+"=##%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#- "+BL+" *#@@@@%#+*#%@@@@@@@@@@         "+G+"  " + "          --------=#@==#%*==*%%%==#%+--------    "+P+"     " + "                    +++++++                    "+RT);
        System.out.println(R+"+*#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#+  "+BL+" #@@@@@@%*=+#%@@@%@@@@@@@@      "+G+" " + "          --------=#@==+%%+===%%==#%+--------        "+P+" " + "               =================               "+RT);
        System.out.println(R+"=*#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#*  "+BL+"   @@@@@@%#+=+#%%%%%%%@@@@@@@   "+G+" " + "          =========#@====#%%%%%#==#%+========     "+P+"    " + "              =    ===============             "+RT);
        System.out.println(R+":*#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#*   "+BL+"   @@@@@@@%*=-=*%%%@%%%%@@@@@@ "+G+" " + "          +++++++++*@============+#%+++++++**     "+P+"    " + "             =   ===++***++=======             "+RT);
        System.out.println(R+" +##%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#+  "+BL+"     @@@@@@@@%*-:-+#%%@%%%%%@@@@ "+G+"" + "          ++++++++++@%%%%%%%%%%%%%%%********#    "+P+"     " + "             = =+##%%%##%%#%##*====            "+RT);
        System.out.println(R+" :*#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#-   "+BL+"      @@@@@@@@%*=--=*#%%%%%%@@@@"+G+"" + "          *++++++++*%%##############*********    "+P+"     " + "             = =#+%**+***#*+*##====            "+RT);
        System.out.println(R+"   =*#%%%%%%%%%%%%%%%%%%%%%%%%%%%%*     "+BL+"      @@@@@@@@@%#=--=*%%@%@@@@@"+G+"" + "          **+++++++*################*********   "+P+"      " + "            == =++#%%%%%%%%%#++====            "+RT);
        System.out.println(R+"    =*#%%%%%%%%%%%%%%%%%%%%%%%%%%#-   "+BL+"          @@@@@@@@@%##*#%%@@@@@@@"+G+"" + "                                                "+P+"     " + "            = =   =================            "+RT);
        System.out.println(R+"     -*##%%%%%%%%%%%%%%%%%%%%%%%%=    "+BL+"           @@@@@@@@@@@@@@@@@@@@@@"+G+"" + "                                                "+P+"     " + "            =  =+=+=+++====++=+====            "+RT);
        System.out.println(R+"      :+###%%%%%%%%%%%%%%%%%%%%%+     "+BL+"            @@@@@@@@@@@@@@@@@@@  "+G+"" + "                                               "+P+"      " + "            =  ====================            "+RT);
        System.out.println(R+"        =*#%%%%%%%%%%%%%%%%%%%%+         "+BL+"           @@@@@@@@@@@@@@@@   "+G+"" + "                                                "+P+"     " + "            =  =+=+++=+++++=========           "+RT);
        System.out.println(R+"          +#%%%%%%%%%%%%@@@@%#-            "+BL+"           @@@@@@@@@@@      "+G+"" + "                                                 "+P+"    " + "            =  ==========++++++=====           "+RT);
        System.out.println(R+"            -+#%%%%##%%@@%#+                                               "+G+"" + "                                                  "+P+"   " + "        =  ==+==+===+=*=+++=====           "+RT);
        System.out.println("                                                                                                       " + "                              "+P+"    =      =========+=======           "+RT);
        System.out.println("                                                                                                       " + "                             "+P+"     =   ==========+++=+=====           "+RT);
        System.out.println("                                                                                                       " + "                             "+P+"     =  =+*+=++++===+++======           "+RT);
        System.out.println("                                                                                                       " + "                              "+P+"    =      ==================          "+RT);
        System.out.println("                                                                                                       " + "                               "+P+"    ======================            "+RT);
	System.out.println(R+"               1.Fruits            "+BL+"        2.Vegetables                                       "+G+"      3.Groceries                         "+P+"         4.Skin Care"+RT);
	System.out.println();
	        System.out.println(PU+"          :-=====++++:                                                                                                                                                             "+RT);
        System.out.println(PU+"      ---==-=--=+*+++***       "+TG+"    @#=--=:%@#=+=.-#%+#%@@@#==-==*##@%%@@*=*=-**=--:  "+TR+"   ..###          .-.            ..... .#%@-     "+SK+"                   @@@*                   "+RT);
        System.out.println(PU+"    :-=+==+=:--#**++++*++*=      "+TG+"  ***=-=*@==:=*+#%@@@*@*%-#**%+==*-+@@@@#-+%=---==  "+TR+"   .. ..  *#+ .    .=# #%@%@##%+....:*:. ...      "+SK+"                  *=+                    "+RT);
        System.out.println(PU+"  -=+*=--:-:=##@*-+=++**+**.      "+TG+" :-=--*%%.-:=%@@*@*@:#-%+=#*%+:=-=@@%@@#**=@%%#*%  "+TR+"   .       ..     .#.-=   *@@@.  ....-:.....        "+SK+"               #+=+#                   "+RT);
        System.out.println(PU+" :-=**+--==:====--===+++*=*#-  "+TG+"    :-:####=.-=*@@@-@%@:@+%+#-+@#@@@@@@=*@+#@+++:-+#  "+TR+"   ..... .      ##.@*=@@*    #@.   .    ....       "+SK+"               #----=%                  "+RT);
        System.out.println(PU+" :=:*#%%+:--:--#%*=**++@*+=+**  "+TG+"   -.=@%=.---+#@@@+@+#=@+@=+:+*@@@@@@*.:@-@@%#%*.+*  "+TR+"   ..   .     #:*@-  .@@+ ..   #@*.....:....       "+SK+"              #=.:.:. #                 "+RT);
        System.out.println(PU+":-:=+:  :::--=##==+=+**=***#-    "+TG+"  -.+@**%@@+=*@#@=@=%%=+@@@+#-@@-+***-=@-@@@#@+:+* "+TR+"    ...  .  #%.#+.                #%@-:-:::::        "+SK+"            %#.==-==:.%                "+RT);
        System.out.println(PU+":-==- -.:::-:-+=:-==++*****##  "+TG+"   =+#@=%@+%+-+%%@=@%=+*#@*#-:-@@.+-:-=#@-@*%@@#-++  "+TR+"   ... ..   :%+       ......:::.  .=.-------        "+SK+"           =%..:..=+#.+#               "+RT);
        System.out.println(PU+":=+- .:  --##*==----+*%##**## "+TG+"    +=##-+*+=@+-.-=.#=++-=#@+-:+@@:+:...%@:@+*@@-@%@  "+TR+"   ... .     -  @@@@@ %  *#=%: # .@=.----==-        "+SK+"           +  *@@#@ # @@               "+RT);
        System.out.println(PU+":===- ..::=-++=--=-++++***#+  "+TG+"    =:#@@%.#*@#-:-+.%-=#%#@@@+%+%@:+....%@:#=+@@+@=@  "+TR+"   ...    @. *. .@*#% %  -. +: %  @=.----===        "+SK+"           *-     .    :               "+RT);
        System.out.println(PU+" :--**::=.:---=-:=+--++++-*%@ "+TG+"    @@*:=%+@@@#.==#-%++##%#*@*#=#@:*..:-%@:@+*@@+@=@  "+TR+"   ...   +#@ +. =@@%@ %  %@:#= %  @=.----===        "+SK+"           .+ :@+@-@#*=%               "+RT);
        System.out.println(PU+" :-*##++:-::=:---*+++++*==*#= "+TG+"    =*-%@@+*@#==.:+.@+-+=+-=@+%-*@:+:=+=@@-@#+@@@@@@   "+TR+"  .... .*@@ =.       @ :. .:. % .%...:---==        "+SK+"           -@--:-.:...##               "+RT);
        System.out.println(PU+"   :---+===++*=++*%+**+*++*#=  "+TG+"   @@-%:..:==-*--=+@@%:##==@#@.*@.==**=@@=@-%#%@.@@  "+TR+"   .... #@:+ .%         :- .   %  #=##++*###         "+SK+"          :%.+****#*=*#               "+RT);
        System.out.println(PU+"    :---==####+--+*=++***+    "+TG+"    #@@@+#@@#+*#++=#@@@%+-=#@=@+#@==+*-#@@-@-+***@@@  "+TR+"        -%@@ %#@@%=..... : -. .% .@:=.#  ...        "+SK+"           .+  .......=-               "+RT);
        System.out.println(PU+"       --=**#**===#%@#+       "+TG+"    @@@%*@@@@#+:-=--@*@@@%+%@#@=+@@%@@@@@@+##@@*%@@*  "+TR+"    .   -%=-@:#.@@=%+-:..-.-...% :@#%%@%@@@%       "+SK+"             #..---:--.*.               "+RT);
        System.out.println(PU+"          --==++++-         "+TG+"      @%.-:+*+#=:++++.%@=*--:#@@*-=@@=-*%%=**+=-**%@@#  "+TR+"   ....     : --        ...::::. .+:=.            "+SK+"              #-.-:--=:.%                "+RT);
        System.out.println("                                "+TG+"   -##%++@*+::+%@#*#@%@@#=+#@-+*:@%%*%%==#.=#@#%@**                                                         "+SK+"        #:.=-----.#                "+RT);
        System.out.println("                                                                                                                                                 "+SK+"   %  =--==: #.               "+RT);
        System.out.println("                                                                                                                                                "+SK+"    =* .==--==.             "+RT);
        System.out.println("                                                                                                                                                   "+SK+" =*----:-=::               "+RT);
        System.out.println("                                                                                                                                                "+SK+"    +:.......=#.               "+RT);
        System.out.println("                                                                                                                                                "+SK+"    +@@@%@@@@@#                "+RT);
	System.out.println();
    	System.out.println(PU+"             5.Snacks                 "+TG+"             6.Electronics            "+TR+"                        7.Home Essentials                "+SK+"               8.Cool Drinks"+RT);
	System.out.println();
	}
	void checkout(){
		int sum=0;
		for(int i=0;i< F.f.item.size();i++){
			if(i==0){
			System.out.println(LB+"\t\t\t\t\t\t\t\t\t\t--------------------------------------");
			System.out.println("\t\t\t\t\t\t\t\t\t\tITEMS                      =     PRICE");
			System.out.println("\t\t\t\t\t\t\t\t\t\t--------------------------------------");
			}
			System.out.print("\t\t\t\t\t\t\t\t\t\t"+F.f.item.get(i));
			for(int j=1;j<=27-F.f.item.get(i).length();j++){
				System.out.print(" ");
			}
			System.out.println("=     "+F.f.cost.get(i));
			sum=sum+F.f.cost.get(i);
		}
		System.out.println("\t\t\t\t\t\t\t\t\t\t--------------------------------------");
		System.out.println("\t\t\t\t\t\t\t\t\t\tTotal Amount               =     "+sum);
		System.out.println("\t\t\t\t\t\t\t\t\t\t--------------------------------------"+RT);
		System.out.println(TG+"\t\t\t\t\t\t\t\t\t\tComplete the details for delivery"+RT);
		menu.payment();
		

	}
	void payment(){
		Scanner s= new Scanner(System.in);
		System.out.print(B+"\t\t\t\t\t\t\t\t\t\tEnter the delivery address: "+RT);
		String address=s.nextLine();
		looppay:{
		while(true){
		int confirm = 1000+(int)(Math.random()*9000);
		System.out.println("\t\t\t\t\t\t\t\t\t\tPlease Enter the capcha "+BL+confirm+RT+" to confirm yout order");
		int act=getIntInput(sc, "Enter Exact number: ");
		if(confirm == act){
			System.out.println(G+"\t\t\t\t\t\t\t\t\t\tYour order is Successfully placed");	
			System.out.println("\t\t\t\t\t\t\t\t\t\tYour order will be delivered to your address with in 10 minutes : "+address);
			System.out.println("\t\t\t\t\t\t\t\t\t\tPlease pay the complete bill to Delivery boy");
			System.out.println("\t\t\t\t\t\t\t\t\t\tThank you for shopping"+RT);
			int cashback=getIntInput(sc, "Enter 777 for cashback: ");
			switch(cashback){
				case 777:
					face.faceart();
					break;
				default:
					System.out.println(P+"\t\t\t\t\t\t\t\t\t\tYou entered wrong number so you lost cashback! Better luck next time"+RT);
					break;
				}
			break looppay;
		}
		else{
			System.out.println(R+"\t\t\t\t\t\t\t\t\t\tYou have entered wrong capcha so please enter correct capcha to confirm delivery"+RT);
			}
		}
	}
}
	
	static Scanner sc = new Scanner(System.in);
	static void operations(Mart user){
		 int c=0;
		loopo:
		while(true){
		d++;
		out.println();
		if(d==1)
			out.println(G+"\t\t\t\t\t\t\t\t\t\tLogin Successful"+RT);
		out.println();
		out.println(P+"\t\t\t\t\t\t\t\t\t\tEnter your choice to perform operation :"+RT);
		out.println(SK+"\t\t\t\t\t\t\t\t\t\t1.Enter into the mart for shopping");
		out.println("\t\t\t\t\t\t\t\t\t\t2.Change Password");
		out.println("\t\t\t\t\t\t\t\t\t\t3.Update Email Address");
		out.println("\t\t\t\t\t\t\t\t\t\t4.To Loggout from CV MART"+RT);
		int input = getIntInput(sc, "Enter your choice: ");
		switch(input){
			case 1:
				
				loop:
				while(true){
				menu.display_menu();
				int menu_input = getIntInput(sc, "Enter menu choice: ");							
				switch(menu_input){
					case 1:
						fruit_items obj1= new F();
						obj1.display_fruits();
						loop1:
						while(true){
						int fruit_item=getIntInput(sc, "Enter fruit choice: ");
						switch(fruit_item){
							case 1: obj1.apple();c++; break;
							case 2: obj1.orange();c++; break;
							case 3: obj1.grapes();c++; break;
							case 4: obj1.bananas();c++; break;
							case 5: obj1.avocado();c++; break;
							case 6: obj1.watermelon();c++; break;
							case 7: obj1.cherries();c++; break;
							case 8: obj1.kiwi();c++; break;
							case 9: obj1.mangoes();c++; break;
							case 10: obj1.pineapple();c++; break;
							case 11: obj1.guava();c++; break;
							case 12: obj1.papaya();c++; break;
							case 13: obj1.promogranate();c++; break;
							case 14: obj1.muskmelon();c++; break;
							case 15: obj1.dragonfruit();c++; break;
							case 16: obj1.blueberry();c++; break;
							case 17: obj1.mosambi();c++; break;
							case 18: obj1.strawberry();c++; break;
							case 19: obj1.jackfruit();c++; break;
							case 20: obj1.custardapple();c++; break;
							case 99:
								out.println("\t\t\t\t\t\t\t\t\t\tGoing to main menu again");
								break loop1;
							case 100:
								if(c>0){
								menu.checkout();
								break loopo;
								}
								else{
								System.out.println("\t\t\t\t\t\t\t\t\t\tPlease select even one item for delivery");
							}
								break;
							default :
								System.out.println(R+"\t\t\t\t\t\t\t\t\t\tInvalid Input please select valid option"+RT);
								break;
							}
						}
						break;
					case 2:
						vegetables obj2 = new V();
						obj2.display_vegetables();
						loop2:
						while(true){
						int veg=getIntInput(sc, "Enter vegetables choice: ");
						switch(veg){
							case 1: obj2.tomato();c++; break;
							case 2: obj2.potato();c++; break;
							case 3: obj2.carrot();c++; break;
							case 4: obj2.cucumber();c++; break;
							case 5: obj2.onion();c++; break;
							case 6: obj2.cabbage();c++; break;
							case 7: obj2.beetroot();c++; break;
							case 8: obj2.lemon();c++; break;
							case 9: obj2.capsicum();c++; break;
							case 10: obj2.chilli();c++; break;
							case 11: obj2.drumstick();c++; break;
							case 12: obj2.ladiesfinger();c++; break;
							case 13: obj2.garlic();c++; break;
							case 14: obj2.ginger();c++; break;
							case 15: obj2.beans();c++; break;
							case 16: obj2.brinjal();c++; break;
							case 17: obj2.cauliflower();c++; break;
							case 18: obj2.mushroom();c++; break;
							case 19: obj2.peas();c++; break;
							case 20: obj2.corn();c++; break;
							case 99:
								out.println("\t\t\t\t\t\t\t\t\t\tGoing to main menu again");
								break loop2;
							case 100:
								if(c>0){
								menu.checkout();
								break loopo;
								}
								else{
								System.out.println("\t\t\t\t\t\t\t\t\t\tPlease select even one item for delivery");
							}
								break;
									
					default :
								System.out.println(R+"\t\t\t\t\t\t\t\t\t\tInvalid Input please select valid option"+RT);
								break;
							}
						}
						break;
					case 3:
						grocery_items obj3 = new g();
						obj3.display_groceries();
						loop3:
						while(true){
						int gro=getIntInput(sc, "Enter groceries choice: ");
						switch(gro){
								case 1: obj3.rice();c++; break;
								case 2: obj3.wheatFlour();c++; break;
								case 3: obj3.sugar();c++; break;
								case 4: obj3.salt();c++; break;
								case 5: obj3.cookingOil();c++; break;
								case 6: obj3.turmericpowder();c++; break;
								case 7: obj3.redchillipowder();c++; break;
								case 8: obj3.mustardSeeds();c++; break;
								case 9: obj3.milk();c++; break;
								case 10: obj3.teaPowder();c++; break;
								case 11: obj3.curd();c++; break;
							        case 12: obj3.bread();c++; break;
								case 13: obj3.eggs();c++; break;
								case 14: obj3.detergentPowder();c++; break;
								case 15: obj3.toothPaste();c++; break;
								case 16: obj3. paneer();c++; break;
								case 17: obj3.vermicelli();c++; break;
								case 18: obj3.chicken();c++; break;
								case 19: obj3.chickenMasala();c++; break;
								case 20: obj3.noodles();c++; break;											
								case 99:
								out.println("\t\t\t\t\t\t\t\t\t\tGoing to main menu again");
								break loop3;
							case 100:
								if(c>0){
								menu.checkout();
								break loopo;
								}
								else{
								System.out.println("\t\t\t\t\t\t\t\t\t\tPlease select even one item for delivery");
							}
								break;
							default :
								System.out.println(R+"\t\t\t\t\t\t\t\t\t\tInvalid Input please select valid option"+RT);
								break;
							}
						}
						break;
					case 4:
						beauty_items obj4 = new b();
						obj4.display_beauty();
						loop4:
						while(true){
						int bea=getIntInput(sc, "Enter product choice: ");
						switch(bea){	
								case 1: obj4.faceWash();c++; break;
								case 2: obj4.moisturizer();c++; break;
								case 3: obj4.sunscreen();c++; break;
								case 4: obj4.exfoliatingScrub();c++; break;
								case 5: obj4.facemaskpack();c++; break;
								case 6: obj4.toner();c++; break;
								case 7: obj4.serum();c++; break;
								case 8: obj4.shampoo();c++; break;
								case 9: obj4.conditioner();c++; break;
								case 10: obj4.hairOil();c++; break;
								case 11: obj4.perfume();c++; break;
							        case 12: obj4.straighteners();c++; break;
								case 13: obj4.LipBalm();c++; break;
								case 14: obj4.hairGel();c++; break;
								case 15: obj4.eyebrowPencil();c++; break;
								case 16: obj4.eyeLiner();c++; break;
								case 17: obj4.mascara();c++; break;
								case 18: obj4.lipstick();c++; break;
								case 19: obj4.hairSerum();c++; break;
								case 20: obj4.babyCream();c++; break;															
								case 99:
								out.println("\t\t\t\t\t\t\t\t\t\tGoing to main menu again");
								break loop4;
							case 100:
								if(c>0){
								menu.checkout();
								break loopo;
								}
								else{
								System.out.println("\t\t\t\t\t\t\t\t\t\tPlease select even one item for delivery");
							}
								break;
							default :
								System.out.println(R+"\t\t\t\t\t\t\t\t\t\tInvalid Input please select valid option"+RT);
								break;
							}
						}
						break;
					case 5:
						Snacks obj5 = new Sn();
						obj5.display_snacks();
						loop5:
						while(true){
						int sn=getIntInput(sc, "Enter Snacks choice: ");
						switch(sn){	
								case 1: obj5.chips();c++; break;
								case 2: obj5.moongdal();c++; break;
								case 3: obj5.nuts();c++; break;
								case 4: obj5.snickers();c++; break;
								case 5: obj5.dairymilk();c++; break;
								case 6: obj5.popcorn();c++; break;
								case 7: obj5.soyasticks();c++; break;
								case 8: obj5.peanutchikki();c++; break;
								case 9: obj5.kitkat();c++; break;
								case 10: obj5.fivestar();c++; break;
								case 11: obj5.ladoo();c++; break;
							        case 12: obj5.aloobhujia();c++; break;
								case 13: obj5.goobles();c++; break;
								case 14: obj5.darkfantasy();c++; break;
								case 15: obj5.bourbon();c++; break;
								case 16: obj5.britannia();c++; break;
								case 17: obj5.parle();c++; break;
								case 18: obj5.sunfeast();c++; break;
								case 19: obj5.brownie();c++; break;
								case 20: obj5.unibic();c++; break;
								case 21: obj5.cakes();c++; break;
								case 22: obj5.chocorolls();c++; break;
								case 23: obj5.chocopie();c++; break;					
								case 99:
									out.println("\t\t\t\t\t\t\t\t\t\tGoing to main menu again");
									break loop5;
							case 100:
								if(c>0){
								menu.checkout();
								break loopo;
								}
								else{
								System.out.println("\t\t\t\t\t\t\t\t\t\tPlease select even one item for delivery");
							}
								break;
							default :
								System.out.println(R+"\t\t\t\t\t\t\t\t\t\tInvalid Input please select valid option"+RT);
								break;
							}
						}
						break;						

					case 6:
						electronics obj6 = new E();
						obj6.display_electronics();
						loop6:
						while(true){
						int e=getIntInput(sc, "Enter product choice: ");
						switch(e){	
								case 1: obj6.speaker();c++; break;
								case 2: obj6.smartwatch();c++; break;
								case 3: obj6.earbuds();c++; break;
								case 4: obj6.hairdryer();c++; break;
								case 5: obj6.coffeemaker();c++; break;
								case 6: obj6.sandwichmaker();c++; break;
								case 7: obj6.massager();c++; break;
								case 8: obj6.hairstraightener();c++; break;
								case 9: obj6.ricecooker();c++; break;
								case 10: obj6.juicermixer();c++; break;
								case 11: obj6.grinder();c++; break;
							        case 12: obj6.ledlight();c++; break;
								case 13: obj6.washingmachine();c++; break;
								case 14: obj6.geyser();c++; break;
								case 15: obj6.airpurifier();c++; break;
								case 16: obj6.fan();c++; break;
								case 17: obj6.ac();c++; break;
								case 18: obj6.adapter();c++; break;
								case 19: obj6.phone();c++; break;
								case 20: obj6.usbcable();c++; break;
								case 21: obj6.tv();c++; break;
								case 22: obj6.laptop();c++; break;
								case 23: obj6.powerbanks();c++; break;					
								case 99:
									out.println("\t\t\t\t\t\t\t\t\t\tGoing to main menu again");
									break loop6;
							case 100:
								if(c>0){
								menu.checkout();
								break loopo;
								}
								else{
								System.out.println("\t\t\t\t\t\t\t\t\t\tPlease select even one item for delivery");
							}
								break;
							default :
								System.out.println(R+"\t\t\t\t\t\t\t\t\t\tInvalid Input please select valid option"+RT);
								break;
							}
						}
						break;
					case 7:
						Homeessentials obj7 = new H();
						obj7.display_homeessentials();
						loop7:
						while(true){
						int h=getIntInput(sc, "Enter product choice: ");
						switch(h){	
								case 1: obj7.chopper();c++; break;
								case 2: obj7.icetong();c++; break;
								case 3: obj7.steelknife();c++; break;
								case 4: obj7.wallmirror();c++; break;
								case 5: obj7.curtain();c++; break;
								case 6: obj7.pressurecooker();c++; break;
								case 7: obj7.spoonstand();c++; break;
								case 8: obj7.nonsticktawa();c++; break;
								case 9: obj7.glassbeermug();c++; break;
								case 10: obj7.bedsheet();c++; break;
								case 11: obj7.lamp();c++; break;
							        case 12: obj7.wallclock();c++; break;
								case 13: obj7.ceramicplate();c++; break;
								case 14: obj7.plantstand();c++; break;
								case 15: obj7.floorrug();c++; break;
								case 16: obj7.mattress();c++; break;
								case 17: obj7.storagecabinet();c++; break;
								case 18: obj7.diningtable();c++; break;
								case 19: obj7.sofa();c++; break;
								case 20: obj7.officechair();c++; break;
								case 21: obj7.laptoptable();c++; break;
								case 22: obj7.oildispenser();c++; break;
								case 99:
									out.println("\t\t\t\t\t\t\t\t\t\tGoing to main menu again");
									break loop7;
							case 100:
								if(c>0){
								menu.checkout();
								break loopo;
								}
								else{
								System.out.println("\t\t\t\t\t\t\t\t\t\tPlease select even one item for delivery");
							}
								break;
							default :
								System.out.println(R+"\t\t\t\t\t\t\t\t\t\tInvalid Input please select valid option"+RT);
								break;
							}
						}
						break;	
					case 8:
						Softdrinks obj8 = new S();
						obj8.display_softdrinks();
						loop8:
						while(true){
						int s=getIntInput(sc, "Enter cooldrink choice: ");
						switch(s){	
								case 1: obj8.sevenup();c++; break;
								case 2: obj8.sprite();c++; break;
								case 3: obj8.coco_cola();c++; break;
								case 4: obj8.thumbsup();c++; break;
								case 5: obj8.fanta();c++; break;
								case 6: obj8.mirnda();c++; break;
								case 7: obj8.mountain_dew();c++; break;
								case 8: obj8.pepsi();c++; break;
								case 9: obj8.Limca();c++; break;
								case 10: obj8.coconut_water();c++; break;
								case 11: obj8.redbull();c++; break;
								case 12: obj8.Monster();c++; break;
								case 13: obj8.Coolberg();c++; break;
								case 14: obj8.Maaza();c++; break;
								case 15: obj8.pulpyOrange();c++; break;
								case 16: obj8.Amullassi();c++; break;
								case 17: obj8.KinleyStrongSoda();c++; break;
								case 18: obj8.Coco_cola_Zerosugar();c++; break;
								case 19: obj8.Pepsi_ZeroSugar();c++; break;
								case 99:
									out.println("\t\t\t\t\t\t\t\t\t\tGoing to main menu again");
									break loop8;
							case 100:
								if(c>0){
								menu.checkout();
								break loopo;
								}
								else{
								System.out.println("\t\t\t\t\t\t\t\t\t\tPlease select even one item for delivery");
							}
								break;
							default :
								System.out.println(R+"\t\t\t\t\t\t\t\t\t\tInvalid Input please select valid option"+RT);
								break;
							}
						}
						break;
					case 99:
						break loop;	
					case 100:
								if(c>0){
								menu.checkout();
								break loopo;
								}
								else{
								System.out.println("\t\t\t\t\t\t\t\t\t\tPlease select even one item for delivery");
							}
								break;

					default:
						System.out.println(R+"\t\t\t\t\t\t\t\t\t\tYou Have entered a Invalid choice please select valid option"+RT);	

					}
				}
				break;
			case 2:
				out.print("\t\t\t\t\t\t\t\t\t\tEnter current password: ");
				String curpass=sc.next();
				if(curpass.equals(user.getPassword())){
					out.print("\t\t\t\t\t\t\t\t\t\tEnter new password: ");
					String newpass=sc.next();
					user.setPassword(newpass);
					out.println(G+"\t\t\t\t\t\t\t\t\t\tPassword updated successfully"+RT);
				}
				else{
					out.println(R+"\t\t\t\t\t\t\t\t\t\tcurrent password is incorrect please try again"+RT);
				}
				break;
			case 3:
				out.print("\t\t\t\t\t\t\t\t\t\tEnter New username: ");
				String newUsername=sc.next();
				user.setUsername(newUsername);
				break;
			case 4:
				out.println(TR+"\t\t\t\t\t\t\t\t\t\tLogged out"+RT);
				break loopo;
			default :
				out.println(R+"\t\t\t\t\t\t\t\t\t\tInvalid choice please choose another option"+RT);
				operations(user);
				break loopo;
				
			}
		}
		
	}
	public static void main(String[] args){
		logo.cvlogo();
		out.println(TG+"\t\t\t\t\t\t\t\t\t\tWelcome to the CV MART"+RT);
		loopf:
		while(true){
		out.println(LB+"\t\t\t\t\t\t\t\t\t\tPlease enter Email and password to create account"+LB);
		out.print("\t\t\t\t\t\t\t\t\t\tPlease enter Email ID: \t\t");
		String username=sc.next();
		out.print("\t\t\t\t\t\t\t\t\t\tPlease enter password: \t\t");
		String password=sc.next();
		long num = getLongInput(sc, "Please enter mobile number: \t");
		loope:
		while(true){
		if(username.charAt(username.length()-1)=='m'){
		Mart user = new Mart(username,password);
		System.out.println();
		out.print("\t\t\t\t\t\t\t\t\t\tEnter Email to login: \t\t");
		String actualUsername=sc.next();
		out.print("\t\t\t\t\t\t\t\t\t\tEnter password to login:        ");
		String actualPassword=sc.next();
		if(actualUsername.equals(user.getUsername())){
			if(actualPassword.equals(user.getPassword())){
			operations(user);
			break loope;
			}
			else{
				out.println(TR+"\t\t\t\t\t\t\t\t\t\tIncorrect Password, please try again"+RT);
			}
		}
		else{
			out.println(R+"\t\t\t\t\t\t\t\t\t\tUser not found, please try again"+RT);
		}
		}
	else{
		System.out.println(TR+"\t\t\t\t\t\t\t\t\t\tInvalid Credentials so Enter a valid email address"+RT);
		System.out.println();
		break loope;
	     }
	  }
	if(d!=0){
		break;
		}
	  }
	}
}


		
		
		
	
		

