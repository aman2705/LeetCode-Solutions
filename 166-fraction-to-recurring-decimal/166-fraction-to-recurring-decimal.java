class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if(numerator==0)
            return "0";
        
        HashMap<Long,Long> hm=new HashMap<>();
        StringBuilder sb=new StringBuilder();
        boolean neg=false;
        long n=numerator;
        long d=denominator;
        if(n<0|| d<0)
            neg=true;
        if(n<0 && d<0)
            neg=false;
        n=Math.abs(n);
        d=Math.abs(d);
        long q=n/d;
        long r=n%d;
        sb.append(q);
        if(r==0)
        {
            if(neg)
            {
                sb.insert(0,"-");
            }
            return sb.toString();
        }
        else
        {
            sb.append(".");
            while(r!=0)
            {
                if(hm.containsKey(r))
                {
                    long len=hm.get(r);
                    sb.insert((int)len,"(");
                    sb.append(")");
                    break;
                }
                else
                {
                    hm.put(r,(long)sb.length());
                    r=r*10;
                    q=r/d;
                    r=r%d;
                    sb.append(q);
                }
                
            }
        }
        if(neg)
        {
            sb.insert(0,"-");
        }
        return sb.toString();
    }
}