import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'arrayManipulation' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */
    /*public static int sortk(List<List<Integer>> L){
        int n = L.size();
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                if( (L.get(j)).get(2) > (L.get(j+1)).get(2) ){ 
                    List s = L.get(j);
                    L.set(j, L.get(j+1));
                    L.set(j+1, s);
                }
                if( (L.get(j)).get(2) == (L.get(j+1)).get(2) ){
                    if(((L.get(j)).get(1)-(L.get(j)).get(0)) < ((L.get(j+1)).get(2)-(L.get(j+1)).get(2))){
                        List s = L.get(j);
                        L.set(j, L.get(j+1));
                        L.set(j+1, s);
                    }
                }
            }
        }
        return 0;
    }*/
    
    public static long arrayManipulation(int n, List<List<Integer>> L) {
    // Write your code here
        //sortk(queries);
        int m = L.size();
        
        
        //SORTING THE LIST ACCORDING TO 'K' IN DESCENDING ORDER
        for(int i = 0; i < m-1; i++){
            for(int j = 0; j < m-i-1; j++){
                int k1 = (L.get(j)).get(2);
                int k2 = (L.get(j+1)).get(2);
                if( k1 > k2 ){ 
                    List s = L.get(j);
                    L.set(j, L.get(j+1));
                    L.set(j+1, s);
                }
            }
        }
        
        
        int a, b, k;
        int l = (L.get(0)).get(0);
        int h = (L.get(0)).get(1);
        long max = (L.get(0)).get(2);
        
        
        for(int i = 1; i < m; i++){
            a = (L.get(i)).get(0);
            b = (L.get(i)).get(1);
            k = (L.get(i)).get(2);
            if((l>=a && l<=b) || (h>=a && h<=b)){ //{a,l,b} //{a,h,b}
                max = max + k;
                if((l>=a && l<=b) && (h>b)){    //{a,b,h}
                    h = b;
                }
                // if(l<a){    //{l,a,b}
                //     l = a;
                // }
            }
        }
        return max;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, m).forEach(i -> {
            try {
                queries.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        long result = Result.arrayManipulation(n, queries);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
