import java.util.ArrayList;

public class Runner{
    public static void main (String[] args) {
        StepTracker tr = new StepTracker(10000);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
        tr.addDailySteps(9000);
        tr.addDailySteps(5000);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
        tr.addDailySteps(13000);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
        tr.addDailySteps(23000);
        tr.addDailySteps(1111);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());

        Delimiters hey= new Delimiters("</o>","</c>");
        String[] tokens= {"</c>","not", "open", "</c>", "</c>", "</o>", "</o>", "</o>"};
        System.out.println(hey.getDelimitersList(tokens));
        ArrayList<String> k=new ArrayList<>();
        for (int i=0; i<tokens.length; i++)
        {
            k.add(tokens[i]);
        }
        System.out.println(hey.isBalanced(k));

        LightBoard sim= new LightBoard(8,4);
        System.out.println(sim.evaluateLight(0,3));

         APCalendar test= new APCalendar();
         System.out.println(test.numberOfLeapYears(1997,2019));
         System.out.println(test.dayOfWeek(0,25,2019));




    }
}

