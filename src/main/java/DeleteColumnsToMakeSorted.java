import java.util.Arrays;
import java.util.stream.Stream;

class DeleteColumnsToMakeSorted {
    public int minDeletionSize(String[] strs){
        int count=0;
        String sortedStrs;
        for (int i=0;i< strs.length;i++){
             sortedStrs= Arrays.toString(strs[i]).replace('[',"");
            System.out.println(sortedStrs);
           /* if (strs[i].equals(sortedStrs)) {
                count++;
            }*/
        }

    return count;
    }
}