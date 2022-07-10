import threading
import time


def count(i):
    k = 10
    while k > 0:
        print(f"{i} поток сейчас пишет: {k}")
        k -= 1
        time.sleep(5)


for i in range(1, 3):
    th = threading.Thread(target=count, args=(i,))
    th.start()