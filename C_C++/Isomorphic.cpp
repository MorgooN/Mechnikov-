#include <string.h>
#include <unordered_map>

class Solution {
public:
    bool isIsomorphic(string s, string t) {
        if (s.size() != t.size())
            return false;

        std::unordered_map<char, char> charMap;
        std::set<char> char_founded;
        
        for (int i = 0; i < s.size(); i++){
            if (charMap.find(s[i]) != charMap.end()){
                if (charMap[s[i]] != t[i])
                    return false;
            } else {
                if (char_founded.find(t[i]) != char_founded.end())
                    return false;
                
                charMap[s[i]] = t[i];
                char_founded.insert(t[i]);
            }
        }
        return true;

    }
};