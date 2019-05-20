public class StepTracker {
    private int steps;
    int aDays;
    int days;
    int totalSteps;
    public StepTracker (int steps)
    {
        this.steps = steps;
        this.aDays = 0;
        this.days = 0;
        this.totalSteps = 0;
    }
    public int activeDays()
    {
        return (this.aDays);
    }
    public double averageSteps()
    {
        double temp = totalSteps/days;
        return temp;
    }
    public void addDailySteps(int newSteps)
    {
        if(newSteps >= this.steps)
        {
            this.aDays++;
        }
        this.days++;
        this.totalSteps += newSteps;
    }
}
