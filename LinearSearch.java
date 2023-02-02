class LinearSearch
{
	public static void main(String [] args)
	{
		long startTime = System.nanoTime();
		int [] arr = new int [900000];
		for(int i=1;i<arr.length;i++)
		{
			arr[i] = i;
		}
		int index = search(arr,888888);
		if(index!=-1)
		{
			System.out.println("Element found at index "+ index);
		}
		else
		{
			System.out.println("Element not found");
		}
		long endTime = System.nanoTime();
		long totalTime = (endTime - startTime)/1000000000; //time is in nanosecond hence convering to sec
		System.out.println("Run time in Sec " + totalTime);
	}
	static int search(int arr[], int element)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]); //not part of the fun, printing to follow up with scanning
			if(arr[i]==element)
				return i;
		}
		return -1;
	}
}