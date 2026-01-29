func maxProfit(prices []int) int {
    min := 99999999
    profit := 0

    for _,v := range prices {
        if v < min {
            min = v
        }
        profit = max(v - min, profit)
    }

    return profit
}