package Array;

import java.util.HashSet;
import java.util.Set;

public class UnionArray {
    public static void main(String[] args) {
        int[] a = {1,4,2,7,2,4,8,7};
        int[] b = {2,4,3,2,4};
        Set<Integer> set = new HashSet<>();
        for(int e: a){
            set.add(e);
        }
        for(int e: b){
            set.add(e);
        }
        System.out.println(set);
    }
}
