function idade(){
    var anoNasc = document.getElementById('ano')
    var anoAntigo = Number.parseInt(anoNasc.value)
    var sexo = document.querySelector("input[name=sexo]:checked").value
    var ano = new Date()
    var anoAtual = ano.getFullYear()
    var idade = anoAtual - anoAntigo
    var res = document.getElementById("res")
    if (anoNasc.value.length == 0 || anoNasc.value > 2023){
        window.alert('[ERRO] - Verifique os dados e tente novamente!')
        res.innerHTML = (`Sexo: ${sexo}`)
    } else if (idade<=4) {
        if (sexo == "M"){
            res.innerHTML = (`<br>É um bebê do sexo masculino de ${idade} ano(s) de idade!<br><img src="img/babyboy.png" alt="Bebê">`)
        } else{
            res.innerHTML = (`<br>É um bebê do sexo feminino de ${idade} ano(s) de idade!<br><img src="img/babygirl.png" alt="Bebê">`)
        }
    } else if (idade<=12) {
        if (sexo == "M"){
            res.innerHTML = (`<br>É uma criança do sexo masculino de ${idade} anos de idade!<br><img src="img/kidboy.png" alt="Criança">`)
        } else{
            res.innerHTML = (`<br>É uma criança do sexo feminino de ${idade} anos de idade!<br><img src="img/kidgirl.png" alt="Criança">`)
        }
    } else if (idade<=18) {
        if (sexo == "M"){
            res.innerHTML = (`<br>É um adolescente do sexo masculino de ${idade} anos de idade!<br><img src="img/teenboy.png" alt="Adolescente">`)
        } else{
            res.innerHTML = (`<br>É uma adolescente do sexo feminino de ${idade} anos de idade!<br><img src="img/teengirl.png" alt="Adolescente">`)
        }
    } else if (idade<=40) {
        if (sexo == "M"){
            res.innerHTML = (`<br>É um homem de ${idade} anos de idade!<br><img src="img/man.png" alt="Homem">`)
        } else{
            res.innerHTML = (`<br>É uma mulher de ${idade} anos de idade!<br><img src="img/woman.png" alt="Mulher">`)
        }
    } else if (idade<=55) {
        if (sexo == "M"){
            res.innerHTML = (`<br>É um homem de ${idade} anos de idade!<br><img src="img/midageman.png" alt="3ª Idade">`)
        } else{
            res.innerHTML = (`<br>É uma mulher de ${idade} anos de idade!<br><img src="img/midagewoman.png" alt="3ª Idade">`)
        }
    } else if (idade<=70) {
        if (sexo == "M"){
            res.innerHTML = (`<br>É um homem na terceira idade com ${idade} anos de idade!<br><img src="img/highageman.png" alt="Idoso">`)
        } else{
            res.innerHTML = (`<br>É uma mulher na terceira idade com ${idade} anos de idade!<br><img src="img/highagewoman.png" alt="Idosa">`)
        }
    } else if (idade>70) {
        if (sexo == "M"){
            res.innerHTML = (`<br>É um idoso de ${idade} anos de idade!<br><img src="img/oldman.png" alt="Idoso">`)
        } else{
            res.innerHTML = (`<br>É uma idosa de ${idade} anos de idade!<br><img src="img/oldwoman.png" alt="Idosa">`)
        }
    }
}