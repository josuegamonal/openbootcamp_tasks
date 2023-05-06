let nombre = "Josué";
let apellido = "Gamonal";
let estudiante = `${nombre} ${apellido}`;
console.log(estudiante);

let estudianteMayus = estudiante.toUpperCase();
console.log(estudianteMayus);

let estudianteMinus = estudiante.toLowerCase();
console.log(estudianteMinus);

let strCount = estudiante.length;
console.log(strCount);

let firstChar = nombre.charAt(0);
console.log(firstChar);

let lastChar = apellido.charAt(apellido.length -1);
console.log(lastChar);

let noSpaces = estudiante.replace(` `, ``);
console.log(noSpaces);

let bool_var = estudiante.includes(nombre);
console.log(bool_var);
