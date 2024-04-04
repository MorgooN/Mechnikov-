int maxDepth(char* s) {
    int counter = 0;
    int maxCount = 0;

    for(int i = 0; i < strlen(s);++i){
        if(s[i]=='('){
        ++counter;
            if(counter > maxCount){
            ++maxCount;
        }
        }
        if(s[i]==')'){
            --counter;
        }
    }
    return maxCount;
}