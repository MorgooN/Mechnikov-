class Solution {
public:
    string makeGood(string s) {
      std::stack<char> s1;

      for(int i = 0; i <= s.length()-1;++i){
         if(!s1.empty()&& std::abs(s[i] - s1.top()) == 32){
            s1.pop();
         }else{
            s1.push(s[i]);
         }
      }

      std::string res;
      while(!s1.empty()){
        res = s1.top()+res;
        s1.pop();
      }
      return res; 
    }
}