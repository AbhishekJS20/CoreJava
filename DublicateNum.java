//Find out duplicate number between 1 to N numbers.

package Campus;

import java.util.ArrayList;
import java.util.List;

public class DublicateNum 
{
	void printRepeating(int arr[], int size) 
    {
        
        System.out.println("Repeated Elements are :");
        for (int i = 0; i < size; i++) 
        {
            for (int j = i + 1 ; j < size; j++) 
            {
                if (arr[i] == arr[j]) 
                    System.out.print(arr[i] + " ");
            }
        }
    }
 
    public static void main(String[] args) 
    {
		
    	DublicateNum repeat = new DublicateNum();
        int arr[] = {4, 2, 4, 5, 2, 3, 1};
        int arr_size = arr.length;
        repeat.printRepeating(arr, arr_size);
    }
}
/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {1,2,4,3,5,3,1,5,7,8,8,9};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j< a.length;j++)
			{
				if(a[j]==a[i])
				{
					System.out.println(a[i]);
					
				}
			}
		}
			

	}
*/
/*public int findDuplicateNumber(List<Integer> numbers){
		
		int highestNumber = numbers.size() - 1;
		int total = getSum(numbers);
		int duplicate = total - (highestNumber*(highestNumber+1)/2);
		return duplicate;
	}
	
	public int getSum(List<Integer> numbers){
		
		int sum = 0;
		for(int num:numbers){
			sum += num;
		}
		return sum;
	}
	
	public static void main(String a[]){
		List<Integer> numbers = new ArrayList<Integer>();
		for(int i=1;i<30;i++){
			numbers.add(i);
		}
		//add duplicate number into the list
		numbers.add(22);
		numbers.add(14);
		numbers.add(75);
		numbers.add(75);
		numbers.add(87);
		numbers.add(14);
		numbers.add(45);
		numbers.add(10);
		numbers.add(1);
		DublicateNum dn = new DublicateNum();
		System.out.println("Duplicate Number: "+dn.findDuplicateNumber(numbers));
	}
}*/
