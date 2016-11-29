/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/range-sum-query-mutable/
 */
 
 struct NumArray {
   int* sumArr;
   int* arr;
   int lenArr;
};

/** Initialize your data structure here. */
struct NumArray* NumArrayCreate(int* nums, int numsSize) {
    struct NumArray* mystruct = malloc(sizeof(struct NumArray));
    mystruct->arr=nums;
    mystruct->sumArr = malloc(sizeof(int)*numsSize);
    if(numsSize>0){
        mystruct->sumArr[0]=mystruct->arr[0];
        for(int i=1;i<numsSize;i++){
            mystruct->sumArr[i]=mystruct->sumArr[i-1]+nums[i];
        }
    }
    mystruct->lenArr=numsSize;
    return mystruct;
}

void update(struct NumArray* numArray, int i, int val) {
    int temp = numArray->arr[i];
    numArray->arr[i]=val;
    for(int h=i;h<numArray->lenArr;h++){
        numArray->sumArr[h]=numArray->sumArr[h]-temp+val;
    }
}

int sumRange(struct NumArray* numArray, int i, int j) {
    if(i==0)
        return numArray->sumArr[j];
    else 
        return numArray->sumArr[j]-numArray->sumArr[i]+numArray->arr[i];
}

/** Deallocates memory previously allocated for the data structure. */
void NumArrayFree(struct NumArray* numArray) {
    free(numArray->sumArr);
    free(numArray);
}

// Your NumArray object will be instantiated and called as such:
// struct NumArray* numArray = NumArrayCreate(nums, numsSize);
// sumRange(numArray, 0, 1);
// update(numArray, 1, 10);
// sumRange(numArray, 1, 2);
// NumArrayFree(numArray);
