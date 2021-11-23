//Tipo primitivo
let x = 10;

function cambiarValor(a){
    a = 20;
}

cambiarValor(x);//10
console.log(x);//10


//Paso por referencia
const persona = {
    nombre: "Salva",
    apellido: "Blas"
}

function cambiarValorObjeto(p){
    p.nombre = "Pepe";
    p.apellido= "Cruz";
}

cambiarValorObjeto(persona);
console.log(persona);
