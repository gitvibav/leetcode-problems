func maximumCount(nums []int) int {
    pos_cnt := 0
    neg_cnt := 0

    for _,v := range nums {
        if v < 0 {
            neg_cnt++;
        } else if v > 0{
            pos_cnt++;
        }
    }

    return max(pos_cnt, neg_cnt);
}