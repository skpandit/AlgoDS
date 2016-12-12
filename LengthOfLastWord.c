/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/length-of-last-word/
 */

int lengthOfLastWord(char* s) {
    char* temp =s;
    while(*temp!='\0'){temp++;}
    temp--;
    while(*temp==' ') {temp--;}
    int count=0;
    while(*temp) {if(*temp!=' '){count++;temp--;} else break;}
    return count;
}