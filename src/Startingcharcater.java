public class Startingcharcater {
    public static void main(String[] args) {
        String[] str={"a","ab","aab","bb","b","c"};
        char str1='a';
        char str2='b';
        char str3='c';
//        for(String c:str)
//        {
//           if(c.charAt(0)==str1)
//           {
//               System.out.println("Elements starting with alphabet A:"+c );
//           } else if (c.charAt(0)==str2) {
//               System.out.println("Elements starting with alphabet B:"+c);
//           } else if (c.charAt(0)==str3) {
//               System.out.println("Elements starting with alphabet C:"+c);
//           }
//        }
        for(int i=0;i<str.length;i++)
        {
            String c=str[i];
            if(c.charAt(0)==str1)
            {
                System.out.println("Elements starting with alphabet A:"+c );
            } else if (c.charAt(0)==str2) {
                System.out.println("Elements starting with alphabet B:"+c);
            } else if (c.charAt(0)==str3) {
                System.out.println("Elements starting with alphabet C:"+c);
            }

        }
    }
}
