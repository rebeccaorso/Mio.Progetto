var myTab = new bootstrap.Tab(document.getElementById('tab-login'));
myTab.show();

const URL = "http://localhost:9008/api/utente";


let usernameRegistrazione = document.querySelector("#registerUsername");
let nome = document.querySelector("#registerName");
let cognome = document.querySelector("#registerCognome");
let dataNascita = document.querySelector("#registerDataNascita");
let residenza = document.querySelector("#registerResidenza");
let genere;
let emailRegistrazione = document.querySelector("#registerEmail");
let password = document.querySelector("#registerPassword");
let repeatPassword = document.querySelector("#registerRepeatPassword");
let btn = document.querySelector("#btnRegistra");
let demo = document.querySelector("#demo");
let demo1 = document.querySelector("#demo1");
let demo2 = document.querySelector("#demo2");
let utente;

let bottoneRegistra = document.querySelector("#tab-register");
let bottoneLogin = document.querySelector("#btn");

bottoneLogin.addEventListener("click", function() {
  login();

  bottoneRegistra.addEventListener("click", function() {
    Registrazione();
  })
})

function login() {
  let userInput = document.querySelector("#loginName").value;
  let passwordLogin = document.querySelector("#loginPassword").value;

  fetch(URL)
            .then(data => {
                return data.json();
            })
            .then(utenti => {
                console.log(utenti);

                const utenteTrovato = utenti.find(utente => utente.username == userInput && utente.password == passwordLogin);
                if(utenteTrovato){
                  console.log(utenteTrovato);
                  renderTo(utenteTrovato);
                }else{
                  alert("Inserire indirizzo email e codice cliente validi");
                    form.reset();
                    
                }

})

}
window.open("home.html", "_blank");    





function Registrazione(){

  usernameRegistrazione.addEventListener('input', function() {
    let username = usernameRegistrazione.value;
    
  // check username esiste
    if(username.length >0){
      fetch('http://localhost:9008/api/check-username', {
        method: 'post',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({ username: username })
    })
    .then(response => response.json())
    .then(data => {
      console.log(data);
        if (data == false) {
          demo.innerHTML = ("Username già in uso.");
        }else {
          demo.innerHTML = ""; 
        }
    })
    .catch(error => console.error('Errore:', error));
    }
    
  });
  
  
  // check email esiste
  emailRegistrazione.addEventListener('input', function() {
  let email = emailRegistrazione.value;
  
  
  if(email.length >0){
    fetch('http://localhost:9008/api/check-email', {
      method: 'post',
      headers: {
          'Content-Type': 'application/json'
      },
      body: JSON.stringify({ email: email })
  })
  .then(response => response.json())
  .then(data => {
    console.log(data);
      if (data == false) {
        demo1.innerHTML = ("Email già in uso.");
      }else {
        demo1.innerHTML = ""; 
      }
  })
  .catch(error => console.error('Errore:', error));
  }
  
  });
  
  
  
  
  document.querySelectorAll('input[name="inlineRadioOptions"]').forEach((radio) => {
    radio.addEventListener('change', function() {
      switch (true) {
        case document.getElementById('maschio').checked:
          genere = "Maschio";
          break;
        case document.getElementById('femmina').checked:
          genere = "Femmina";
          break;
        case document.getElementById('nonBinario').checked:
          genere = "Non Binario";
          break;
        case document.getElementById('altro').checked:
          genere = "Altro";
          break;
        default:
          genere = null; // Gestione di un caso non previsto
          break;
      }
      
      console.log(genere);
    });
    });
    
  
  let togglePasswordList = document.querySelectorAll(".toggle-password");
  let passwordInputList = document.querySelectorAll(".pass");

  togglePasswordList.forEach(function(togglePassword, index) {

    togglePassword.addEventListener('click', function() {
        if (passwordInputList[index].type === "password") {
            passwordInputList[index].type = "text";
            togglePassword.textContent = "Nascondi Password";
        } else {
            passwordInputList[index].type = "password";
            togglePassword.textContent = "Mostra Password";
        }
    });
});

function confrontaPassword() {
  // let password = passwordInput.value;
  // let repeatPassword = repeatPasswordInput.value;

  if (password.value !== repeatPassword.value) {
      demo2.textContent = "Le password non corrispondono";
  } else {
      demo2.textContent = "";
  }
}

password.addEventListener('input', confrontaPassword);
repeatPassword.addEventListener('input', confrontaPassword);
  
  btn.addEventListener("click", function() {
      inviaDati();
    })
  
  
  function inviaDati() {
  
  
        utente = {
         username:usernameRegistrazione.value,
         nome: nome.value,
         cognome: cognome.value,
         data_nascita: dataNascita.value,
         comune_residenza: residenza.value,
         genere: genere,
         email: emailRegistrazione.value,
         password: password.value
       };
  
  
  console.log(utente);

        fetch("http://localhost:9008/api/utente", {
          method: "POST",
          headers: {
              "Content-Type": "application/json"
          },
          body: JSON.stringify(utente)
        })
        .then(response => response.json())
        .then(message => {
          console.log(message); 
      })
      .catch(error => {
          console.error("Error:", error);
        });
  
        window.open("home.html", "_blank");    
  
        }
  
  


}
