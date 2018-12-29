package task21.task2104;

import java.util.HashSet;
import java.util.Set;

/*
Equals and HashCode
*/
public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }


    //Метод equals должен проверять является ли переданный объект объектом класса Solution
    @Override
    public boolean equals(Object obj) {
        if(obj == null)
            return false;

        if(!(obj instanceof Solution))
            return false;

        if(this == obj)
            return true;

        Solution solution = (Solution) obj;
        if(this.first != null ? !this.first.equals(solution.first) == true : solution.first != null)
            return false;
        if(this.last != null ? !this.last.equals(solution.last) == true : solution.last != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int resFirst = this.first != null ? this.first.hashCode() : 0;
        int resLast = this.last != null ? this.last.hashCode() : 0;
        int res =  31 * resFirst + resLast;
        return res;
    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Donald", "Duck"));
        s.add(new Solution("Donald", null));
        s.add(new Solution(null, null));
        System.out.println(s.contains(new Solution("Donald", "Duck")));
        System.out.println(s.contains(new Solution("Donald", null)));
        System.out.println(s.contains(new Solution(null, null)));
        System.out.println(s.size());
    }
}
