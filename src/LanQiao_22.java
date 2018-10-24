import java.util.*;

public class LanQiao_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map map = new HashMap<Integer, Integer>();
        for (int i = 0; i < N; i++) {
            int key = sc.nextInt();
            int value = sc.nextInt();
            map.put(value, key);
        }
        int N2 = sc.nextInt();
        Map map2 = new HashMap<Integer, Integer>();
        for (int i = 0; i < N2; i++) {
            int key = sc.nextInt();
            int value = sc.nextInt();
            map2.put(value, key);
        }
        Map<Integer, Integer> mapSum = Sum(map, map2);
        Map<Integer, Integer> mapAcc = Acc(map, map2);
        List<Map.Entry<Integer, Integer>> entrySumList = new ArrayList<Map.Entry<Integer, Integer>>(mapSum.entrySet());
        List<Map.Entry<Integer, Integer>> entryAccList = new ArrayList<Map.Entry<Integer, Integer>>(mapAcc.entrySet());
        Collections.sort(entrySumList, new MapValueComparator());
        Collections.sort(entryAccList, new MapValueComparator());
        int last1 = entrySumList.get(entrySumList.size() - 1).getKey();
        int last2 = entryAccList.get(entryAccList.size() - 1).getKey();
        if (mapSum.size()==0) {
             System.out.print(0+" ");
        } else {
            for (Map.Entry<Integer, Integer> m : entryAccList) {
                System.out.print(m.getValue() + " " + m.getKey());
                System.out.print(m.getKey() == last2 ? "" : " ");
            }
            System.out.println();
        }
        if (mapAcc.size()==0) {
            System.out.print(0);
        } else {
            for (Map.Entry<Integer, Integer> m : entrySumList) {
                System.out.print(m.getValue() + " " + m.getKey());
                System.out.print(m.getKey() == last1 ? "" : " ");
            }
        }

    }

    /**
     * 比較器
     */
    static class MapValueComparator implements Comparator<Map.Entry<Integer, Integer>> {

        @Override
        public int compare(Map.Entry<Integer, Integer> me1, Map.Entry<Integer, Integer> me2) {
            return -me1.getKey().compareTo(me2.getKey());
        }
    }

    /**
     * 求一元多项式的和
     * @param map
     * @param map2
     * @return
     */
    static Map Sum(Map map,Map map2){
        Map mapSum=new HashMap<Integer,Integer>();
        mapSum.putAll(map);
        for (Object k:map.keySet()){
            for (Object k2:map2.keySet()){
                if(!mapSum.containsKey(k2)){
                    mapSum.put(k2,map2.get(k2));
                }else if(k==k2){
                    mapSum.put(k,(int)mapSum.get(k)+(int)map2.get(k2));
                }
            }
        }
        return mapSum;
    }

    /**
     * 求一元多项式的乘积
     * @param map
     * @param map2
     * @return
     */
    static Map Acc(Map map,Map map2){
        int key=0;
        int value=0;
        Map mapAcc=new HashMap<Integer,Integer>();
        for (Object k:map.keySet()){
            for (Object k2:map2.keySet()){
                key = (int)k+(int)k2;
                int v1=(int)map.get(k);
                int v2=(int)map2.get(k2);
                value=v1*v2;
                if(!mapAcc.containsKey(key)){
                    mapAcc.put(key,value);
                }else{
                    mapAcc.put(key,(int)mapAcc.get(key)+value);
                }

            }
        }
        return mapAcc;
    }
}
