# @param {String} s
# @return {Boolean}
def is_valid(s)
    stack = []

    s.each_char do |char|
        if char == ')' && stack.last == '('
            stack.pop
        elsif char == '}' && stack.last == '{'
            stack.pop
        elsif char == ']' && stack.last == '['
            stack.pop
        else
            stack.push(char)
        end
    end

    !(stack.length > 0)
end