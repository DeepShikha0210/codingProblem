import java.util.Scanner;

public class KingWays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(numOfPaths(r,c));

    }

    public static int numOfPaths(int r, int c){

        int[][] dp = new int[r+1][c+1];

        dp[1][1]=1;

        for(int i = 0; i<=r; i++){
            for(int j =0; j<=c; j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for(int i = 0; i<=r; i++){
            for(int j =0; j<=c; j++){
                if(j > 1)
                    dp[i][j] = dp[i][j-1];
                if(i > 1)
                    dp[i][j] = dp[i-1][j];
                if(j > 1 && i > 1)
                    dp[i][j] = dp[i][j-1] + dp[i-1][j] + dp[i-1][j-1];
            }
        }

        System.out.println();

        for(int i = 0; i<=r; i++){
            for(int j =0; j<=c; j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }

        return dp[r][c];
    }
}
