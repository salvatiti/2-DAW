//Acepta como parametros, un Nº variable de estos, en cada uno de sus elementos
//Es decir, pueden ser arrays, o numeros. Ejem: media([1,4,3],7,8)
function media(...numeros) {
  let acu = 0,
    cuantos = 0;
  for (let n in numeros) {
    if (numeros[n] instanceof Array) {
      for (let m in numeros[n]) {
        acu += numeros[n][m];
        cuantos++;
      }
    } else {
      acu += numeros[n];
      cuantos++;
    }
  }
  return acu / cuantos;
}
console.log(media([10, 20, 30]));
console.log(media(10, 20));
console.log(media([4,4],2,2));
