# Java
用来上传尚硅谷所学的代码
..
 /*  设一个数字为123456,使用java打出个位数到万位数*/
        int num_1=123456;
        int a_1=num_1%10;
        int a_2=num_1/10%10;
        int a_3=num_1/100%10;
        int a_4=num_1/1000%10;
        int a_5=num_1/10000%10;
        int a_6=num_1/100000%10;
        System.out.println("个位数是:"+a_1);
        System.out.println("十位数是:"+a_2);
        System.out.println("百位数是:"+a_3);
        System.out.println("千位数是:"+a_4);
        System.out.println("万位数是:"+a_5);
        System.out.println("万位数是:"+a_6);
