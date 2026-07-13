package encapsulation;
class Book3
{
	String title;
	String author;
	int price;
	int pages;
	
	public Book3()
	{
		this("Amazon");
	}
	
	public Book3(String title)
	{
		this(title,"Sudha Murthy");
	}
	
	public Book3(String title,String author)
	{
		this(title,author,2000);
	}
	
	public Book3(String title,String author,int price)
	{
		this(title,author,price,500);
	}
	
	public Book3(String title,String author,int price,int pages)
	{
		this.title = title;
		this.author = author;
		this.price = price;
		this.pages = pages;
	}
	
	void disp()
	{
		System.out.println("The title name is: "+title);
		System.out.println("The author name is: "+author);
		System.out.println("The amount is: "+price);
		System.out.println("Number of pages is: "+pages);
	}
	
	
}
public class Book2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Book3 b = new Book3();
		Book3 b1 = new Book3("Java Programming");
		Book3 b2 = new Book3("Python","Abhinav");
		Book3 b3 = new Book3("Html","Kunal",1000);
		Book3 b4 = new Book3("Ruby","Abhishek",200,570);
		b.disp();
		System.out.println();
		
		b1.disp();
		System.out.println();
		
		b2.disp();
		System.out.println();
		
		b3.disp();
		System.out.println();
		
		b4.disp();
		System.out.println();
		
		

	}

}
