class Solution {
    public boolean isValid(String s) {
        char[] arrayChar= s.toCharArray();
        for (int i=0;arrayChar.length>i;i++) {
                try {
                    if ((int) arrayChar[i] == 40) {
                        if ((int) arrayChar[i + 1] != 41)
                            return false;
                        else if ((int) arrayChar[i + 1] == 41)
                            i++;

                    }
                    else if ((int) arrayChar[i] == 91) {
                        if ((int) arrayChar[i + 1] != 93)
                            return false;
                        else if ((int) arrayChar[i + 1] == 93)
                            i++;

                    }
                    else if ((int) arrayChar[i] == 123) {
                        if ((int) arrayChar[i + 1] != 125)
                            return false;
                        else if ((int) arrayChar[i + 1] == 125)
                            i++;
                    }
                }
                catch(Exception e) {
                    return false;
                }
            }

        return true;
    }
}