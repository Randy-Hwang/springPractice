n = int(input())
scores = list(map(int, input().split()))

realMax = max(scores)
for k in scores:
    scores[scores.index(k)] = k / realMax * 100

avg = sum(scores) / n
print(avg)