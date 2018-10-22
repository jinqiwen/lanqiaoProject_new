import java.util.*;

public class LanQiao_15 {
    public static void main(String[] args) {
        /*Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();*/

        int[] nums = new int[3];
        nums[0] = 1134;
        nums[1] = 1315;
        nums[2] = 3456;
       /* for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }*/
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < nums.length; i++) {
            s.append(String.valueOf(nums[i]));
        }
        char m;
        char[] c = s.toString().toCharArray();
        Map map = new HashMap<Integer, Integer>();
        List<char[]> list1=Arrays.asList(c);

      /*  Set<String> staffsSet = new HashSet<String>(Arrays.asList(c));*/
      /*  for (Object o : staffsSet) {
          System.out.println(o);
        }*/
       /* for (int i = 0; i < staffsSet.size(); i++) {
            for (int j = i + 1; j < c.length; j++) {
                if (c[i] == c[j]) {
                    if (map.get(c[i]) == null) {
                        map.put(c[i], 1);
                    } else {
                        map.put(c[i], (int) map.get(c[i]) + 1);
                    }
                }
            }
        }*/
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
     * 去除数组中
     * @param arr
     * @return
     */
    public static Object[] unique(Object [] arr){
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
