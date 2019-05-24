

public class APCalendar
{
    private static boolean isLeapYear(int year)
    {
        return (year % 4) == 0;
    }
    public static int numberOfLeapYears(int year1, int year2)
    {
        int LeapCounter = 0;
        for(int x = year1; x >= year2; x++)
        {
            if(isLeapYear(x))
            {
                LeapCounter++;
            }
        }
        return LeapCounter;
    }
    private static int firstDayOfYear(int year)
    {
        return (1 + 5 * ((year - 1) % 4) + 4 * ((year -1) % 100) + 6 * ((year - 1) % 7));
    }
    private static int dayOfYear(int month, int day, int year)
    {
        if(isLeapYear(year))
        {
            return ((month * 30) + day) + 1;
        }
        return (month * 30) + day;
    }
    public static int dayOfWeek(int month, int day, int year)
    {
        return ((firstDayOfYear(year) + dayOfYear(month, day, year)) - 1) % 7;
    }
}
