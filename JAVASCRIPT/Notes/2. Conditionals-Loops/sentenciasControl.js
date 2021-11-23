let hora = 20;

if(hora >= 0 && hora < 6 ){
    console.log(`Estoy durmiendo`);
}

else if(hora >= 6 && hora < 12){
    console.log(`Buenos dias`);
}

else if(hora > 11 && hora <= 18){
    console.log(`Buenas tardes`);
}

else if(hora > 18 && hora < 24){
    console.log(`Buenas noches`);
}

else{
    console.log(`Que haces loco`);
}
