func countNegatives(grid [][]int) int {
    neg_cnt := 0

    for i:=0;i<len(grid);i++{
        for j:=0;j<len(grid[0]);j++{
            if(grid[i][j] < 0){
                neg_cnt++;
            }
        }
    }

    return neg_cnt;
}