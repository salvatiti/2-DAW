/*//FRAGMENT
// const lista = document.getElementById('lista');
const arrayLista = ['item 1', 'item 2', 'item 3'];
//const fragment = document.createDocumentFragment();

arrayLista.forEach(item => {
const li = document.createElement('li'); // crea un elemento li
li.classList.add('list') // el li tiene la clase list
const b = document.createElement('b'); // crea un elemento bold
b.textContent = 'Nombre:'; // el bold tiene el texto Nombre:
li.appendChild(b); // el bold esta dentro del li, lo empujamos al li
const span = document.createElement('span'); // crea un elemento span
span.classList.add('text-danger'); // el span tiene la clase text-danger
span.textContent = item; // el span tiene el texto item(texto dinamico)
li.appendChild(span); // el span esta dentro del li, lo empujamos al li
fragment.appendChild(li); //el frangment que ahora mismo no esta en ningun lado, lo tenemos que poner en li
});

lista.appendChild(fragment); // dentro de nuestra lista, le ponemos el fragment, que tiene dentro todo lo anterior

//INNERHTML (EASIER)
// const lista = document.getElementById('lista');
const arrayLista1 = ['item 3', 'item 4', 'item 5'];
let texto = '';
arrayLista1.forEach(item => {
texto += `<li class="list"><b>Nombre:</b><span class="text-danger">${item}</span></li>`;
});

lista.innerHTML = texto;
*/
//TEMPLATE
const lista = document.getElementById('lista');
const arrayLista2 = ['item 6', 'item 7', 'item 8'];
const template = document.querySelector('#template-li').content;
const fragment = document.createDocumentFragment();

arrayLista2.forEach(item => {
    //Nos situamos dentro de text-danger y le ponemos el texto dinamico
    template.querySelector('span').textContent = item
    const clone = template.cloneNode(true)
    fragment.appendChild(clone)
});
lista.appendChild(fragment);



