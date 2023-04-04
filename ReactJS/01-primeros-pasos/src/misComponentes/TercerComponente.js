import React from 'react'
const productos [
    {titulo:"motos", esFruta:false, id: 1},
    {titulo:"reloj", esFruta:false, id: 2},
    {titulo:"pera", esFruta:true, id: 3}
]

function TercerComponente() {
    const lista = productos.map((producto) => {
  return (
    <div>
      TercerComponente
    </div>
  )
}

export default TercerComponente
