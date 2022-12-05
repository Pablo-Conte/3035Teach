// 1) Faça uma função que receba um array composto de [ 1, 2, 3, 4, 5, 6, 6 ], você deverá retornar o segundo maior número deste array.

function segundoMaior(array) {
    
    let maior;
    let segundoMaior;

    //Verifica o maior número do array
    let count = 0;
    for (let c in array) {
        
        if (count == 0){
            maior = array[c];
            segundoMaior = array[c];
        }

        if (c >= maior) {
            maior = array[c];
        }

        count++
    }

    //Verifica o segundo maior número do array
    for (let c in array) {
        
        if (array[c] >= segundoMaior && array[c] < maior) {
            segundoMaior = array[c];
        }
        console.log(array[c])
    }

    return segundoMaior;
}

let array = [ 1, 2, 3, 4, 5, 6, 6 ];
console.log(segundoMaior(array));