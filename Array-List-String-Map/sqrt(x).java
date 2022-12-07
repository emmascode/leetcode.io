class Sqrt {
    public static int mySqrt(int x) {
        int l=1;
        int h=x;
		if(x<0)
			return -1;
        if(x==0)
            return 0;
        if(x<4)
            return 1;
        while(l<h)
        {
            int mid=l+(h-l)/2;
            if(x/mid==mid)
                return mid;
            else if(x/mid>mid)
                l=mid+1;
            else 
                h=mid;
        }
        return l-1;
    }
    public static void main(String[] args) {
        int x = 4;
        int y = 8;
        System.out.println(Sqrt.mySqrt(x));
        System.out.println(Sqrt.mySqrt(y));
    }
}
