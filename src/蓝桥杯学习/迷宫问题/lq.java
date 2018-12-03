package 蓝桥杯学习.迷宫问题;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//采用的是深度优先遍历问题，其实采用BFS最好，对于求最小问题，采用BFS或者DFS+min的方式
public class lq {
        //行号
        static int row ;
        //列号
        static int col ;
        public static void main(String[] args) throws FileNotFoundException {


            Scanner input = new Scanner(System.in);
            //分割字符串，得到即将输入二维数组的行和列
            //" +"是一个正则表达式，代表安装一个以上的空格进行分割
            String[] ss = input.nextLine().trim().split(" +");
            row = Integer.parseInt(ss[0]);
            col = Integer.parseInt(ss[1]);;



            char[][] data = new char[row][col];
            for(int i=0;i<row;i++){
                data[i] = input.next().toCharArray();
            }



            System.out.println(min_path(data,0,0));

        }

        public static int min_path(char[][] data,int x,int y){
            //当走到最后一个位置 右下角的时候
            //根据题目规定 我们是从 0,0出发的
            //假设 终点是 0,1  那么走到终点应该返回一个0
            //代表只走一步就到达了终点
            //可以理解成： 从 0，0 走到 0,0 只需要 0 步
            if(x==row-1&&y==col-1){
                return 0;
            }

            //走到该位置 加上标记防止 往回走
            data[x][y] = '*';

            //现在走到终点的最小步数   初始值为Integer最大值 (-10 是为了 防止在+1后溢出)
            int min = Integer.MAX_VALUE-10;

            //尝试向上走需要多少步。
            if (x > 0 && data[x-1][y]=='.') {
                //判断该向上走需要的步数是否是最小步数
                min = Math.min(min, 1 + min_path(data, x - 1, y));
            }

            //向下
            if (x < row-1 && data[x+1][y]=='.') {
                min = Math.min(min, 1 + min_path(data, x + 1, y));
            }

            //向左
            if (y > 0 && data[x][y-1]=='.'){
                min = Math.min(min, 1 + min_path(data, x, y - 1));
            }

            //向右
            if (y < col-1 && data[x][y+1]=='.') {
                min = Math.min(min, 1 + min_path(data, x, y + 1));
            }


            //回溯在递归测试完毕找到所有最短路径后
            //将该位置复原 (既然可以走到该位置，该位置肯定是.)
            data[x][y] = '.';

            //如果，四个方向都没有走通，那么min还是初始值 Integer的最小值
            //代表该位置作废 走不通
            return min;
        }




}
