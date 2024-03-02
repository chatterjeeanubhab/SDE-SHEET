class Solution
{
    public int firstElementKTime(int n, int k, int[] arr) { 
        int max=Integer.MAX_VALUE,val=-1,min=Integer.MAX_VALUE;
        if(k>=n)
            return -1;
        for(int i=0;i<n;i++)
            { 
                int d=0,count=1;
                for(int j=i+1;j<n;j++)
                    {
                        if(arr[j]==arr[i])
                         {
                             count++;
                             d=j-i;
                             if(count==k && d<max && j<min){
                                max=d;
                                val=arr[i];
                                min=j;
                             }
                             
                         }
                    }
            }
            return val;
    } 
}
