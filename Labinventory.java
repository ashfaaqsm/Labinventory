import java.util.Scanner; //import scanner
/**
 * 
 */

/**
 * @author User
 *
 */
public class Labinventory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Scanner keyboard = new Scanner(System.in);
	
	//Declaration of variables
	int size=0 ; int choice =0; int wrong=0; int  i=0; int j =0; int times=0 ; int count=0 ; int quantity=0 ;int choice2=0;
	final String password1 = "hello1234";
	boolean A , B ;
	String password = null; String id=null; String name=null; String description=null; String category=null ;
	String sname=null ; String scontact=null ;
	double price = 0.0 ;

	System.out.println("Welcome");
	
	System.out.println("Enter the amount of item to store: ");
	size = keyboard.nextInt();
	
	Item[]ItemDatabase= new Item[size];
	while(true) {
		for(count=0; count>=0;count++) {
			System.out.println("Here are the options available.\nChoose 1 to enter a new item (Password required).\nChoose 2 "
					+ "to change the details of an existing ietm(Password required).\nChoose 3 to display all item with the specific"
					+ " category. \nChoose 4 to display all item to be reordered. \nChoose 5 to know the amout of items available."
					+ "\nChoose 6 to exit \nSelect your number: ");
			choice=keyboard.nextInt();
			
			if(choice==1) {
				for (times=0;times<=3;times++) {
					System.out.println("Enter your password: ");
					password=keyboard.next();
					if(password.equals(password1)) {
						System.out.println("Enter the name of the item from the list and its  features");
						for(i=0;i<size;i++) {
							System.out.println("Enter item ID: ");
							id=keyboard.next();
							
							System.out.println("Enter item name: ");
							name=keyboard.next();
							
							System.out.println("Enter item description: ");
							description=keyboard.next();
							
							System.out.println("Enter item category: ");
							category=keyboard.next();
							
							System.out.println("Enter supplier name: ");
							sname=keyboard.next();
							
							System.out.println("Enter supplier contact: ");
							scontact=keyboard.next();
							
							System.out.println("Enter item price: ");
							price=keyboard.nextDouble();
							
							System.out.println("Enter quantity of item available: ");
							quantity= keyboard.nextInt();
							
							ItemDatabase[i] = new Item(id ,name , description , category , sname , scontact, price, quantity);
							
							ItemDatabase[i].setItemId(id);

							ItemDatabase[i].setName(name);

							ItemDatabase[i].setDescription(description);

							ItemDatabase[i].setCategory(category);
							
							ItemDatabase[i].setSupplierName(sname);

							ItemDatabase[i].setSupplierContacts(scontact);

							ItemDatabase[i].setPrice(price);

							ItemDatabase[i].setAvailableQty(quantity);

							}

							System.out.println("ItemId" + "Name" + "Description" + "Category" + "Supplier Contacts"+ "Price"+ "Available quantity");

							for (j = 0; j < size; j++) {

							System.out.println(ItemDatabase[j]);

							}

							break;

							}

							else if(!password.equals(password1)) {

							System.out.println("Your password is incorrect, only "+(3-(count))+ "attempts are left" );

							if (count == 2) {

							continue;

							}

							else if (count == 3) {

							System.out.println("maximun attempt reach. \nEXITING PROGRAM");

							break;

							}

							}

							}

							}

							else if (choice == 2) {

							 

							                    for (times= 1; times <= 3; times++) {

							System.out.println("Enter your password: ");

							password = keyboard.next();

							if (password.equals(password1)) {

							System.out.println("Enter item to update: ");

							String itemId = keyboard.next();

							for(i=0; i<size ; i++) {

							String abc = ItemDatabase[i].getItemId();

							if(itemId.equalsIgnoreCase(abc)) {

							 

							System.out.println("Enter item to enter: ");

							System.out.println(ItemDatabase[i]);

							System.out.println("Item's id"+ItemDatabase[i].getItemId());

							System.out.println("Item's name: "+ItemDatabase[i].getName());

							System.out.println("Item's description" +ItemDatabase[i].getDescription() );

							System.out.println("Item's category"+ItemDatabase[i].getCategory());

							System.out.println("Supplier's contact"+ItemDatabase[i].getSupplierContacts());

							System.out.println("Item's price"+ItemDatabase[i].getPrice());

							System.out.println("Availability of items"+ItemDatabase[i].getAvailableQty());

							System.out.println("Options");

							while(B = true) {

							System.out.println("Please choose a number");

							System.out.println("1.ItemId \n"+ "2.Name\n"+"3.Description\n"+"4.Category\n"+"5.supplierContacts\n"+ "6.Price"+" 7.AvailableQuantity");

							 

							choice2 = keyboard.nextInt();

							if(choice2 == 1) {

							 

							System.out.println("Enter item name: ");

							        String Name  = keyboard.next();

							        ItemDatabase[i].setName(Name);

							        System.out.println(ItemDatabase[i]);

							}

							else if (choice2 == 2) {

							System.out.println("Enter item description: ");

							        String Description  = keyboard.next();

							        ItemDatabase[i].setDescription(Description);

							        System.out.println(ItemDatabase[i]);

							}

							else if (choice2 == 3) {

							 

							System.out.println("Enter category of the item: ");

							        String Category  = keyboard.next();

							        ItemDatabase[i].setCategory(Category);

							        System.out.println(ItemDatabase[i]);

							        

							}

							else if (choice2 == 4) {

							System.out.println("Enter Supplier's contact: ");

							        String supplierContacts  = keyboard.next();

							        ItemDatabase[i].setSupplierContacts(supplierContacts);

							        System.out.println(ItemDatabase[i]);

							 

							}

							else if (choice2 == 5) {

							System.out.println("Enter item's price ");

							        double Price  = keyboard.nextDouble();

							        ItemDatabase[i].setPrice(Price);

							        System.out.println(ItemDatabase[i]);

							        

							}

							else if (choice2 == 6) {

							System.out.println("Enter the amout of the item in stock ");

							        int availableQty = keyboard.nextInt();

							        ItemDatabase[i].setAvailableQty(availableQty);

							        System.out.println(ItemDatabase[i]);

							}

							else if(choice2 == 7) {

							A = false;

							break;

							}

							else {

							System.out.println("You can choose only between option 1-7");

							}

							}

							}

							}

							}

							}

							}

							else if (password.equals(password1)) {

							System.out.println("Your password is incorrect, only "+(3-(times))+ "attempts are left"); 

							}

							else if (choice == 3) {

							System.out.println("Enter category for an Item"); 

							}

							else if (choice == 4) {

							System.out.println("Re order the the products ");

							if (ItemDatabase[0].getAvailableQty() < 5) {

							System.out.println("Item id : " + ItemDatabase[0].getItemId()+ "\nItem Name : " + ItemDatabase[0].getName()+ "\nAvailable Quantity : " + ItemDatabase[0].getAvailableQty());

							System.out.println(" Out of stock. Re order");

							}

							else {

							System.out.println("Item id : " + ItemDatabase[0].getItemId() + "\nItem Name : " + ItemDatabase[0].getName()+ "\nAvailable Quantity: " + ItemDatabase[0].getAvailableQty());

							System.out.println("Available");

							}

							if (ItemDatabase[1].getAvailableQty() < 10) {

							System.out.println("The item id : " + ItemDatabase[1].getItemId() + "\n Item Name : " + ItemDatabase[1].getName() + "\nAvailableQuantity : " + ItemDatabase[1].getAvailableQty());

							System.out.println("Few available, re order");

							}

							else {

							System.out.println("Item id : " + ItemDatabase[1].getItemId() + "\nItem Name : " + ItemDatabase[1].getName()+ "\nAvailable: " + ItemDatabase[1].getAvailableQty());

							System.out.println("Available");

							}

							}

							else if(choice == 5) {

							System.out.println("Number of items created: ");

							Item.gettotalItem();

							}

							}

							}

							}

							}

							 						