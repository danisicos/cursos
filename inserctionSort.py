#Pratique a implantação de um programa de ordenação: inserction sort

def insertion_sort(arr, size):	
	for i in range(1, size):
		#Usando uma variável temporária para comparação 
		key = arr[i] 
		j = i-1
		#O bloco a seguir compara os elementos, sempre adicionando um elemento a cada 'for'
		while j >= 0 and key < arr[j]:
			arr[j+1] = arr[j] 
			j -= 1
		arr[j+1] = key 

# Exemplo de uso
arr = [9, 0, 8, 1, 7, 2, 6, 3, 5, 4]
size = len(arr)
insertion_sort(arr, size)
print("A lista ordenada é:")
print(arr)