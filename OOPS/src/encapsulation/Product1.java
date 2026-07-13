package encapsulation;

import java.util.Scanner;

class product
{
	private int productId;
	private String productName;
	private int quantity;
	private double price;
	
	public void setProductId(int productId)
	{
		this.productId = productId;
	}
	
	public int getProductId()
	{
		return productId;
	}
	
	public void setProductName(String productName)
	{
		this.productName = productName;
	}
	
	public String getProductName()
	{
		return productName;
	}
	
	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}
	
	public int getQuantity()
	{
		return quantity;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public double getPrice()
	{
		return price;
	}
}
public class Product1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		product p = new product();
		p.setProductId(sc.nextInt());
		sc.nextLine();
		p.setProductName(sc.nextLine());
		p.setQuantity(sc.nextInt());
		sc.nextLine();
		p.setPrice(sc.nextDouble());
		
		System.out.println("Your Product ID is: "+p.getProductId());
		System.out.println("Your product Name is: "+p.getProductName());
		System.out.println("Your Quantity is: "+p.getQuantity());
		System.out.println("Your amount is: "+p.getPrice());
		sc.close();

	}

}
