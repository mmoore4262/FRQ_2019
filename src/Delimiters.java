import java.util.ArrayList;
import java.util.List;

public class Delimiters {
    private String openDel;
    private String closeDel;

    public Delimiters (String open, String close)
    {
        openDel=open;
        closeDel=close;
    }
    public ArrayList<String> getDelimitersList (String[] tokens)
    {
        List<String> list= new ArrayList<>();
        for (int i=0; i< tokens.length; i++)
        {
            if (tokens[i].equals(this.openDel)|| tokens[i].equals(this.closeDel))
            {
                list.add(tokens[i]);
            }
        }
        return (ArrayList)list;
    }

    public boolean isBalanced (ArrayList <String> delimiters)
    {
        int o=0;
        int c=0;
        for (int i=0; i<delimiters.size(); i++)
        {
            if (delimiters.get(i).equals(this.openDel))
            {
                o++;
            }
            if (delimiters.get(i).equals(this.closeDel))
            {
                c++;
            }
            if (c>o)
            {
                return false;
            }
        }
        if (c==o)
        {
            return true;
        }
        else
            return false;

    }
}
