const parrotSay = require('parrotsay-api')
 
parrotSay('Hola Parrot')
  .then(console.log)
  .catch(console.error)