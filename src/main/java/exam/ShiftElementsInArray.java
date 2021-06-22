package exam;

public class ShiftElementsInArray {

  public void shift(int[] arr) {
            int j, last;    
           
            last = arr[arr.length-1];    
            
            for(j = arr.length-1; j > 0; j--){    
                 
                arr[j] = arr[j-1];    
            }    
            arr[0] = last;    
            for(i=0;i<arr.length;i++){
              System.out.println(arr[i]);

            }

  }

}
