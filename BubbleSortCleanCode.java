package in.bubblesort;

public class BubbleSortCleanCode {
	
	public static int[] Sort(int[] unsortedArray)
	{ 
		if(unsortedArray.length > 1)
			SortList(unsortedArray);
		return unsortedArray;
	}
	
	public static void SortList(int[] unsortedArray)
	{	int unsortedArrayLength = unsortedArray.length;
		while(unsortedArrayLength > 0){
			PlaceLargestElementAtEndOfArray(unsortedArray);
		 unsortedArrayLength--;
		}
	}


	public static void PlaceLargestElementAtEndOfArray(int[] unsortedArray)
	{
		for(int j=0;j<unsortedArray.length-1;j++)
			SortElements(unsortedArray, j);
	}
	
	public static void SortElements(int[]unsortedArray, int j)
	{
		if(unsortedArray[j] > unsortedArray[j+1])
			SwapElements(unsortedArray,j);
	}
	
	public static void SwapElements(int[]unsortedArray, int j)
	{
		int backupElement = unsortedArray[j];
		unsortedArray[j] = unsortedArray[j+1];
		unsortedArray[j+1] = backupElement;
	}
}
