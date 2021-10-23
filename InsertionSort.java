
import static java.lang.System.*;

public class InsertionSort
{
	public static void insertionSort( int[] stuff)
	{
	   for(int i=1; i< stuff.length; ++i)
	   {
	      int val = stuff[i];
	      int j=i;
	      while(j>0&&val<stuff[j-1])
	      {         
	         stuff[j]=stuff[j-1];
	         j--;
	      }
	      stuff[j]=val;
	   }
	   for(int i = 0; i<stuff.length; i++) {
			System.out.print(" " + stuff[i]);
		}
	}	
	public static void main(String[] args) {
		int ray[] = {1,3,4,5,6,3,1,5,4};
		
		InsertionSort inser = new InsertionSort();
		inser.insertionSort(ray);
	}
}
