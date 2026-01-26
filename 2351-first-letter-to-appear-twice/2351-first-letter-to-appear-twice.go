func repeatedCharacter(s string) byte {
    seen := [26]bool{}

    for i:=0; i<len(s); i++ {
        if seen[s[i]-'a'] {
            return s[i]
        }
        seen[s[i]-'a'] = true
    }

    return 0
}