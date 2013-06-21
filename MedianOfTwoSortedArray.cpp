class Solution {
public:
    double fms(int A[], int m, int B[], int n, int k) {
        if (m > n) {
            return fms(B, n, A, m, k);
        }            
        
        if (m == 0) {
            return B[k - 1];
        }
        
        if (k == 1) {
            return min(A[0], B[0]);
        }
        
        int pa = min(k/2, m);
        int pb = k - pa;
        
        if (A[pa-1] <= B[pb-1]) {
            return fms(A+pa, m-pa, B, n, k-pa);
        } else {
            return fms(A, m, B+pb, n-pb, k-pb);
        }
    }
    
    double findMedianSortedArrays(int A[], int m, int B[], int n) {
        // Start typing your C/C++ solution below
        // DO NOT write int main() function
        int sum = m + n;
        if (sum % 2 == 1) { // odd case
            return fms(A, m, B, n, sum/2+1);
        } else {    // even case
            return (fms(A, m, B, n, sum/2) + fms(A, m, B, n, sum/2+1))/2;
        }
    }
};