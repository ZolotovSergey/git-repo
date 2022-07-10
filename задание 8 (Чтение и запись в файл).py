with open('hello.txt', 'rb') as in_file:
    b = in_file.read()
with open('new.txt', 'wb') as out_file:
    out_file.write(b[::-1])
f = open('hello.txt', 'rb')
g = open('new.txt', 'rb')
print(*f)
print(*g)