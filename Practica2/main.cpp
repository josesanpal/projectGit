

#include <iostream>
#include "Biblio_p02.h"

using namespace std;
											//JOSE MIGUEL SANTOS PALOMERA
//variables globales
double a, b, c;
double x1, x2;
int numSols;

void pedircoeficientes(double&, double&, double&);

void respuesta(double, double, double, double, double, int);

int main()
{
	pedircoeficientes(a, b, c);
	numSols=calcula(a,b,c, x1, x2);
	respuesta(a,b,c,x1,x2,numSols);
}
	void pedircoeficientes(double& oa, double& ob, double& oc )
	{
		setlocale(LC_ALL, "");
		do{
		cout << "introduzca el valor de a: ";
		cin >> oa;
		} while (a == 0);
		cout << "introduzca el valor de b: ";
		cin >> ob;
		cout << "introduzca el valor de c: ";
		cin >> oc;

	}

	
	void respuesta(double oa, double ob, double oc, double o1x, double o2x, int onumSols) {
		cout << "Con los valores de a = " << oa << " b = " << ob << " c = " << oc << endl;
		cout << "Hay " << onumSols << " soluciones" << endl;
		if (onumSols == 2) {
			cout << "la solución de x1 es " << o1x << endl;
			cout << "la solución de x2 es " << o2x << "\n";
		}
		else if (onumSols == 1) {
			cout << "la solución de x1 es " << o1x << endl;
		}
	}

