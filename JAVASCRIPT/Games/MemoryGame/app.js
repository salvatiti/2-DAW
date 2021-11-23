document.addEventListener("DOMContentLoaded", () => {
      //opciones

      const cardArray = [ //creamos en array de cartas, 2 cartas con la misma imagen ya que hay que desvelar dos cartas
        {
          name: "fries",
          img: "images.fries.png",
        },

        {
          name: "fries",
          img: "images.fries.png",
        },

        {
          name: "cheeseburguer",
          img: "images.cheeseburguer.png",
        },

        {
          name: "cheeseburguer",
          img: "images.cheeseburguer.png",
        },

        {
          name: "hotdog",
          img: "images.hotdog.png",
        },

        {
          name: "hotdog",
          img: "images.hotdog.png",
        },

        {
          name: "ice-cream",
          img: "images.ice-cream.png",
        },

        {
          name: "ice-cream",
          img: "images.ice-cream.png",
        },

        {
          name: "milkshake",
          img: "images.milkshake.png",
        },

        {
          name: "milkshake",
          img: "images.milkshake.png",
        },

        {
          name: "pizza",
          img: "images.pizza.png",
        },

        {
          name: "pizza",
          img: "images.pizza.png",
        }

      ]

      const grid = document.querySelector('grid') //definimos el grid 

      //crear el tablero
      function createBoard() {
        for (let i = 0; i < cardArray.length; i++) {
          var card = document.createElement('img') //por cada carta se crea un elemento imagen
          card.setAttribute('src', 'image/blank.png');
          card.setAttribute('data-id', i) //se le pone a cada  carta un data-id para dar un id que vaya de 0 a 11(12 cartas)
          //card.addEventListener('click', flipboard) //evento para cuando se haga click en la carta se de la vuelta
          grid.appendChild(card);
        }
      
      }
} 