package Loops;

public class ConditionalsLoopTask {
    public static String twelveDaysOfChristmas(int day)
    {
        switch(day)
        {
            case 1: return "A partridge in a pear tree";
            case 2: return "Two turtle doves";
            case 3: return "Three French hens";
            case 4: return "Four calling birds";
            case 5: return "Five golden rings";
            case 6: return "Six geese a-laying";
            case 7: return "Seven swans a-swimming";
            case 8: return "Eight maids a-milking";
            case 9: return "Nine ladies dancing";
            case 10: return "Ten lords a-leaping";
            case 11: return "Eleven pipers piping";
            case 12: return "Twelve drummers drumming";
            default: return "Number is out of range. Input a number between 1 and 12";
        }
    }
}
