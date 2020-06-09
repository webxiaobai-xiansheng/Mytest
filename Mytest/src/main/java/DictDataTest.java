import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Date:2020/6/9
 * Author:di.xu
 * Desc:
 */

public class DictDataTest {
    public static void main(String[] args) {
        //1.确定一串英文字符串
     String s="ilikesamsungmobile";
     //2.自定义字典
        HashSet<String> dictData = new HashSet<String>();
        dictData.add("i");
        dictData.add("like");
        dictData.add("sam");
        dictData.add("sung");
        dictData.add("samsung");
        dictData.add("mobile");
        dictData.add("ice");
        dictData.add("cream");
        dictData.add("man");
        dictData.add("go");
        //输出结果

        System.out.println(new DictDataTest().DictTest(s,dictData));

    }

    private boolean DictTest(String s, HashSet<String> dict) {
      int len=s.length();
        boolean[] dp = new boolean[len + 1];
        dp[0]=true;
        for (int i=1;i<=len;i++){
            for (int j=0;j<i;j++){
                if (dp[j] && dict.contains(s.substring(j,i))){
                    dp[i]=true;
                    break;
                }
            }
        }

        return dp[len];
    }

}
