public class LightBoard {

    private boolean[][] lights;

    public LightBoard(int numRows, int numCols)
    {
        lights=new boolean[numRows][numCols];
        for (int i=0; i< lights.length; i++)
        {
            for (int j=0; j<lights[0].length; j++)
            {
                int random=(int)(Math.random()*40);
                {
                    if (random<10)
                    {
                       lights[i][j]=true;
                    }
                }
            }
        }
    }

    public boolean evaluateLight(int row, int col)
    {
        if (this.lights[row][col])
        {
            int even=0;
            for (int i=0; i<lights.length; i++)
            {
                for (int j=0; j<lights[0].length; j++)
                {
                    if (lights[i][j])
                    {
                        even++;
                    }
                }
            }
            if(even%2==0)
            {
                return false;
            }
        }

        if (!(this.lights[row][col]))
        {
            int on=0;
            for (int i=0; i<lights.length; i++)
            {
                for (int j=0; j<lights[0].length; j++)
                {
                    if (lights[i][j])
                    {
                        on++;
                    }
                }
            }
            if(on/3==0)
            {
                return true;
            }
        }
        return lights[row][col];


    }
}
