/**
 * 
 */

/**
 * @author User
 *
 */
public class Item {
	
	/*static attributes*/
	
	private static int totalItem=0;
	
	
	private String itemId;
	private String name;
	private String description;
	private String category;
	private String supplierName;
	private String supplierContacts;
	private double price;
	private int availableQty;
	
	
	
		
		/*constructor*/
	
		/* Default constructor*/
			
		/**
		 * 
		 */
	public Item() {	
	this.itemId = null;
	this.name = null;
	this.description = null;
	this.category = null;
	this.supplierName = null;
	this.supplierContacts=null;
	this.price = 0.0;
	this.availableQty=0;
	settotalItem(gettotalItem()+1);
	
	}
	
	/**
	 * Constructors with overloaded parameters
	 * @param itemId id of product
	 * @param name of product
	 * @param description of the product
	 * @param category of the product
	 * @param supplierName name of the supplier
	 * @param price 
	 * @param availableQty amount in stock
	 */
	public Item(String itemId, String name, String description,String category, String supplierName, String supplierContacts, double price,int availableQty) {
		
		this.itemId=itemId;
		this.name=name;
		this.description=description;
		this.category=category;
		this.supplierName=supplierName;
		this.supplierContacts=supplierContacts;
		this.price=price;
		this.availableQty=availableQty;
		
		settotalItem(gettotalItem()+1);
		
	}

	/**
	 * @return the itemId
	 */
	public String getItemId() {
		return this.itemId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return this.category;
	}

	/**
	 * @return the supplierName
	 */
	public String getSupplierName() {
		return this.supplierName;
	}
		
	
	/**
	 * @return the supplierContacts
	 */
	public String getSupplierContacts() {
		return this.supplierContacts;
	}

	

	/**
	 * @return the price
	 */
	public double getPrice() {
		return this.price;
	}

	/**
	 * @return the availableQty
	 */
	public int getAvailableQty() {
		return this.availableQty;
	}

	/**
	 * @param itemId the itemId to set
	 */
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @param supplierName the supplierName to set
	 */
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
		
	}

	
	/**
	 * @param supplierContacts the supplierContacts to set
	 */
	public void setSupplierContacts(String supplierContacts) {
		this.supplierContacts = supplierContacts;
	}
	
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @param availableQty the availableQty to set
	 */
	public void setAvailableQty(int availableQty) {
		this.availableQty = availableQty;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", name=" + name + ", description=" + description + ", category=" + category
				+ ", supplierName=" + supplierName + ", supplierContacts=" + supplierContacts + ", price=" + price
				+ ", availableQty=" + availableQty + "]";
	}

	/**
	 * 
	 * @return the total of the item
	 */
	
	public static int gettotalItem() {
		return totalItem;
	}
	
	public static void settotalItem(int totalItem) {
		Item.totalItem=totalItem;
	}
}
