import java.util.*;

public class LanQiao_31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
         List nums1 = new ArrayList();
         List nums2 = new ArrayList();
        for (int i = 0; i < N ; i++) {
            nums1.add(sc.nextInt());
        }
        for (int i = 0; i < N ; i++) {
            nums2.add(sc.nextInt());
        }
        nums1.addAll(nums2);
        Collections.sort(nums1);
        System.out.println(nums1.get((N*2-1)/2));
    }
}
