const limitevalor = document.getElementById("capacidad")
let limitevalorcount = 500;
limitevalor.innerText = limitevalorcount;
const input = document.getElementById("input")
const result = document.getElementById("result")
const Search = () => {
         if (input.value === "") {
           result.innerHTML = "Ingrese un valor";
         } else if (!/[0-9]*0$/.test(input.value)) {
           result.innerHTML = "Ingrese un valor que termine en 0";
         } else {
           retirodinero();
         }
       }

function retirodinero() {
  const dinero = input.value;
  const mensaje = (dinero > limitevalorcount) ?
    "No puede retirar esa cantidad de dinero, excede el límite del cajero" :
      (() => {
        limitevalorcount -= dinero;
        limitevalor.innerText = limitevalorcount;
        return `Retiró ${dinero} pesos.`;
      })();
  result.innerHTML = mensaje;
}
