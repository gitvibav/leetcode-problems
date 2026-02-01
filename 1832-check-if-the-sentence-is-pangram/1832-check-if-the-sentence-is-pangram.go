func checkIfPangram(sentence string) bool {
    freq := [26]int{}

    for _,v := range sentence {
        freq[v-'a']++
    }

    for i:=0;i<26;i++ {
        if freq[i] == 0 {
            return false
        }
    }

    return true
}