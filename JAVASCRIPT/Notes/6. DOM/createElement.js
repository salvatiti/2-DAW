const lista = document.getElementById('lista');
const arrayItem = ['item1', 'item2', 'item3'];

//const fragment = new DocumentFragment(); 
const fragment = document.createDocumentFragment(); // crea un fragmento de documento

arrayItem.forEach(item => {
    const li = document.createElement('li'); // crea un elemento li
    li.textContent = item; // agrega el texto al elemento li
    fragment.appendChild(li); // agrega el elemento li al fragmento
});
lista.appendChild(fragment); // una vez que tenemos todos los li, se agregan a la lista mediante el fragmento
 