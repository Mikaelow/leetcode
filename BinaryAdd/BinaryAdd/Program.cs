using System;
using System.Runtime.Versioning;

public class Solution
{
    private static string MakeSameLength(string longerStr, string shorterStr)
    {
        int lenLonger = longerStr.Length;
        int lenShorter = shorterStr.Length;
        int diffLen = lenLonger - lenShorter;
        string resoult = "";
        for (int i = 0; i < diffLen; i++)
        {
            resoult += "0";
        }
        return resoult + shorterStr;
    }

    public string AddBinary(string a, string b)
    {

        if (a.Length > b.Length) b = MakeSameLength(a, b);
        else a = MakeSameLength(b, a);

        string resoult = "";
        bool memory = false;
        for (int i = a.Length-1; i >= 0; i--)
        {
            if (a[i] == '1' && b[i] == '1')
                if (memory)
                {
                    resoult += "1";
                    memory = true;
                }
                else
                {
                    resoult += "0";
                    memory = true;
                }
            else if (a[i] == '0' && b[i] == '0')
                if (memory)
                {
                    resoult += "1";
                    memory = false;
                }
                else
                    resoult += "0";

            else
                if (memory)
            {
                resoult += "0";
                memory = true;
            }
            else
                resoult += "1";
        }
        if (memory)
            resoult += "1";
        string resoultReverse = "";
        for (int i = resoult.Length-1; i >= 0; i--)
            resoultReverse += resoult[i];
        return resoultReverse;
    }
}

class Program
{
    static void Main(string[] args)
    {
        Solution solution = new Solution();
        string result = solution.AddBinary("11", "1");
        Console.WriteLine($"Result: {result}");
    }
}