import java.util.Arrays;
class lc75{
    public static void sortColors(int[] nums) {
        int red = 0;
        int white = 0;
        int blue = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]==0){
                red++;
            }else if(nums[i]==1){
                white++;
            }else { 
                blue++;
            }
        }
        int j = 0;
        for (int i=0; i<red; i++, j++){
            nums[j]=0;
        }
        for (int i=0; i<white; i++, j++){
            nums[j]=1;
        }
        for (int i=0; i<blue; i++, j++){
            nums[j]=2;
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
}



