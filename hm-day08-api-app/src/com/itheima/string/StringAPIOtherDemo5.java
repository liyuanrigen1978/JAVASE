package com.itheima.string;

import org.junit.Test;

/**
    目标：掌握String常用的其他API。
 */
public class StringAPIOtherDemo5 {


    @Test
    public void StringTest(){
        String testName = "这是我的测试";

        //public int length()                       返回此字符串的长度
        System.out.println(testName.length());

        //public char charAt(int index)             获取某个索引位置处的字符
        char charAt = testName.charAt(2);
        System.out.println(charAt);
        System.out.println("-----------------------------");

        //public char[] toCharArray()：              将当前字符串转换成字符数组返回
        char[] chars = testName.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }


        //public String substring(int beginIndex, int endIndex) 根据开始和结束索引进行截取，得到新的字符串（包前不包后）
        System.out.println(testName.substring(0, 4));

        //public String substring(int beginIndex)   从传入的索引处截取，截取到末尾，得到新的字符串
        System.out.println(testName.substring(2));

        //public String replace(CharSequence target,CharSequence replacement)使用新值，将字符串中的旧值替换，得到新的字符串
        System.out.println(testName.replace("我的", "#"));

        //public String[] split(String regex)           根据传入的规则切割字符串，得到字符串数组返回


    }




    public static void main(String[] args) {
        // 1、public int length(): 获取字符串的长度

        String name = "我爱你中国love";
        System.out.println(name.length());

        // 2、public char charAt(int index): 获取某个索引位置处的字符
        char c = name.charAt(1);
        System.out.println(c);

        System.out.println("------------遍历字符串中的每个字符--------------");
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            System.out.println(ch);
        }
        // 3、public char[] toCharArray()：: 把字符串转换成字符数组
        char[] chars = name.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            System.out.println(ch);
        }

        // 4、public String substring(int beginIndex, int endIndex) ：截取内容，(包前不包后的)
        String name2 = "Java是最厉害的编程语言！";
        //              01234567   89
        String rs = name2.substring(0, 9);
        System.out.println(rs);
        String rs1 = name2.substring(4, 9);
        System.out.println(rs1);

        // 5、public String substring(int beginIndex):从当前索引一直截取到末尾
        String rs2 = name2.substring(4);
        System.out.println(rs2);

        // 6、public String replace(CharSequence target, CharSequence replacement)
        String name3 = "金三胖是最厉害的80后，金三胖棒棒的！我好爱金三胖";
        String rs3 = name3.replace("金三胖", "***");
        System.out.println(rs3);

        // 7、public boolean contains(CharSequence s)
        System.out.println(name3.contains("金三胖")); // true
        System.out.println(name3.contains("金二胖")); // false

        // 8、public boolean startsWith(String prefix)
        System.out.println(name3.startsWith("金三胖"));
        System.out.println(name3.startsWith("金三胖是最厉害的"));
        System.out.println(name3.startsWith("金三胖是最厉害的2"));

        // 9、public String[] split(String s): 按照某个内容把字符串分割成字符串数组返回。
        String name4 = "王宝强,贾乃亮,陈羽凡";
        String[] names = name4.split(",");
        for (int i = 0; i < names.length; i++) {
            System.out.println("选择了：" + names[i]);
        }
    }
}
