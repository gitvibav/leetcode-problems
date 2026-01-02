func isAnagram(s string, t string) bool {
    hash1 := make(map[rune]int)
    hash2 := make(map[rune]int)

    for _,v := range s {
        if _, ok := hash1[v]; !ok {
            hash1[v] = 1;
        } else {
            hash1[v]++;
        }
    }

    for _,v := range t {
        if _, ok := hash2[v]; !ok {
            hash2[v] = 1;
        } else {
            hash2[v]++;
        }
    }

    if len(hash1) != len(hash2){
        return false;
    }

    for k,_ := range hash1 {
        if hash1[k] != hash2[k] {
            return false;
        }
    }

    return true;
}