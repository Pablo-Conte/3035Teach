# 4) Faça uma função que receba uma data no formato MM/DD/YYYY, exemplo: 03/01/2002. Você deverá informar a qual dia da semana essa data se refere.

def calcDia(data):

    mes = data[:2]
    dia = data[3:5]
    ano = data[6:]

    if mes == "01":
        chaveDoMes = 13
    elif mes == "02":
        chaveDoMes = 14
    elif mes == "03":
        chaveDoMes = 3
    elif mes == "04":
        chaveDoMes = 4 
    elif mes == "05":
        chaveDoMes = 5 
    elif mes == "06":
        chaveDoMes = 6 
    elif mes == "07":
        chaveDoMes = 7 
    elif mes == "08":
        chaveDoMes = 8 
    elif mes == "09":
        chaveDoMes = 9 
    elif mes == "10":
        chaveDoMes = 10 
    elif mes == "11":
        chaveDoMes = 11
    elif mes == "12":
        chaveDoMes = 12 
    
    if chaveDoMes == 13 or chaveDoMes == 14:
        ano = int(ano) - 1

    k = int(dia) + (2*chaveDoMes) + ((3*(chaveDoMes+1))/5) + int(ano) + (int(ano) / 4) - (int(ano)/100) + (int(ano)/400) + 2
    k = round(k)

    dia = k % 7

    if dia == 1:
        print("A data se refere à um domingo")
    elif dia == 2:
        print("A data se refere à uma segunda-feira")
    elif dia == 3:
        print("A data se refere à uma terça-feira")
    elif dia == 4:
        print("A data se refere à uma quarta-feira")
    elif dia == 5:
        print("A data se refere à uma quinta-feira")
    elif dia == 6:
        print("A data se refere à uma sexta-feira")
    elif dia == 0:
        print("A data se refere à um sábado")

data = input("Digite uma data: ")

calcDia(data)  

