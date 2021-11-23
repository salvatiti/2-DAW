//Objeto persona
let persona = {
  nombre: "Salva",
  apellido: "Blas",
  email: "titi1@gmail.com",
  edad: 29,
  idioma:  "es",
  hobbies: ["leer", "escribir", "dormir"],
  nombreCompleto: function () {
    return this.nombre + " " + this.apellido;
  },
  get language(){
      return this.idioma.toUpperCase();
  },
  set language(language){
      this.idioma = language.toLocaleUpperCase();
  }
  
};

console.log(persona);
console.log(persona.nombre, persona.edad);
console.log(persona.nombreCompleto());

//se puede acceder como si fuera un array, tiene que ir entre comillas
persona["apellido"];
console.log(persona["apellido"]);

//para acceder al array que hay dentro del objeto
console.log(persona.hobbies[0] + " y " + persona.hobbies[1]);

//For in para recorrer el objeto
for (propiedad in persona) {
  //para recorrer el nombre de la propiedad
  console.log(propiedad);
  //para recorrer el valor de la propiedad
  console.log(persona[propiedad]);
}

//Get
console.log(persona.language);
//Set
persona.language = "en";
console.log(persona.language);
console.log(persona.idioma);

//Agregar nueva propiedad
persona.telefono = "63256215";
console.log(persona);
//Cambiar un valor
persona.nombre = "Pepe";
console.log(persona);
//Eliminar propiedad
delete persona.telefono;
console.log(persona);


//Imprimir objetos
//Concatenar cada valor de cada propiedad
console.log(persona.nombre + ", " + persona.apellido);

//for in
for(propiedad in persona){
    console.log(persona[propiedad]);
}

//Object.values
let personaArray = Object.values(persona);
console.log(personaArray);

//JSON, pasandolo a cadena
let personaString = JSON.stringify(persona);
console.log(personaString);