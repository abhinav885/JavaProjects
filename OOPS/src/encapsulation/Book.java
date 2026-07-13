package encapsulation;

import java.util.Scanner;

class Book4
{
	private String ISBN;
	private String title;
	private String authorName;
	private float price;
	
	public void setISBN(String ISBN)
	{
		this.ISBN = ISBN;
	}
	
	public String getISBN()
	{
		return ISBN;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public void setAuthorName(String authorName)
	{
		this.authorName = authorName;
	}
	
	public String getAuthorName()
	{
		return authorName;
	}
	
	public void setPrice(float price)
	{
		this.price = price;
	}
	
	public float getPrice()
	{
		return price;
	}
	
	
}
public class Book 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Book4 b = new Book4();
		
		b.setISBN(sc.nextLine());
		b.setTitle(sc.nextLine());
		b.setTitle(sc.nextLine());
		b.setPrice(sc.nextFloat());
		
		System.out.println("The ISBN is: "+b.getISBN());
		System.out.println("The title is: "+b.getTitle());
		System.out.println("The AuthorName is: "+b.getAuthorName());
		System.out.println("The Price is: "+b.getPrice());
		sc.close();
	}

}
