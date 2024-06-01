import java.util.Scanner;
public class zRq03 {
    public static void main(String[] args){
        // 关于押宝游戏---随机产生3个1-6的整数，如果三个数相等，那么称为“豹子”，如果三个数之和大于9，称为“大”，如果三个数之和小于等于9，称为“小”，用户从键盘输入押的是“豹子”、“大”、“小”，并判断是否猜对了
        // 1.首先来到第一步随机生成3个1-6的整数
        int a =(int)(Math.random()*6+1);
        int d =(int)(Math.random()*6+1);
        int c =(int)(Math.random()*6+1);
        // 2.押宝
        Scanner input =new Scanner(System.in);
        System.out.print("请押宝(豹子、大、小):");
        String ya = input.next();
        input.close();
        // 3.判断结果
        boolean result =false;
        //switch支持String类型
        switch(ya) {
            case "豹子":result= a==d && d==c; break;
            case "大": result =a+d+c>9;break;
            case "小": result =a+d+c<9;break;
            default:
                System.out.println("输入有误!");
        }
        System.out.println("a,b,c分别是："+a+","+d+","+c+".");
        System.out.println(result ? "猜中了":"猜错了");
    }
}
