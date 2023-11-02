const form = document.querySelector('form');

form.addEventListener('submit', (event) => {
  event.preventDefault();
  validarUsuario();
});

function validarUsuario(){
    const username = document.getElementById("usuario").value;
    const password = document.getElementById("password").value;

    if(username === "AREP" && password === "admin"){
        window.location.href = "../home.html";
    }

}