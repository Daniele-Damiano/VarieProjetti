/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function registrazione()
{
    /*
     * Prende l'input da i campi e li mette in variabili globali
     */

    var nome = document.getElementById("nome").value;
    var cognome = document.getElementById("cognome").value;
    var dataNascita = document.getElementById("nascita").value;
    var luogoNascita = document.getElementById("luogonascita").value;
    var codiceFiscale = document.getElementById("codicefiscale").value;
    var indirizzo = document.getElementById("indirizzo").value;
    var telefono = document.getElementById("tel").value;
    var username = document.getElementById("username").value;
    var password = document.getElementById("password").value;

    /*
     * controlla gli input
     */
    controlloDati(nome, cognome, username, password);



    localStorage.setItem("tel", telefono);
    localStorage.setItem("indirizzo", indirizzo);
    localStorage.setItem("codicefiscale", codiceFiscale);
    localStorage.setItem("luogonascita", luogoNascita);
    localStorage.setItem("dataNascita", dataNascita);
    localStorage.setItem("cognome", cognome);
    localStorage.setItem("nome", nome);
    localStorage.setItem("username", username);
    localStorage.setItem("password", password);


    function controlloDati(nome, cognome, username, password)
    {

        /*
         * Se i campo input sono tutti con dei valori ti porta alla pagina bemvenuto
         */
        if (nome != "" && cognome != "" && username != "" && password != "")
        {
            window.location.assign("../html/accedi.html");
        }

        /*
         * Se il campo nome, cognome, username e password sono vuoti appare un messaggo 
         */
        if (nome == "")
        {
            document.getElementById("checkNome").innerHTML = "Campo Obbligatorio";
            document.getElementById("checkNome").style.color = "red";
        } else
        {
            document.getElementById("checkNome").innerHTML = "Ok";
            document.getElementById("checkNome").style.color = "green";
        }
        if (cognome == "")
        {
            document.getElementById("checkCognome").innerHTML = "Campo Obbligatorio";
            document.getElementById("checkCognome").style.color = "red";
        } else
        {
            document.getElementById("checkCognome").innerHTML = "Ok";
            document.getElementById("checkCognome").style.color = "green";
        }
        if (username == "")
        {
            document.getElementById("checkUser").innerHTML = "Campo Obbligatorio";
            document.getElementById("checkUser").style.color = "red";
        } else
        {
            document.getElementById("checkUser").innerHTML = "Ok";
            document.getElementById("checkUser").style.color = "green";
        }
        if (password == "")
        {
            document.getElementById("checkPass").innerHTML = "Campo Obbligatorio";
            document.getElementById("checkPass").style.color = "red";
        } else
        {
            document.getElementById("checkPass").innerHTML = "Ok";
            document.getElementById("checkPass").style.color = "green";
        }



    }
}
