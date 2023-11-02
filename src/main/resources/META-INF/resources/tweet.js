const form = document.querySelector('form');
const textarea = document.querySelector('textarea');

form.addEventListener('submit', (event) => {
	event.preventDefault();
    postTweet();
});


function postTweet(){
    const url = 'http://localhost:8080/tweet';

    const data = {
    texto: textarea.value,
    usuario: {
        "id": "1",
        "nombre": "AREP",
        "clave": "admin",
        "correo": "AREP@AREP.com",
    },
    fecha: new Date(),
    };

    const options = {
    method: 'POST',
    headers: {
        'Content-Type': 'application/json'
    },
    body: JSON.stringify(data)
    };

    fetch(url, options)
    .then(response => {
        if (response.ok) {
        console.log('User created successfully!');
        window.location = "../home/home.html"
        } else {
        console.error('Failed to create user!');
        }
    })
    .catch(error => console.error('Error:', error));

}