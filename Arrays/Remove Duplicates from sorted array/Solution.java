class Solution {
    public int removeDuplicates(int[] arr) {
        int f=arr[0];
        int count=1;
       for(int i=1;i<arr.length;i++)
        {
           if(arr[i]==f)
            {
                if(count>=2)
                    arr[i]=Integer.MAX_VALUE;
                else
                    count++;
            }
           else if(f!=arr[i])
              {
                  f=arr[i];
                  count=1;

              }

        }
        int c=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
            {
                if(arr[i]==Integer.MAX_VALUE)
                    c++;
            }
       return (arr.length-c);
        
    }
}
