function validar() {
    var medidas = form1.medidas.value;
    var setor = form1.setor.value;
    var Ocorrencia = form1.ocorrencia.value;
    var Descrição = form1.desc.value;
    var adm = form1.adm.value;

    if (medidas == "") {
        alert('Preencha o campo com medidas');
        form1.medidas.focus();
        return false;
    }

    if (setor == "") {
        alert('Preencha o campo com seu setor');
        form1.setor.focus();
        return false;
    }

    if (Ocorrencia == "") {
        alert('Preencha o campo com a ocorrênica');
        form1.ocorrencia.focus();
        return false;
    }

    if (Descrição == "") {
        alert('Coloque a descrição');
        form1.desc.focus();
        return false;
    }

    if (adm == "") {
        alert('Preencha este campo');
        form1.adm.focus();
        return false;
    }

    if (senha != rep_senha) {
        alert('Senhas diferentes');
        form1.senha.focus();
        return false;
    } else if (senha != rep_senha) {
        alert('Senhas diferentes');
        form1.senha.focus();
        return false;
    }

}
