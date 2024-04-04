#include <string.h>

class Solution {
public:
    int lengthOfLastWord(string s) {
        
        int counter = 0;
        bool counting = false;
        for(int i = s.length()-1; i>=0; --i){
            if(s[i]!=' '){
                counting = true;
                ++counter;
            }
            else if(counting){
                break;
            }
        }
        return counter;
    }
};