//Funcion constructor objetos de tipo persona
function Persona(nombre,apellido,email){
    //this. son las propiedades de nuestro objeto, y el segundo nombre es el parametro que se le pasa a la funcion
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
    this.nombreCompleto = function(){
        return this.nombre + " " + this.apellido;
    }
  }

  let padre = new Persona("Joselito", "Del Rio", "@gal.com")
  console.log(padre);

  let madre = new Persona("Andrea", "Duro", "duro@hotmal.com")
  console.log(madre);

  padre.nombre = "Carlos";
  console.log(padre.nombreCompleto());
  
  let miObjeto = new Object();
  let miObjeto2 = {};
  
  let miCadena1 = new String("Hola");
  let miCadena2 = "Hola";
