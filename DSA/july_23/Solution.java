public class Solution {
    public int findPages(int[] arr, int k) {
        // code here
        int n = arr.length;
        if(k > n) return -1;
       int l = 0;
       int r = 0;
        for(int el : arr){
            l = Math.max(l,el);
            r += el;
        }
        int ans = 0;
        while(l <= r){
            int mid = l + (r - l)/2;
            if(check(arr,mid,k)){
                ans = mid;
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return ans;
    }
    public boolean check(int[] arr, int mid, int k){
        int student = 1;
        int curr = 0;
        for(int el : arr){
            if(curr + el <= mid){
                curr+=el;
            }else{
                student++;
                curr = el;
                if(student > k) return false;
            }
        }
        return true;
    }
}{

}
