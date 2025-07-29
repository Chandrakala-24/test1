package Encapsulation;

public class Book {
	private String Name;
	private Author Author;
	private double Price;
	private int QtyInStock;
	
	public String getName() {
		return Name;
	}
		
	public void setName(String Name) {
		this.Name=Name;
	}
	
	public Author getAuthor()
	{
		return Author;
	}
	public void setAuthor(Author Author ) {
		this.Author=Author;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double Price) {
		this.Price=Price;
	}
	public int getQtyInStock() {
		return QtyInStock;
	}
	public void setQtyInStock(int QtyInStock) {
		this.QtyInStock=QtyInStock;
}

}
