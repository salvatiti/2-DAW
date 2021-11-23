const mascota = {
    nombre: 'Firulais',
    edad: 3,
    vivo: true,
    razas: ['perro', 'gato', 'pez'],
}

const nombreMascota = mascota.nombre; //Guardar el valor de nombre en una constante
const {nombre,edad} = mascota; //Destructurar el objeto. No hace falta guardar el valor en una constante,
// ya que se guarda directamente en la variable nombre
console.log(nombre);
console.log(edad);

//Objetos anidados
const wes ={
    first: 'Wes',
    last: 'Bos',
    links: {
        social:{
            twitter: '@wesbos',
            facebook: 'wesbos.developer'
        },
        web: {
            blog: 'https://wesbos.com'
    }
}
}
//Si quiero coger el valor de twitter y facebook se podria hacer de la siguiente manera
/*const twitter = wes.links.social.twitter;
const facebook = wes.links.social.facebook;
console.log(twitter + " / " + facebook);*/
//Es mas facil hacerlo con destructuring
const {twitter,facebook} = wes.links.social;
console.log(twitter,facebook);

//TODO
for (const key in wes) {
    console.log(wes[key]);
}

const object = {a: 1, b: 2, c: 3};
for (const key in object) {
    console.log(`${key}: ${object[key]}`);
}