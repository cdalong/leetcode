
public class SortedArrays {
	
	 public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		 
		 //data is sorted smallest to biggest
		 
		 int[] bigarray = new int[nums1.length + nums2.length];
		 
		 int even = bigarray.length %2;
		 
		 int i=0 , j = 0 , bigindex = 0;
		 
		 while (i < nums1.length && j < nums2.length ){	 
			 if (nums1[i] <= nums2[j]){		 
				 //nums 1 is smaller
				 bigarray[bigindex] = nums1[i]; 		 
				 i++;
				 bigindex++;	 
			 } 
			 else {
				 //nums 2 is smaller 
				 bigarray[bigindex] = nums2[j];  
				 j++;
				 bigindex++;
			 } 
		 }
		 
		 if (nums1.length > nums2.length ){
			 
			for (i++; i < nums1.length;){
				
				bigarray[bigindex] = nums1[i];
				
			}
		 }
		
			else{
				
				for (j++; j < nums2.length;){
					
					bigarray[bigindex] = nums2[j];
					
				}
			}
			 
		 
		 //calculate median of sorted big array
		 
		 
		 int index = bigarray.length/2;
		 
		 if (even == 1){
			 
			 
			 return bigarray[index];
		 }
		 
		 else{
			 
			 return (bigarray[index] + bigarray[index -1])/2;
			 
		 }
		 
	        
	    }

}
