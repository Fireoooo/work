/**
 * @author fgh
 * @create 2023- 02-22 10:59
 */

import java.util.ArrayList;
import java.util.Scanner;
//1.
//        编程题1
//        P为给定的二维平面整数点集。定义 P 中某点x，如果x满足 P 中任意点都不在 x 的右上方区域内（横纵坐标都大于x），则称其为“最大的”。求出所有“最大的”点的集合。（所有点的横坐标和纵坐标都不重复, 坐标轴范围在[0, 1e9) 内）
//
//        如下图：实心点为满足条件的点的集合。请实现代码找到集合 P 中的所有 ”最大“ 点的集合并输出。
public class exercise1 {
    public static void main(String arg[]){
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int n=in.nextInt();
        Integer [][]arr=new Integer[n][2];
        for(int i=0; i<n; i++){
            int a=in.nextInt();
            int b=in.nextInt();
            arr[i][0]=a;
            arr[i][1]=b;
        }

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j][0]>arr[j+1][0]){
                    int x;
                    int y;
                    x=arr[j][0];
                    arr[j][0]=arr[j+1][0];
                    arr[j+1][0]=x;
                    y=arr[j][1];
                    arr[j][1]=arr[j+1][1];
                    arr[j+1][1]=y;
                }
            }
        }
        ArrayList[][] aew=new ArrayList[1][];
        int max=arr[n-1][1];
        for(int i=n-2; i>=0;i--){
            if(arr[i][1]>=max) {
                max = arr[i][1];
                System.out.println(arr[i][0]+" "+arr[i][1]);

            }
        }
//        for(int j=0; j<n;j++){
//            for(int z=1; z<n-j;z++){
//                if(arr[j][1] <= arr[j+z][1]){
//                    break;
//                }
//                else if(arr[j][1] > arr[j+z][1]){
//                    if(j+z==n-1){
//                    System.out.println(arr[j][0]+" "+arr[j][1]);
//                    }
//                }
//            }
//        }
//        System.out.println(arr[n-1][0]+" "+arr[n-1][1]);

    }
}

