// Biblio_Practica.cpp: Este archivo contiene la implementaqcón de la biblioteca
//
#include <math.h>
#include "Biblio_Practica01.h"

int calcula(double ia, double ib, double ic, double& ox1, double& ox2 ) {
		double discr;
		int numSolsres;
		discr = ib * ib - 4 * ia * ic;

		if (discr < 0) {
			numSolsres = 0;
		}
		else if (discr == 0) {
			numSolsres = 1;
		}
		else {
			numSolsres = 2;
		}
		if (numSolsres == 2) {
			ox1 = (-ib + sqrt(discr)) / (2 * ia);
			ox2 = (-ib - sqrt(discr)) / (2 * ia);	
		}
		else if (numSolsres == 1) {
			ox1 = -ib / (2 * ia);
		}
		return numSolsres;
	}
	