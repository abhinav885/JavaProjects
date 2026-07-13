package inheritance;
class Book8{
	private String title;
	private String author;
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setBook(String title,String author) {
		this.title = title;
		this.author = author;
	}
	
	public String getInfo() {
		return("Title: "+getTitle()+" "+"Author: "+getAuthor());
	}
}

class Ebook extends Book8{
	private String fileSize;

	public Ebook(String fileSize,String title,String author) {
		super.setBook(title,author);
		this.fileSize = fileSize;
	}

	public String getFileSize() {
		return fileSize;
	}

	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}
	
	public String getInfo() {
		return(super.getInfo()+" "+"Filesize: "+fileSize);
	}
}

class PrintedBook extends Book8{
	private int pages;//Instance variables
	public PrintedBook(int pages,String title,String author) {
		super.setBook(title, author);
		this.pages = pages;
	}
	
	public int getPages() {
		return pages;
	}
	
	public void setPages(int pages) {
		this.pages = pages;
	}
	
	public String getInfo() {
		return(super.getInfo()+" "+"Pages: "+pages);
	}
	
}
public class Book5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintedBook p = new PrintedBook(200,"To kill a MockingBird","Harper lee");
		System.out.println(p.getInfo());
		Ebook e = new Ebook("2MB","1984","George Orwell");
		e.setBook("Wings of Fire","APJ");
		System.out.println(e.getInfo());
	}

}
