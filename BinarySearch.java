
class BinarySearch {

	
	public static int binarySearch(int arr[], int l, 
						int r, int x)
	{ 
		
		if (r >= l && l<arr.length-1) { 
		
			int mid = l + (r - l) / 2;
System.out.println(mid);
			// If the element is present 
			// at the middle itself
			if (arr[mid] == x)
				return mid;

			// If element is smaller than mid, then it can only
			// be present in left subarray
			if (arr[mid] > x)
				return binarySearch(arr, l, mid - 1, x);

			// Else the element can only be present in right
			// subarray
			return binarySearch(arr, mid + 1, r, x);
		}

	
		return -1;
	}

	
	public static void main(String args[])
	{
		
		int arr[] = { 2,3,4,5,6,8 };
		int n = arr.length;
		int x = 5;
		int result = binarySearch(arr, 0, n - 1, x);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + result);
	}
}

