document.write("<h1>Triangulo 1</h1>");

for (let i = 1; i <= 5; i++) {
  for (let j = 1; j <= i; j++) {
    document.write("* ");
  }
  document.write("<br>");
}

document.write("<h1>Triangulo 2</h1>");

for (let i = 5; i >= 1; i--) {
  for (let j = 1; j <= i; j++) {
    document.write("* ");
  }
  document.write("<br>");
}

document.write("<h1>Triangulo 3</h1>");

for (let i = 1; i <= 5; i++) {
  for (let j = 1; j <= 5 - i; j++) {
    document.write("&nbsp;");
  }
  for (let k = 1; k <= i ; k++) {
    document.write("* ");
  }
  document.write("<br>");
}

document.write("<h1>Triangulo 4</h1>");

for (let i = 5; i >= 1; i--) {
    for (let j = 1; j <= 5 - i; j++) {
      document.write("&nbsp;");
    }
    for (let k = 1; k <= i ; k++) {
      document.write("* ");
    }
    document.write("<br>");
  }


