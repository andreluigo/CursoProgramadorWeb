//Exercício 12 do Curso em Vídeo

//var today = new Date()
var hora = 6//today.getHours()
var minuto = 31//today.getMinutes()
var seg = 23//today.getSeconds()

console.log(hora + ":" + minuto + ":" + seg)

if (hora>=6 && hora <= 12) {
    console.log('Bom dia!')
} else if (hora>12 && hora < 18){
    console.log('Boa tarde!')
} else {
    console.log('Boa noite!!!')
}