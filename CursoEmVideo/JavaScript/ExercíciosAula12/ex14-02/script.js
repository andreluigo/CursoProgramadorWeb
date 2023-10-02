function carregar(){
    var msg = document.getElementById('msg')
    var img = document.getElementById('img')
    var data = new Date()
    var hora = data.getHours()
    var min = data.getMinutes()
    if (min<10){
        min = '0' + min
    }
    msg.innerHTML = `Agora é ${hora}h${min}m...`
    if (hora>0 && hora<12){
        img.innerHTML = '</br><img id="foto" src="manha.png" alt="Foto do Dia"></br>Bom dia!'
        corpo.style.background="#e9c693"
    } else if (hora>=12 && hora<18){
        img.innerHTML = '</br><img id="foto" src="tarde.png" alt="Foto do Dia"></br>Boa tarde!'
        corpo.style.background="#a4abbb"
    } else {
        img.innerHTML = '</br><img id="foto" src="noite.png" alt="Foto do Dia"></br>Boa Noite!'
        corpo.style.background="#24565c"
    }
}