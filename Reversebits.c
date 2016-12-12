/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/reverse-bits/
 */
 
uint32_t reverseBits(uint32_t n) {
    uint32_t ans =0;
    int i=0;
    while(i<32) {
        if((n>>i)&(1) >= 1) {
            ans^=(1<<(31-i));
            printf("%u\n",ans);
        }
        i++;
    }
    return ans;
}