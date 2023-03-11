const form = document.getElementById('reservacion-form');

form.addEventListener('submit', (event) => {
	event.preventDefault();

	const nombre = document.getElementById('nombre').value;
	const apellido = document.getElementById('apellido').value;
	const telefono = document.getElementById('telefono').value;
	const mesa = document.getElementById('mesa').value;
    const correo = document.getElementById('correo').value;

	// Simulamos el envío de correo de confirmación
	alert(`¡Gracias por hacer tu reserva ${nombre} ${apellido}! Tu número de mesa es ${mesa}. Se ha enviado un correo de confirmación a ${telefono}.`);
});
