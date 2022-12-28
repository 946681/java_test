public class Demo {
    public static void main(String[] args) {
        String[] strings = new String[10];
        strings[0] = "1";
        strings[1] = "2";
        strings[2] = "3";
        strings[3] = "4";
        strings[4] = "5";

        for (String s : strings) {
            System.out.print(s + " ");
            for (String t : strings) {
                if (s == "3") {
                    System.out.println("执行break语句");//跳出最里层循环，继续执行该循环下的其他语句
                    break;                            //最里层的fou循环中止
                }
            }
        }
        System.out.println("for循环执行结束");
        System.out.println("*****************************************");

        int b=0;
        while (createdata(b)) {
            for (String s : strings) {
                if (s == "3") {
                    System.out.println("执行continue语句");
                    continue;
                } else {
                    System.out.print(s + " ");
                }
            }
            b++;
            if(b==1) {
                System.out.println("此时b="+b);
                continue;
            }
        }

    }
    public static Boolean createdata(int b){
        System.out.println("正在判断");
        if(b>=2){
            System.out.println("关闭");
            return false;
        }else {
            return true;
        }
    }
}
