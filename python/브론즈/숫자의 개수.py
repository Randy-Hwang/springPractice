# 세 자연수 곱하기
# for문을 돌면서 count함수 실행 + print
num1 = int(input())
num2 = int(input())
num3 = int(input())

multi = num1 * num2 * num3

for i in range(0, 10):
    print(str(multi).count(str(i)))