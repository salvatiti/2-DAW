const items = document.getElementById('items');
const templateCard = document.getElementById('template-card').content; //para acceder a los elemenos de nuestra pagina
const fragment = document.createDocumentFragment();


//Se dispara cuando el documento HTML ha sido cargado
document.addEventListener('DOMContentLoaded', () => {
    fetchData(); //Se dispara la función fetchData
} );

const fetchData = async () => {
    try {
        const res = await fetch('api.json');//espera la respuesta del fetch, tiene que estar dentro de async
        const data = await res.json();//cada uno de nuestros datos. Espera la respuesta del json
        pintarCards(data);
    } catch (error) {
        console.log(error);
    }
};

const pintarCards = (data) => {
    data.forEach(producto => {
        templateCard.querySelector('h5').textContent = producto.title; //selecciona el elemento h5 y le asigna el titulo del producto
        templateCard.querySelector('p').textContent = producto.price; //selecciona el elemento P y le asigna el precio del producto
        templateCard.querySelector('img').setAttribute('src',producto.url); //selecciona el elemento img y le asigna la imagen del producto
        const clone = templateCard.cloneNode(true); //clona el templateCard
        fragment.appendChild(clone); //agrega el clone al fragment
    });
    items.appendChild(fragment); //agrega el fragment al elemento items
}