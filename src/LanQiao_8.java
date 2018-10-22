
import java.util.*;

public class LanQiao_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int L=sc.nextInt();
        int H=sc.nextInt();
        student[] student =new student[t];
        for (int i = 0; i < t; i++) {//t.fori
            int number=sc.nextInt();
            int de=sc.nextInt();
            int cai=sc.nextInt();
            student[i]=new student(number,de,cai);
        }
        //为什么这里不适用数组，而是用ArrayList得清楚
        List<student> c1 = new ArrayList<student>();//德才全
        List<student> c2 = new ArrayList<student>();//德胜
        List<student> c3 = new ArrayList<student>();//德才亡
        List<student> c4 = new ArrayList<student>();//其他

        int sum=0;
        //分类
        for (int i = 0, len =student.length; i < len; i++) {
//            sum=student[i].de+student[i].cai;
            if (student[i].de >= H && student[i].cai >= H) {
                c1.add(student[i]);
                continue;
            } else if (student[i].de >= H && student[i].cai < H && student[i].cai >= L) {
                c2.add(student[i]);
                continue;
            } else if (student[i].de < H && student[i].cai < H&& student[i].de>= student[i].cai && student[i].de >= L && student[i].cai >= L) {
                c3.add(student[i]);
                continue;
            } else if (student[i].de >= L && student[i].cai >= L) {
                c4.add(student[i]);
                continue;
            } else {
                continue;
            }
        }

        //为什么比较器要单独拿出来要清楚,这里要对每一种分类的情况做处理
        Comparator<student> comp=new Comparator<student>(){
            //当int 返回-1 代表顺序翻转，返回1 代表不翻转
            //注意在构建比较器时，一定包括< , > ，==这三种情况的分别处理
            public int compare(student arg0, student arg1) {
                if (arg0.de + arg0.cai > arg1.de + arg1.cai) {
                    return -1;
                } else if (arg0.de + arg0.cai < arg1.de + arg1.cai) {
                    return 1;
                } else {
                    //德才总分相同,德分也并列
                    if(arg0.de==arg1.de){
                        if(arg0.number>arg1.number){
                            return 1;
                        }else{
                            return -1;
                        }

                    }else if(arg0.de>arg1.de){//总分相同时，按其德分降序排列
                            return -1;
                    }else{
                            return 1;
                    }


                }

             }
            };
        //排序
        Collections.sort(c1,comp);
        Collections.sort(c2,comp);
        Collections.sort(c3,comp);
        Collections.sort(c4,comp);

        //输出
        System.out.println(c1.size()+c2.size()+c3.size()+c4.size());
        for (int i = 0,len=c1.size(); i <len ; i++) {
            System.out.println(c1.get(i).number+" "+c1.get(i).de+" "+c1.get(i).cai );
        }
        for (int i = 0 ,len=c2.size(); i <len ; i++) {
            System.out.println(c2.get(i).number+" "+c2.get(i).de+" "+c2.get(i).cai );
        }
        for (int i = 0,len =c3.size(); i <len ; i++) {
            System.out.println(c3.get(i).number+" "+c3.get(i).de+" "+c3.get(i).cai );
        }
        for (int i = 0,len =c4.size(); i <len ; i++) {
            System.out.println(c4.get(i).number+" "+c4.get(i).de+" "+c4.get(i).cai );
        }
      /*  测试分类是否满足要求
      for (int i = 0; i <c1.size() ; i++) {
             System.out.println(c1.get(i).number+" "+c1.get(i).de+" "+c1.get(i).cai + "c1");
        }
        for (int i = 0; i <c2.size() ; i++) {
            System.out.println(c2.get(i).number+" "+c2.get(i).de+" "+c2.get(i).cai + "c2");
        }
        for (int i = 0; i <c3.size() ; i++) {
            System.out.println(c3.get(i).number+" "+c3.get(i).de+" "+c3.get(i).cai + "c3");
        }
        for (int i = 0; i <c4.size() ; i++) {
            System.out.println(c4.get(i).number+" "+c4.get(i).de+" "+c4.get(i).cai + "c4");
        }
*/


        /*for (int i = 0; i < student.length; i++) {
           System.out.println(student[i].number);
        }*/


    }
    static class student
    {
        int number;
        int de;
        int cai;
        public student(int number,int de,int cai)
        {
            this.number=number;
            this.de=de;
            this.cai=cai;
        }


    }

}
