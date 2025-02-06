import copy

def solution(picks, minerals):
    answer = 0
    
    #5개씩 광물 분할
    div = []
    five_minerals = []
    for i in range(len(minerals)):
        div.append(minerals[i])
        if len(div) == 5:
            five_minerals.append(div)
            div = []
    if len(div) != 0:
        five_minerals.append(div)
    
    #stone 곡괭이를 기준으로 피로도 계산
    dia = {'diamond': 1, 'iron':1, 'stone':1}
    iron = {'diamond': 5, 'iron':1, 'stone':1}
    stone = {'diamond': 25, 'iron':5, 'stone':1}
    dia_fatigue_D = {}
    iron_fatigue_D = {}
    fatigue_ary = []
    for i in range(sum(picks)):
        if len(five_minerals) == i:
            break
        dia_fatigue = 0
        iron_fatigue = 0
        fatigue = 0
        for mineral in five_minerals[i]:
            dia_fatigue += dia[mineral]
            iron_fatigue += iron[mineral]
            fatigue += stone[mineral]
        dia_fatigue_D[fatigue] = dia_fatigue
        iron_fatigue_D[fatigue] = iron_fatigue
        fatigue_ary.append(fatigue)
    
    copy_ary = copy.deepcopy(fatigue_ary)
    bestpick = [0] * len(copy_ary)
    for i in range(len(copy_ary)):
        idx = copy_ary.index(max(copy_ary))
        if picks[0] > 0:
            bestpick[idx] = "diamond"
            picks[0] -= 1
        elif picks[1] > 0:
            bestpick[idx] = "iron"
            picks[1] -= 1
        elif picks[2] > 0:
            bestpick[idx] = "stone"
            picks[2] -= 1
        copy_ary[idx] = 0

    for i in range(len(fatigue_ary)):
        if bestpick[i] == "diamond":
            answer += dia_fatigue_D[fatigue_ary[i]]
        elif bestpick[i] == "iron":
            answer += iron_fatigue_D[fatigue_ary[i]]
        elif bestpick[i] == "stone":
            answer += fatigue_ary[i]
                
    return answer