import java.util.HashSet;
import java.util.Set;

public  class DealSet<T> {

    private Set<T> differentSet;
    private Set<T> sameSet;
    private Set<T> unionSet;

    /*
     * union方法计算并集
     */
    public Set<T> Union(Set<T> s1, Set<T> s2) {
        unionSet = new HashSet<T>();
        /*
         * 利用Set的元素不可重复特性往unionSet中添加元素形成并集
         */
        for (T s : s1) {
            unionSet.add(s);
        }
        for (T s : s2) {
            unionSet.add(s);
        }
        return unionSet;
    }


    /*
     * sameSet方法返回交集
     */
    public Set<T> sameSet(Set<T> s1, Set<T> s2) {
        sameSet = new HashSet<T>();
        /*
         * 利用ForEach循环和HashSet中的contains方法判断两个Set中元素是否相交
         * 相交则存入SameSet中
         */
        for (T s : s1) {
            if (s2.contains(s))
                sameSet.add(s);
        }
        return sameSet;
    }


    /*
     * differentSet方法返回差集
     */
    public Set<T> differentSet(Set<T> s1, Set<T> s2) {
        differentSet = new HashSet<T>();
        /*
         * 利用ForEach循环和HashSet中的contains方法判断两个Set中元素是否相交
         * 不相交则存入differentSet中
         */
        for (T s : s1) {
            if (!s2.contains(s))
                differentSet.add(s);
        }
        return differentSet;
    }
}
