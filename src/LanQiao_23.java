import java.util.*;

public class LanQiao_23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N= sc.nextInt();
        person[] people=new person[N];
        for (int i = 0; i < N; i++) {
            String name = sc.next();
            String birth = sc.next();
            String phone = sc.next();
            people[i] = new person(name, birth, phone);
        }
        List list= Arrays.asList(people);

        /**
         *  注意如果不在pojo类上定义比较方法，那么使用Comparator
         *  而不是Comparable
         */

        Comparator<person> comp=new Comparator<person>() {
            public int compare(person p1,person p2) {
                return Integer.parseInt(p1.birth)>Integer.parseInt(p2.birth)?1:-1;
            }
        };
        Collections.sort(list,comp);
        for (Object o : list) {
            person p=(person) o;
            System.out.println(p.name+" "+p.birth+" "+p.phone);
        }

    }
    static class person {
        String name ;
        String birth;
        String phone;
        public person(String name, String birth, String phone) {
            this.name = name;
            this.birth = birth;
            this.phone = phone;
        }

    }
}
