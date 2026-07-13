package encapsulation;

import java.util.Scanner;

class CustomerfeedbackData
{
	private int customerId;
	private String feedbackText;
	private int rating;
	
	public void setCustomerId(int customerId,String feedbackText,int rating)
	{
		this.customerId = customerId;
		this.feedbackText = feedbackText;
		this.rating = rating;
	}
	
	public int getCustomerId()
	{
		return customerId;
	}
	
	public String getFeedbackText()
	{
		return feedbackText;
	}
	
	public int getRating()
	{
		return rating;
	}
}
public class CustomerFeedback 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		CustomerfeedbackData c = new CustomerfeedbackData();
		int custid = sc.nextInt();
		sc.nextLine();
		String feedback = sc.nextLine();
		int rating = sc.nextInt();
		c.setCustomerId(custid, feedback, rating);
		System.out.println(c.getCustomerId());
		System.out.println(c.getFeedbackText());
		System.out.println(c.getRating());
		sc.close();
		

	}

}
