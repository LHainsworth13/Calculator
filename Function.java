
/**
 * A basic class that holds a function f(x) in an object (basis for using the derivative and integral calculators)
 * 
 * @Liam Hainsworth 
 * @0.1 (May 18, 2016)
 */
public class Function
{
    String base;
    private int pos = 0;
    /**
     * Constructor for the class
     */
    public Function(String in)
    {
        ops = in;
    }

    /**
     * Solves equation for a given x value
     */
    private double parseVal(String ops, double x)
    {
        for(int pos=0;pos<ops.length();pos++){
            if(!((47<cur&&cur<58)||cur=='.'||cur=='^')){
                for(pos=0;pos<ops.length;pos++){
                    char cur = in.getChar(pos);
                    if(cur=='('){
                        for(i=pos;i<=ops.length;pos++)
                        {
                            int count;
                            if(in.getChar(i)=='(')
                            {
                                count++;
                            }
                            else if(in.getChar(i)==')')
                            {
                                count--;
                            }
                            if(count==0)
                            {
                                return parseVal(ops.substring(0,pos)+parseVal(ops.substring(pos+1,i),x)+ops.substring(i+1,ops.length),x);
                            }
                        }
                        return null;
                    }else if(cur=='*'){

                    }else if(cur=='/'){

                    }else if(cur=='+'){

                    }else if(){
                        int start = pos;
                    }else if(cur=='+'){
                        return getVal
                    }
                }
                return null;
            }
        }
        try{
            return Double.parseDouble(ops);
        }catch(Exception e){
            return null;
        }
    }

    /**
     * Basic call to solve equation for x 
     */
    public double getVal(double x)
    {
        return parseVal(
    }
}

