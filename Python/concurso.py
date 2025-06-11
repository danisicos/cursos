from sklearn.metrics import precision_score

y0 = [[0, 0, 0], [1, 0, 0], [0, 1, 1]]
y1 = [[0, 1, 0], [1, 0, 1], [1, 1, 0]]

s0 = precision_score(y0, y1, average='micro')
s1 = precision_score(y1, y0, average='micro')
s3 = precision_score(y0, y0, average='micro')

print(s0)
print(s1)
print(s3)