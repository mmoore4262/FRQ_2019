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

        Delimiters hey= new Delimiters("</c","</o>");
        String[] tokens= {"</c","not", "open", "</c", "</c", "</o>", "</o>", "</o>"};

        System.out.println(hey.getDelimitersList(tokens));
        ArrayList<String> k=new ArrayList<>();
        for (int i=0; i<tokens.length; i++)
        {
            k.add(tokens[i]);
        }
        System.out.println(hey.isBalanced(k));
    }
}

