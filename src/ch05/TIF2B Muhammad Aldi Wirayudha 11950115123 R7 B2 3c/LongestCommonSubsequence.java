public class LongestCommonSubsequence {

    private String one;
    private String two;
    private int lcs[][];
    private Direction direction[][];

    public LongestCommonSubsequence(String a, String b)
    {
        this.one = a;
        this.two = b;

        init();
    }

    public void init()
    {

        lcs = new int[one.length()+1][two.length()+1];
        direction = new Direction[one.length()+1][two.length()+1];

        for(int a=0; a<(one.length()+1); a++)
        {
            lcs[a][0] = 0;
            direction[a][0] = Direction.WALL;
        }
        
        for(int b=0; b<(two.length()+1); b++)
        {
            lcs[0][b] = 0;
            direction[0][b] = Direction.WALL;
        }

        for(int i=1; i<(one.length()+1); i++)
            for(int j=1; j<(two.length()+1); j++)
            {
                if(one.charAt(i-1) == two.charAt(j-1))
                {
                    lcs[i][j] = lcs[i-1][j-1]+1;
                    direction[i][j] = Direction.DIAG;
                }
                else if(lcs[i-1][j] >= lcs[i][j-1])
                {
                    lcs[i][j] = lcs[i-1][j];
                    direction[i][j] = Direction.UP;
                }
                else
                {
                    lcs[i][j] = lcs[i][j-1];
                    direction[i][j] = Direction.LEFT;
                }
            }
    }

    public String getLCS()
    {
        String temp = "";
        int lengthOne = one.length();
        int lengthTwo = two.length();

        while(lengthOne>0 && lengthTwo>0)
        {
            if(direction[lengthOne][lengthTwo] == Direction.DIAG)
            {
                temp += one.charAt(lengthOne-1);
                lengthOne--;
                lengthTwo--;
            }
            if(direction[lengthOne][lengthTwo] == Direction.UP)
            {
                lengthOne--;
            }
            else if(direction[lengthOne][lengthTwo] == Direction.LEFT)
            {
                lengthTwo--;
            }
        }

        String result = "";
        for(int i=temp.length()-1; i>=0; i--)
            result += temp.charAt(i);

        return result;
    }

    public void printLCS()
    {
        System.out.print("    ");
        for(int a=0; a<(two.length()); a++)
            System.out.print(two.charAt(a)+" ");
        System.out.println();

        for(int i=0; i<(one.length()+1); i++)
        {
            if(i==0)
                System.out.print("  ");
            else
                System.out.print(one.charAt(i-1)+" ");
            
            for(int j=0; j<(two.length()+1); j++)
            {
                System.out.print(lcs[i][j] + " ");
            }
        System.out.println();
        }
    }

    public void printDirection()
    {
        System.out.print("    ");
        for(int a=0; a<(two.length()); a++)
            System.out.print(two.charAt(a)+" ");
        System.out.println();

        for(int i=0; i<(one.length()+1); i++)
        {
            if(i==0)
                System.out.print("  ");
            else
                System.out.print(one.charAt(i-1)+" ");

            for(int j=0; j<(two.length()+1); j++)
            {
                System.out.print(direction[i][j] + " ");
            }
        System.out.println();
        }
    }

    private enum Direction
    {
        LEFT, UP, DIAG, WALL;

        @Override
        public String toString()
        {
            switch (this)
            {
                case LEFT:
                    return "<";
                case UP:
                    return "^";
                case DIAG:
                    return "\\";
                case WALL:
                    return "#";
            }
            throw new IllegalStateException("Wrong Direction");
        }
    }
}