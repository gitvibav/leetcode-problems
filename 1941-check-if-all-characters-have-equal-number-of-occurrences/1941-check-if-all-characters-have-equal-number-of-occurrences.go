func areOccurrencesEqual(s string) bool {
    freq := make(map[rune]int)

    for _,v := range s {
        if _,ok := freq[v]; !ok {
            freq[v] = 1;
        } else {
            freq[v] += 1;
        }
    }

    //fmt.Println(s)

    ctr := freq[rune(s[0])]

    for _,v := range freq {
        if v != ctr {
            return false;
        }
    }

    return true
}