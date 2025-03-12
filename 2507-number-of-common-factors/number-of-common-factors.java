class Solution {
    public int commonFactors(int a, int b) {
   
       int n=gcp(a>b?b:a,a>b?a:b);
       return divisors(n);
    }

    int gcp(int a,int b){
        while(a!=0){
            int temp=a;
            a=b%a;
            b=temp;
        }
        return b;
    }

     int divisors(int a){
        int num=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                num++;
            }
        }
        return num;
    
    }
}