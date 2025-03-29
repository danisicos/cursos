import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
import seaborn as sns
from sklearn.model_selection import train_test_split
from sklearn.preprocessing import StandardScaler
from sklearn.tree import DecisionTreeClassifier
from sklearn.metrics import accuracy_score, classification_report, confusion_matrix

# 1. Carregar os dados
df = pd.read_csv("C:\\Users\\Daniel\\Downloads\\drugs\\winequality-red.csv", sep=";")

# 2. Explorar o dataset
print(df.head())  # Primeiras linhas
print(df.info())  # Info geral
print(df.describe())  # Estatísticas básicas

# 3. Verificar valores nulos
print(df.isnull().sum())

# Agora seu código original funcionará:
X = df.drop(columns=["quality"], axis=1)
y = df["quality"]

# 5. Dividir em treino e teste
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)

# 6. Normalizar (se necessário)
scaler = StandardScaler()
X_train = scaler.fit_transform(X_train)
X_test = scaler.transform(X_test)

# 7. Treinar um modelo de Árvore de Decisão
clf = DecisionTreeClassifier(max_depth=5, random_state=42)
clf.fit(X_train, y_train)

# 8. Fazer previsões
y_pred = clf.predict(X_test)

# 9. Avaliar o modelo
print("Acurácia:", accuracy_score(y_test, y_pred))
print("\nRelatório de Classificação:\n", classification_report(y_test, y_pred))

# 10. Matriz de Confusão
plt.figure(figsize=(5,5))
sns.heatmap(confusion_matrix(y_test, y_pred), annot=True, fmt="d", cmap="Blues")
plt.xlabel("Previsto")
plt.ylabel("Real")
plt.title("Matriz de Confusão")
plt.show()