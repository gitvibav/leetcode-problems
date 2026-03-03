# @param {String} s
# @param {String} t
# @return {Boolean}
def is_anagram(s, t)
    arr = Array.new(26,0)

    s.each_char do |s_char|
        arr[s_char.ord - 'a'.ord] += 1
    end

    t.each_char do |t_char|
        arr[t_char.ord - 'a'.ord] -= 1
    end

    arr.all? {|count| count == 0}
end