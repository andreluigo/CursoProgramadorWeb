//Tipos de variáveis javascript
//var, let e const
//Exemplos
var nome = 'Andre'; // permite reatribuição
console.log(nome);
var nome = 'Gabriel';
console.log(nome); //console.log() equivalente ao println/printf
let idade = 42; // não permite reatribuição
const casado = true; //também não permite reatribução como objeto

const teste = {
    nome2: 'André',
    idade2: 42
}
console.log(teste)
console.log(teste.nome2)

//Array
let array = ['André', 42, 'casado']
console.log(array)
console.log(array[2])

//Uso das aspas
let texto = 'dentro do texto'

console.log('Aspas simples ' + texto)
console.log("Aspas duplas " + texto)
console.log(`Crase ${texto}`)

//Funções
function mostrarAlerta() {
    alert('Hello World!') //Exibe um popup na tela com uma mensagem
    return 'Alerta exibido!'
}
