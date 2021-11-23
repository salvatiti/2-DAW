const web = {
    nombre: "salva",
    links: {
        enlace: "www.google.es"
    },
    redesSociales:{
        youtube: {
            enlace: "www.youtube.es",
            nombre: "salva.Youtube"
        },
        facebook: {
            enlace: "www.facebook.es",
            nombre: "salva.Facebook"
    }
}
};

const enlaceFb = web.redesSociales.facebook.enlace;
console.log(enlaceFb);

//Destructuring
const {enlace,nombre} = web.redesSociales.youtube;
console.log(enlace);