func stringMatching(words []string) []string {
    ans := make([]string, 0)

    for i:=0;i<len(words);i++{
        for j:=0;j<len(words);j++{
            if strings.Contains(words[j], words[i]) && i != j {
                if !slices.Contains(ans, words[i]) {
                    ans = append(ans, words[i])
                }    
            }
        }
    }

    return ans
}