import java.util.ArrayList;

public class Runner{
    public static void main (String[] args) {
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

