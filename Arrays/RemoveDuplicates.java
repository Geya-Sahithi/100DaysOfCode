/* Here is the explanation for the code above:
 */

class RemoveDuplicates 
{ 
    static int remDups(int arr[], int n)
    {
        //1. We create a temporary array to store the elements of the original array
    	int temp[] = new int[n];

        //2. We store the first element of the array in the temporary array (temp[0] = arr[0])
    	temp[0] = arr[0];

    	int res = 1;

        //3. We loop through the entire original array (from index 1 to the end)
    	for(int i = 1; i < n; i++)
    	{
            //4. We compare the element of the original array with the element in the temporary array
            //5. If the element of the temporary array is not equal to the element of the original array,
            //we store the element in the original array in the temporary array
            //6. We increment the index of the temporary array by 1
            //7. We return the temporary array
    		if(temp[res - 1] != arr[i])
    		{
    			temp[res] = arr[i];
    			res++;
    		}
    	}

    	for(int i = 0; i < res; i++)
    	{
    		arr[i] = temp[i];
    	}

    	return res;
    }

    public static void main(String args[]) 
    { 
       int arr[] = {10, 20, 20, 30, 30, 30}, n = 6;

       System.out.println("Before Removal");

       for(int i = 0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }

       System.out.println();

       n = remDups(arr, n);

       System.out.println("After Removal");

       for(int i = 0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }

    } 

}


