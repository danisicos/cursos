#Pratique a implantação de um programa de ordenação: selecion sort

def selection_sort(arr, size):
    for i in range(size):
        # Inicialmente, defina o menor índice como o índice atual
        min_index = i

        # Encontre o menor elemento na sublista restante
        for j in range(i + 1, size):
            if arr[j] < arr[min_index]:
                min_index = j

        # Troque o menor elemento encontrado com o elemento no índice atual
        arr[i], arr[min_index] = arr[min_index], arr[i]

# Exemplo de uso
arr = [9, 0, 8, 1, 7, 2, 6, 3, 5, 4]
size = len(arr)
selection_sort(arr, size)
print("A lista ordenada é:")
print(arr)