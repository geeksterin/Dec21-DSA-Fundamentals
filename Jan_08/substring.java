public class substring {
    //TC: O(N*N)
    //SC : O(1)
    public static void main(String[] args) {
        String str = "abcd";

        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                int k = i;
                while(k<=j){
                    System.out.print(str.charAt(k));
                    k++;
                }
                System.out.println();
            }
        }
        // ""
        // "a"
        // "b"
        // "c"
        // "ab"
        // "ac"
        // "bc"
        // "abc"

    }
}
