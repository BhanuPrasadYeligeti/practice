public class Repeatedwords {
    public static void main(String[] args) {
        String str="bhanuprasadp";
        char[] ch=str.toCharArray();
        for(int i=0;i< ch.length;i++) {
            int count = 1;
            if (ch[i] != 'o') {
                for (int j = i + 1; j < ch.length; j++) {
                    if (ch[i] == ch[j]) {
                        count += 1;
                        ch[j] = 'o';
                    }
                }
                if (count >= 2) {
                    System.out.println(ch[i] + " ->" + count);
                }
            }
        }
    }
}
