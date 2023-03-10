import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author fgh
 * @create 2023- 02-22 11:04
 */
public class exercise2 {
    public void main(String arg[]){

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Pair[] arr = new Pair[n];
        for ( int i = 0; i < n; i++ ) {
            int x = in.nextInt();
            int y = in.nextInt();
            arr[i] = new Pair(x, y);
        }

        Arrays.sort(arr);
        List<Pair> res = new ArrayList<>();
        res.add(arr[n-1]);
        int maxY = arr[n-1].y;
        for ( int i = n-2; i >= 0; i-- ) {
            if( arr[i].y >= maxY ){
                res.add(arr[i]);
                maxY =arr[i].y;
            }
        }

        res.forEach((Pair o)->System.out.println(o.x + " " + o.y));
        in.close();
    }
    class Pair implements Comparable<Pair>{
        int x;
        int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Pair o) {
            return x==o.x ? o.y - y : x - o.x ; //X升序Y降序
        }
    }

}
