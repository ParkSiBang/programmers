def solution(n):
    answer = 0
    
    s = str(n)
    for n in s:
        answer += int(n)

    return answer