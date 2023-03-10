/**
 * @author fgh
 * @create 2023- 02-25 14:50
 */
public class e3 {
    public static void main(String[] args) {
        int[] s=new int[]{2,2,2};
        int x=2;
        int i=binarySearch(s,x);
        int i1=binarySearch(s,x+1)-1;
        System.out.println(i);
        System.out.println(i1);


    }
    public static int binarySearch(int[] nums,int target){
        int n=nums.length;
        int left=0,right=n-1;
        int index=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]>=target){
                index=right;
                right=mid-1;
            }else if(nums[mid]<target){
                left=mid+1;
            }
        }
        return index;
    }


}
