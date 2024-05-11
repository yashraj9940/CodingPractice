class Solution {
    static final int[] array = new int[100000];

    public boolean isPalindrome(ListNode head) {
        int[] arr = array;
        int size = 0;
        while(head != null){
            arr[size++] = head.val;
            head = head.next;
        }
        int mid = size/2;
        for(int i = 0; i < mid; i++){
            if(arr[i] != arr[--size]){
                return false;
            }
        }
        return true;
    }

    
}