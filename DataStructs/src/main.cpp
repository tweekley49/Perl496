#include <stdlib.h>
#include <iostream>
#include "array.hpp"

using namespace std;

int main(int argc, char *argv[]) {
    /* You may write manual tests here. */

	/*int array[] = {1, 20, 3, 4, 50, 6, 7, 8, 9, 10};
	int size = 10;

	for (int i = 0; i < size -1; i++){
	for (int j = 0; j < size - i -1; j++){

	if (array[j] > array[j + 1]){
		int tmp = array[j];
		array[j] = array[j +1];
		array[j + 1] = tmp;

}
}

}
	for (int i =0; i < 10; i++){

		cout << array[i] << "\n";
}*/

	int ia[] = {1,-6,5,43,6,7};

	Array<int> iarray(ia, 6);

	/*iarray.remove(9);
	cout << "REMOVE 43" << "\n";
	for (int i = 0; i < 6; i++){
		cout << iarray[i] << "\n";
}*/

	cout << "index 5? " << iarray.indexOf(7) << "\n";

	iarray.bubbleSort();

	for (int i = 0; i < 6; i++){
		cout << iarray[i] << "\n";
}

cout << "Binary Search 0? " << iarray.binarySearch(-6) << "\n";

}

