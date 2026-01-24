func backspaceCompare(s string, t string) bool {
    s_stack := []rune{}
    t_stack := []rune{}

    for _,v := range s {
        if v == '#' {
            if(len(s_stack) > 0){
                s_stack = s_stack[:len(s_stack)-1]
            }
        } else{
            s_stack = append(s_stack, v)
        }
    }

    for _,v := range t {
        if v == '#' {
            if(len(t_stack) > 0){
                t_stack = t_stack[:len(t_stack)-1]
            }
        } else{
            t_stack = append(t_stack, v)
        }
    }

    if len(s_stack) != len(t_stack) {
        return false
    }

    for i := 0; i < len(s_stack); i++ {
        if s_stack[i] != t_stack[i] {
            return false;
        }
    }

    return true
}