	//calcular el factorial de 10 utilizando un bucle while, una bifurcación

	let nbr = 10;
	let i = 9;

	while (true) {
		nbr = nbr * i;
		if (i === 1){
			break;
		}
		i--;
	}
	console.log(nbr);
