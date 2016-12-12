/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/valid-palindrome/
 */

bool isPalindrome(char* s) {
    int i=0;
    int j=strlen(s)-1;
    /*for(int k=0;k<strlen(s);k++){
        s[k]=tolower(s[k]);
    }*/
    while(i<j){
        if((isalpha(s[i]) ||isdigit(s[i])) && (isalpha(s[j]) || isdigit(s[j])))
        {
            printf("%d",s[i]-s[j]);
            char p = tolower(s[i]);
            char q = tolower(s[j]);
            if(s[i]-s[j] == 0 || abs(s[i]-s[j]) == 32 && p==q){
                i++;j--;
            }else
                return false;
           
        }
        if(!(isalpha(s[i]) || isdigit(s[i])))
            i++;
        if(!(isalpha(s[j]) || isdigit(s[j])))
            j--;
    }
    return true;
}