class Solution {
    public boolean isPalindrome(int x) {

        String[] array= Integer.toString(x).split("");
        for (int i= array.length-1;i>0;i--){
            if (array[array.length - i-1].equals(array[i]))
            {}
            else
                return false;
        }
        return true;
    }
}