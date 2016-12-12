/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/compare-version-numbers/
 */

int compareVersion(char* version1, char* version2) {
    int i=0;
    int j=0;
    int n1 = strlen(version1);
    int n2=strlen(version2);
    int num1=0;
    int num2=0;
    int ans=0;
    while(i<n1 || j<n2) {
        while(i<n1 && *(version1+i) != '.'){
            num1+=num1*10 + (*(version1+i)-'0');
            i++;
        }
        while(j<n2 && *(version2+j) != '.'){
            num2+=num2*10 + (*(version2+j)-'0');
            j++;
        }
        if(num1>num2) {
            ans= 1;
            break;
        } else if (num2>num1) {
            ans=-1;
            break;
        } 
        i++;j++;num1=0;num2=0;
        
    }
    return ans;
}