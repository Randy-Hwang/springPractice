# 받은 문자열 소문자로 전환
# 딕셔너리 생성, 조건문 추가
# 딕셔너리 키에 소문자가 있으면 딕셔너리 밸류에 +1, 없으면 키 추가

word = input().lower()
dic = {}
count = 0
max = 0

for i in word:
    if i in dic:
        dic[i] += 1
    else:
        dic[i] = 1

for key, value in dic.items():
    if value > max:
        max = value
        max_key = key
        count = 1
    elif value == max:
        count += 1

if count == 1:
    print(max_key.upper())
elif count > 1:
    print('?')
