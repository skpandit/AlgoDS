/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/merge-sorted-array/
 */

void merge(int* nums1, int m, int* nums2, int n) {
    if( n == 0 )
        return nums1;
    int i=n;
    int j=0;
    int h=0;
    int u=0;
    int* temp1 = malloc(sizeof(int)*(m));
    while(h<m){
        temp1[h]=nums1[h];
        h++;
    }
    while(u<m){
        nums1[u+n]=temp1[u];
        u++;
    }
    
    int k=0;
    if(m!=0 && n!=0){
        while(i<m+n && j<n) {
            if(nums1[i]>nums2[j]){
                nums1[k++]=nums2[j];
                j++;
            } else {
                nums1[k++]=nums1[i];
                /*printf("%d",nums1[i]);
                printf("\n");*/
                i++;
            }
        }
    }
    if(n!=0){
        while(j<n){
            nums1[k++]=nums2[j++];
        }
    }
    if(m!=0){
        while(i<m+n){
            nums1[k++]=nums1[i++];
        }
    }
}
