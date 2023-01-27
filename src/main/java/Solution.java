import java.util.ArrayList;
import java.util.List;

class Solution {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<String> mergedTwoLists=new ArrayList<>();

        try {
        int[] numbers1= Integer.toString(list1.val).chars().map(c->c-'0').toArray();
        int[] numbers2= Integer.toString(list2.val).chars().map(c->c-'0').toArray();

            for (int i = 0; i < Math.max(numbers1.length,numbers2.length); i++) {
                mergedTwoLists.add(String.valueOf(Math.min(numbers1[i], numbers2[i])));
                mergedTwoLists.add(String.valueOf(Math.max(numbers1[i], numbers2[i])));
            }
            }
        catch (Exception ignored){
        }
        String listString = "";

        for (String s : mergedTwoLists)
        {
            listString += s + "";
        }
            return new ListNode(Integer.parseInt(listString));
        }
    }