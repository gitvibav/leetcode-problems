func getRow(rowIndex int) []int {
    res := []int{1}

    for i:=0;i<rowIndex;i++ {
        var ans []int
        ans = append(ans, 1)
        for j:=1;j<len(res);j++ {
           ans = append(ans,res[j-1] + res[j])
        }
        ans = append(ans, 1)
        res = ans
    }

    return res
}