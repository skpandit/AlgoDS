/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/zigzag-conversion/
 */

char* convert(char* s, int numRows) {
    if(s==NULL)
        return s;
    if(numRows<=1)
        return s;
    char* ans = malloc(sizeof(char)*(strlen(s)+1));
    int i=0; //counter for ans
    int* temp = malloc(sizeof(int)*strlen(s));
    while(i<strlen(s)) {
        for(int j=0;j<numRows;j++){
            if(i<strlen(s))
                *(temp+i)=j;
            i++;
        }
        for(int k=numRows-2;k>0;k--){
            if(i<strlen(s))
                *(temp+i)=k;
            i++;
        }
    }
    int u=0;
    int h=0;
    while(u<numRows){
        int x=0;
        while(x<strlen(s)) {
            if(*(temp+x)==u)
                *(ans+h++)=*(s+x);
            x++;
            
        }
        u++;
    }
    *(ans+h)='\0';
    return ans;
}