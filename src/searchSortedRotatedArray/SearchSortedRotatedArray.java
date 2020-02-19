/*
https://www.geeksforgeeks.org/search-an-element-in-a-sorted-and-pivoted-array/
 */
package searchSortedRotatedArray;

public class SearchSortedRotatedArray {
    public int searchArrayUnrotated(int[] input, int number){
        int low=0, mid;
        int high = input.length-1;
        int flag = -1;
        while (low<=high)
        {
            //System.out.println(low+"  "+ mid+ "  "+high);
            mid = low+( high - low )/2;
            if(input[mid] == number) {
                flag = mid;
                break;
            }
            else
                if( number<input[mid])
                    high = mid-1;
                            else
                     low = mid+1;

        }
        return flag;
    }

    public int searchRotatedArray(int[] input, int number){
        int index=-1;
        int low = 0, mid;
        int high = input.length -1;
        while(low<=high)
        {
     //       System.out.println(low+"  "+ mid+ "  "+high);
            mid = low +(high-low)/2;
            if(input[mid]==number){
                index=mid;
                break;
            }
            else if( number<input[mid] && number>=input[low]){
                high=mid-1;
            }
            else if( number>input[mid] && number<=input[high]){
                low=mid+1;
            }
            else if( number<input[mid] && number<=input[low]){
                low=mid+1;
            }
            else if( number>input[mid] && number>=input[high]){
                high=mid-1;
            }
        }
        return index;
    }

    public int  searchRotatedRecursive( int[] input, int number )
    {
        return( searchRotatedRecursivePrivate(input, 0,input.length-1,number));
    }
    private static int searchRotatedRecursivePrivate( int[] input, int low,int high, int number ){
        int mid =low + ( high - low )/2;
        if(low>high) return -1;
        if(input[mid]==number){
            return mid;
         }
        else if( number<input[mid] && number>=input[low]){
            high=mid-1;
        }
        else if( number>input[mid] && number<=input[high]){
            low=mid+1;
        }
        else if( number<input[mid] && number<=input[low]){
            low=mid+1;
        }
        else if( number>input[mid] && number>=input[high]){
            high=mid-1;
        }
        return searchRotatedRecursivePrivate(input,low,high,number);
    }

    public int findPivot( int[] input ){

        return(findPivotPrivate(input,0,input.length-1));
    }

    private static int findPivotPrivate(int[] input, int low, int high){
        int  mid = low +(high -low)/2;
        if(low>high)return -1;
        if(input[mid] <= input[high] && input[mid] <=input[low])
            return mid;
        if(input[mid]>input[low])
            return findPivotPrivate(input,mid+1,high);
        else
            return findPivotPrivate(input,low,mid-1);
    }
}
