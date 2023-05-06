
let altura_cm = 180;
let altura_m = altura_cm / 100;
console.log(altura_m);
let peso_kg = 80.80;

let altura_redondeada = Math.ceil(altura_m);
console.log(altura_redondeada);

let peso_redondeo_abajo = Math.floor(peso_kg);
console.log(peso_redondeo_abajo);

let max = Number.MAX_VALUE;
let max_plus_one = max + 1;
let equal = max + max_plus_one;
console.log(equal);

const maxVal = Number.MAX_SAFE_INTEGER;
const maxValPlusOne = BigInt(maxVal) + BigInt(1);
const isEqual = maxValPlusOne === BigInt(Number.MAX_VALUE);
console.log(isEqual);
