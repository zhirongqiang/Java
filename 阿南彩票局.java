import java.util.Scanner;
public class zRq04 {
    public static void main(String[] args){
        int suIji = (int)(Math.random()*90+10);


        Scanner input =new Scanner(System.in);
        System.out.print("现在请你输入任意2位数字:");
        int num1 =input.nextInt();
        input.close();
        // 处理数字
        int suIjiShi = suIji/10;
        int suIjiGe = suIji%10;
        int num1Shi = num1/10;
        int num1Ge = num1%10;

        // 判断
        if (num1 ==suIji){
            System.out.println("阿南给人家10000美金");
        }else if( suIjiShi ==num1Ge && suIjiGe ==num1Shi){
            System.out.println("阿南给人家3000刀");
        }else if (suIjiGe ==num1Ge || suIjiShi ==num1Shi){
            System.out.println("阿南给人家1000刀");
        }else if (suIjiGe==num1Shi || suIjiShi ==num1Ge){
            System.out.println("阿南给人家500刀");
        }else {
            System.out.println("哦豁，输光了，都被阿南赚了");
        }
        System.out.println("本次号码"+suIji);
    }
}
//阿南彩票局----程序随机地产生一个两位数的彩票，提示用户输入一个两位数，然后按照下面的规则判定用户是否能赢。
//
//        1)如果用户输入的数匹配彩票的实际顺序，奖金10 000美元。
//
//        2)如果用户输入的所有数字匹配彩票的所有数字，但顺序不一致，奖金 3 000美元。
//
//        3)如果用户输入的一个数字仅满足顺序情况下匹配彩票的一个数字，奖金1 000美元。
//
//        4)如果用户输入的一个数字仅满足非顺序情况下匹配彩票的一个数字，奖金500美元。
//
//        5)如果用户输入的数字没有匹配任何一个数字，则彩票作废。
