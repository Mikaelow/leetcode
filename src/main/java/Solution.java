class Solution {
    public boolean isValid(String s) {
        char[] arrayChar=s.toCharArray();
        for (int i=0;i< arrayChar.length;i++)
        {
            if ((int) arrayChar[i]==40) {
                for (int j = i + 1; j < arrayChar.length; j++)
                    if ((int) arrayChar[j] == 41) {
                        arrayChar[j] = 0;
                        arrayChar[i]=0;
                        break;
                    }
            }
            else if ((int) arrayChar[i]==91) {
                        for (int j = i + 1; j < arrayChar.length; j++)
                            if ((int) arrayChar[j] == 93) {
                                arrayChar[j] = 0;
                                arrayChar[i] = 0;
                                break;
                            }
                    }
            else if ((int) arrayChar[i]==123) {
                for (int j = i + 1; j < arrayChar.length; j++)
                    if ((int) arrayChar[j] == 125) {
                        arrayChar[j] = 0;
                        arrayChar[i] = 0;
                        break;
                    }
            }
        }
        for (int i=0;i< arrayChar.length;i++)
            if (arrayChar[i]!=0)
                return false;
        return true;
    }
}