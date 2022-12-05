#2) Faça uma função que receba uma string, você deverá retornar esta string ao contrário.

def revert(str):
    
    revertedStr = str[::-1]
    return revertedStr


word = input("Write a string: ")
print(revert(word))


