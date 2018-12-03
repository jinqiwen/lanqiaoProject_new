import java.util.HashSet;
import java.util.Set;
public class SetShiyan {
    public static void main(String[] args) {
        /*
         * 初始化两个HashSet
         */
        Set<String> hashSet1 = new HashSet<>();
        Set<String> hashSet2 = new HashSet<>();
        /*
         * 创建连个字符串数组，用于储存两个HashSet中元素
         */
        String[] s1 = {"George" , "Jim" , "John" , "Blake" , "Kevin" , "Mechael"};
        String[] s2 = {"George" , "Katie" , "Ryan" ,  "Kevin" , "Mechael"};
        /*
         * 使用ForEach循环向Hash中添加元素
         * 避免一行一行添加造成代码不美观
         */
        for(String s : s1){
            hashSet1.add(s);
        }
        for(String s : s2){
            hashSet2.add(s);
        }
        /*
         * 调用DealSet累中个方法进行计算
         */
        DealSet<String> ds = new DealSet<String>();
        System.out.println("Union Set is "+ds.Union(hashSet1, hashSet2));
        System.out.println("Different Set is " + ds.differentSet(hashSet1, hashSet2));
        System.out.println("Same Set is " + ds.sameSet(hashSet1, hashSet2));


    }

    public static class DealSet<T> {

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
}