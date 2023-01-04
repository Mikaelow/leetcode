import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class DeleteColumnsToMakeSorted {
    public int minDeletionSize(String[] strs){
        int count=0,size= strs.length;
        List<String> sortedStrs = new ArrayList<>();


        while(count<strs.length) {
            Arrays.stream(strs[count].split("")).sorted().forEach(sortedStrs::add);
            String sortedSt=sortedStrs.toString();
            StringBuilder reversedSorted= new StringBuilder();

            sortedSt=sortedSt.replace("[","");
            sortedSt=sortedSt.replace(",","");
            sortedSt=sortedSt.replace("]","");
            sortedSt=sortedSt.replace(" ","");

            String[] reserve=sortedSt.split("");
            for (int i=sortedSt.length();i>0;i--)
                reversedSorted.append(reserve[i-1]);
            System.out.println(reversedSorted);
           // ------------------------------------------------------------------------------------------
            if (strs[count].equals(sortedSt)
                    ||
                    strs[count].equals(reversedSorted.toString()))
                size--;
            count++;
            sortedStrs=new ArrayList<>();
        }

    return size;
    }
}