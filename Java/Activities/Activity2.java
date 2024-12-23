package activities;

public class Activity2 {
	public static void main(String[] args) {
		
	
	//create obj for class
	Activity2 actobj=new Activity2();
// create an integer array
int[] numarr= {10, 77, 10, 54, -11, 10};
//set the number to search for
 int searchnum=10;
 int fixednum=30;
 //call the result function and print the result

 System.out.println("Result:"+ actobj.result(numarr, searchnum, fixednum));
 
}

public boolean result(int[] numarr,int searchnum,int fixednum)
{
	//temp variable to hold calculated sum
	int tempsum = 0;
	// loop through to array to create sum
	for (int number: numarr) {
		//check if the value is searchnum
		if(number==searchnum) {
			//add the value
			tempsum+=searchnum;
	}
	//check if tempsum is greater than fixednum
	if(tempsum>fixednum) {
		//condition fails,break the loop
		break;
 }
}
		
	return fixednum==tempsum;
}
}