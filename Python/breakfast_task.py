def reversed_string(s):
    return s[::-1]

word_str = "Oluwasegu"
reversed_str = reverse_string(word_str)
print(f"Original string: {word_str}")
print(f"Reversed string: {reversed_str}")

word ="elonmusk"

for letters in word:
	print(ord(letters))

sum = 0
count = 0
average = 0
for number in range(1,101):
	sum += number
	count += 1

average = sum // count
print(average)

number = int(10)
divisor = 2
count_divisor = 0

while number > 1:
	if number % divisor == 0:
		number = number // divisor
	else:
		divisor += 1
	count_divisor += 1
	
print(count_divisor)

alphabets = "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z"
word = "OluwaSeGUN"

count = 0

for letters in word:
	if letters in alphabets:
		count += 1
print(count)

alphabets = "A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z"
word = "OluwaSeGUN"

count = 0

for letters in word:
	if letters in alphabets:
		count += 1
print(count)

number = int(10)
divisor = 2

while number > 1:
	if number % divisor == 0:
		number = number // divisor
	else:
		divisor += 1
	print(divisor)

vowels = "aeiou"
word = "oluwasegun"
position = word[0]

for letters in word:
	if letters in vowels:
		 position = letters
print(position)	

vowels = "aeiou"
word = "oluwasegun"
position = word[0]

for letters in word:
	if letters in vowels:
		 position = letters
print(position)


numbers = "12345"

for number in numbers[: : -1]:
	print(number)

name = "Oluwasegun"

for char in name[: :-1]:
	print(char)


sum = 0
count = 0
average = 0
for number in range(1,101)
	sum += number
	count += 1

average = sum // count
print(average)
