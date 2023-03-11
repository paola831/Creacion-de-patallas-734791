const circulos = document.querySelectorAll('.circulo');
const nombreInput = document.querySelector('#nombre');
const numeroInput = document.querySelector('#numero');

circulos.forEach(circulo => {
    circulo.addEventListener('click', () => {
        const numero = circulo.getAttribute('data-numero');
        nombreInput.value = 'Círculo ' + numero;
        numeroInput.value = numero;
    });
});
