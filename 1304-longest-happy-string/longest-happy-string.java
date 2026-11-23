class Solution {
    public static class C{
        public int c;
        public char ch;
        C(int cc,char chh){
            c=cc;
            ch=chh;
        }

    }
    public String longestDiverseString(int a, int b, int c) {
        PriorityQueue <C> pq=new PriorityQueue<>((x,y)->(y.c-x.c));
       if(a>0)pq.offer(new C(a,'a'));
       if(b>0)pq.offer(new C(b,'b'));
       if(c>0)pq.offer(new C(c,'c'));
       StringBuffer ans=new StringBuffer();
       while(!pq.isEmpty()){
        C first=pq.poll();
        int l=ans.length();
        if(ans.length()>=2 && first.ch==ans.charAt(l-1)  && first.ch==ans.charAt(l-2)){
            if(pq.isEmpty())
                return ans.toString();
            C s=pq.poll();
              ans.append(s.ch);
              s.c--;
               if(s.c>0){
                pq.offer(s);
            }
             pq.offer(first);

        }
        else{
            ans.append(first.ch);
            first.c--;
            if(first.c>0){
                pq.offer(first);
            }
        }

       }

       return ans.toString();  
    }
}