package activities;

import java.util.Arrays;

public class Activity4 {
public static void main(String[] args) {
	Activity4 actobj=new Activity4();
	//create unsorted array
	int[] nums= { 10, 9, 47, 210, 24,5,26 };
	//call function to sort the array
	actobj.insertionSort(nums);
	System.out.println("Sorted Array:"+Arrays.toString(nums));
	
}
public void insertionSort(int[] nums)
{

	//length of the array
	int size=nums.length;
	
	//loop through array
	//starting from second value
	for(int i=1;i<size;i++)
	{
		// set the key value and first compare value
		int key=nums[i];
		int j=i-1;
		
		// check key is lesser
		// if it is swap it with left value
		while(j>=0&& key<nums[j])
		{
			nums[j+1]=nums[j];
			--j;
			
		}// make the next value as key
		nums[j+1]=key;
	}
}
}
