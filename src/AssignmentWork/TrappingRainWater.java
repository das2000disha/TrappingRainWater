package AssignmentWork;

public class TrappingRainWater {
	
	public static void main(String[] args)
    {
        int[] arr = { 3, 0, 0, 2, 0, 4 };
        int n = arr.length;
  
        System.out.print(trappingWater(arr, n));
    }
	
	public static int trappingWater(int[] arr, int n)
    {
        int storedWater = 0;        
        for (int i = 1; i < n - 1; i++) {  
            
        	int leftBlockHeight = arr[i];
            
        	for (int j = 0; j < i; j++) {               
            	leftBlockHeight = Math.max(leftBlockHeight, arr[j]);            
            }          
            
        	int rightBlockHeight = arr[i];            
            
        	for (int j = i + 1; j < n; j++) {                
            	rightBlockHeight = Math.max(rightBlockHeight, arr[j]);           
            }       
        	storedWater += Math.min(leftBlockHeight, rightBlockHeight) - arr[i];
        }       
        return storedWater;
    }
}
