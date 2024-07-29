#Pratique a implantação de um programa de ordenação: bubble sort

def bubble_sort(arr, size):
    for n in range(size - 1, 0, -1):
        swapped = False
        for i in range(n):
            if arr[i] > arr[i + 1]:
                arr[i], arr[i + 1] = arr[i + 1], arr[i]
                swapped = True
        # Verifica se houve troca após o loop interno
        if not swapped:
            break

# Exemplo de uso
arr = [9, 0, 8, 1, 7, 2, 6, 3, 5, 4]
size = len(arr)
bubble_sort(arr, size)
print("A lista ordenada é:")
print(arr)
