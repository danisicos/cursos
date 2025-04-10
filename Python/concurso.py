import json
x ='{"nome":"Paulo", "idade":30, "cidade":"São Paulo"}'
y = json.loads(x)
print(y["cidade"])