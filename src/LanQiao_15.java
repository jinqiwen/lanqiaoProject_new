import java.util.*;

public class LanQiao_15 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < nums.length; i++) {
            s.append(String.valueOf(nums[i]));
        }
        char[] c = s.toString().toCharArray();
        Map map = new HashMap<Integer, Integer>();
       /*
       这里是计划求数组中重复元素的个数，
       思路是char[] 转set , for i 为set.size(), for j 为char[]长度，然后组成二层循环
       通过比较的方式：c[i] == c[j]来计算元素重复的次数
       map.get(c[i]) == null判断原map中是否有c[i]--->但map方法用错了，最好使用map.containsKey(c[i])
       Object[] cu=unique(c);
       System.out.println(cu);
      Set<String> staffsSet = new HashSet<String>(Arrays.asList(c));
        for (Object o : staffsSet) {
          System.out.println(o);
        }
      for (int i = 0; i < cu.length; i++) {
            for (int j = i+1;j < c.length; j++) {
                if (c[i] == c[j]) {
                    if (map.get(c[i]) == null) {
                        map.put(c[i], 2);
                    } else {
                        map.put(c[i], (int) map.get(c[i]) + 1);
                    }
                }
            }
        }*/
      /*  for (int i = 0;i < c.length; i++){
            if (!map.containsKey(c[i]))
                map.put(c[i], 1);
            else
                map.put(c[i], (int)map.get(c[i])+1);
        }*/
        map=getSubStr(c,map);

       /* for (int i = 0; i < ; i++) {
            map.get()
        }*/
        //寻找最大次数和对应的数字字符
        //算法注意：求什么最大值，必先排序，也就是最值问题是排序问题的延续
        //下面的求map中value的最大值以及对应的key算法比较繁琐，不简洁，所以使用优化算法
        /*int maxValue = -1000000;
        List<Character> list = new ArrayList<>();
        for (Object key : map.keySet()) {
            if ((int) map.get(key) > maxValue) {
                maxValue = (int) map.get(key);
                list.add((Character) key);
            } else if ((int) map.get(key) == maxValue) {
                list.add((Character) key);
            } else {
                continue;
            }
        }*/
        int max= (int) getMaxValue(map);
        List<Object> list =getKeys(map,max);
        System.out.print(max + ":");
        for (Object o : list) {
             System.out.print(" "+o);
        }

    }
    /**
     * String类操作：统计字符出现的个数
     */
    static Map getSubStr(char[] c,Map map){
        for (int i = 0;i < c.length; i++){
            if (!map.containsKey(c[i]))
                map.put(c[i], 1);
            else
                map.put(c[i], (int)map.get(c[i])+1);
        }
        return map;
    }
    /**
     * 去除数组中重复的元素
     * @param arr
     * @return
     */
    public static Object[] unique(char[] arr){
        //实例化一个set集合
        Set set = new HashSet();
        //遍历数组并存入集合,如果元素已存在则不会重复存入
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        //返回Set集合的数组形式
        return set.toArray();
    }

    /**
     * 求map<K><V>中Value的最大值
     *  定义返回类型为object是为了增强使用的广泛性
     */

    static Object getMaxValue(Map<Integer,Integer> map){
        Collection<Integer> collection=map.values();
        Object[] obj=collection.toArray();
        Arrays.sort(obj);//默认是升序排列，不管是升序还是降序都不影响我们取最值
        return obj[obj.length-1];
    }
    /**
     * 求map<K><V>中Value对应的key,网上没有考虑到同值不同key的情况，所以我将其改进
     *  定义返回类型为object是为了增强使用的广泛性
     */

    static List<Object> getKeys(Map<Integer,Integer> map,Integer value){
        List<Object> list=new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
              if(value.equals(entry.getValue())){
                  list.add(entry.getKey());
              }
        }
        return list;
    }
}
