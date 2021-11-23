/*1) 3 chicos e 32 años entran a una heladeria a comprar un helado pero hay un problema:
los precios no estan al lado de cada estante con su respectivo helado.
Ellos quieren comprar el elado mas caro que puedan con el money que tienen, asi que... veamos como ayudarlos

Roberto tiene 1.5 €
Pedro tiene 1.7 €
Cofla tiene 3 €

Los precios de helados son:
- Palito de helado de agua: 0.60 €
- Palito de helado de crema: 1 €
- Bombón helado marca heladix: 1.60 €
- Bombón helado marca heladovich: 1.70 €
- Bombón helado marca helardo: 1.80 €
- Potecito de helado con confites: 2.90 €
- Pote de 1/4 Kg: 2.90 €

CREAR SOLUCIONES:
- Pedirles que ingresen el inero que tienen y mostrarles el helado que puede comprar con ese money
- Si hay 2 o mas opciones con el mismo precio, mostrar ambos.
- Cofla quiere saber cuanto le sobra.
*/

const purchase = (name)=>{
    /*Creamos una funcion fecha que se le va a pasar por parametro name, la funcion va a devolver
    algo depende de lo que el usuario ponga por pantalla.
    Creamos la variable money donde se va a almacenar lo que ponga el usuario. */
    let money = prompt(`money de ${name}`);
    if(money >= 0.6 && money < 1) return (`${name}: helado de agua, y te sobra ${money - 0.6}`);
    if(money >= 1 && money < 1.6) return (`${name}: helado de crema, y te sobra ${money - 1}`);
    if(money >= 1.6 && money < 1.7) return (`${name}: bombón helado marcan  heladix, y te sobra ${money - 1.6}`);
    if(money >= 1.7 && money < 1.8) return (`${name}: bombón helado marca heladovich, y te sobra ${money - 1.7}`);
    if(money >= 1.8 && money < 2.9) return (`${name}: bombón helado marca helardo, y te sobra ${money - 1.8}`);
    if(money >= 2.9 ) return (`${name}: potecito de helado con confites o pote de 1/4kg, y te sobra ${money - 2.9}`);
    else return (`${name}: no puede comprar nada`);
}	
//Cuando se llama a la función se le pone un valor a la variable name.
alert(purchase('Roberto'));
alert(purchase('Pedro'));
alert(purchase('Cofla'));
    
