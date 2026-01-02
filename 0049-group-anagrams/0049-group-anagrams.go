func groupAnagrams(strs []string) [][]string {
    hash := make(map[[26]int][]string)

    for _,v := range strs {
        var count [26]int

        for _,e := range v {
            count[e-'a']++;
        }

        hash[count] = append(hash[count], v);
    }

    var res [][]string

    for _,v := range hash {
        res = append(res, v);
    }

    return res;
}