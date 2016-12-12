/**
 * Date 11/29/2016
 * @author Saili Pandit
 * https://leetcode.com/problems/isomorphic-strings/
 */

bool scanMap(char* map, char c){
    if(c==' ')
        return true;
    for(int u=0;u<256;u++){
        if(map[u]==c)
            return false;
    }
    return true;
}
bool isIsomorphic(char* s, char* t) {
    char* map = malloc(sizeof(char)*256);
    memset(map,' ',256);
    if(strlen(s)!=strlen(t))
        return false;
    int i=0;
    int j=0;
    while(i<strlen(s)){
        int temp = (int)s[i];
        if (map[temp]==' ') {
            if(scanMap(map,t[j])) 
                map[temp]=t[j];
            else
                return false;
        } else{
            if(map[temp]!=t[j])
                return false;
        }
        i++;j++;
    }
    return true;
}