package Pattern;

public class HollowRect {
    public static void main(String[] args) {
        int r = 4, n= 5;
        for(int i =1; i<=r; i++){
            for(int j= 1; j<=n; j++){
                if(i == 1 ||i == r || j==1 || j==n ){
                  System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
