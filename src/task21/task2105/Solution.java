package task21.task2105;

import java.util.HashSet;
import java.util.Set;

/*
Исправить ошибку. Сравнение объектов
*/
public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

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
        int resFirst = first != null ? first.hashCode() : 0;
        int resLast = last != null ? last.hashCode() : 0;
        int res =  31 * resFirst + resLast;
        return res;
    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Mickey", "Mouse"));
        System.out.println(s.contains(new Solution("Mickey", "Mouse")));
    }
}
