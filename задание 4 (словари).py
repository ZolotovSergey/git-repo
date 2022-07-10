dict = {'one': 1, 'two': 2, 'thee': 3, 'four': 4, 'five': 5}
new_dict={}
for i in dict:
    if dict[i] >= 3:
        new_dict[dict[i]] = i
print(new_dict)