package activities;
abstract class Book{
	//create variable with type String
	String title;
	
	//abstract method to set the title
   public abstract void setTitle(String title);
 
  //concrete method to get the title
   public String getTitle() {
	return this.title;
}
  }
class MyBook extends Book{
	//Define abstract method
    public void setTitle(String title) {
        this.title = title;

}
}
class MyBook2 extends Book{
	//Implement the setTitle function
    public void setTitle(String title) {
    	if(title.length()<3)
    	{
    		System.out.println("Title is too small");
    	}else {
        this.title = title;
    	}
    	

}
}
public class Activity5 {
	public static void main(String []args) {
        //Initialize title of the book
        String title = "Hover Car Racer";
        //Create object for MyBook
        MyBook bookobj = new MyBook();
        //Set title
        bookobj.setTitle("Hello Rehana welcome to Java");
        
        //Print result
        System.out.println("The title is: " + bookobj.getTitle());
    }
}
