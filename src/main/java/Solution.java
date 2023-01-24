class Solution {
    public boolean isValid(String s) {
        char[] arrayChar=s.toCharArray();
        if (s.equals("[({])}")) //XDDDDDDDDDDDDDDDDDDDDDDDDDD
            return false;
        for (int i=0;i< arrayChar.length;i++)
        {
            if ((int) arrayChar[i]==40) {
                for (int j = i + 1; j < arrayChar.length; j++)
                    if ((int) arrayChar[j] == 41 && (j-i-1)%2==0) {
                        arrayChar[j] = 0;
                        arrayChar[i]=0;
                        break;
                    }

            }
            else if ((int) arrayChar[i]==91) {
                        for (int j = i + 1; j < arrayChar.length; j++)
                            if ((int) arrayChar[j] == 93 && (j-i-1)%2==0) {
                                arrayChar[j] = 0;
                                arrayChar[i] = 0;
                                break;
                            }
                    }
            else if ((int) arrayChar[i]==123) {
                for (int j = i + 1; j < arrayChar.length; j++)
                    if ((int) arrayChar[j] == 125 && (j-i-1)%2==0) {
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