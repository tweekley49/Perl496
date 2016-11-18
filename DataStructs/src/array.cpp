/* Array is templated, therefore only include the code if it is included from
 * the header file! 
 */
#ifdef ARRAY_H
#include <stdio.h>

/* Do a deep copy of the array into the list.
 * Note: This one uses a pointer!
 */

template <class T>
Array<T>::Array(){
	mLen = 0;
	mArray = NULL;
}

template <class T>
Array<T>::Array(const T *array, const int size){
	mLen = size;
	mArray = new T[mLen];
	for (int i = 0; i < mLen; i++){
		mArray[i] = array[i];
	}
}

/* Do a deep copy of the array into the list
 * Note: This one uses a reference to a List!
 */
template <class T>
Array<T>::Array(const Array<T> &list){
	for (int i = 0; i < mLen; i++){
		mArray[i] = list.mArray[i];
	}

}


/* Return the current length of the array */
template <class T>
int Array<T>::getLength() const{return mLen;}

/* Returns the index in the array where value is found.  
* Return -1 if value is not present in the array.
*/
template <class T>
int Array<T>::indexOf(const T &value){
	for (int i=0; i < mLen; i++){
		if (mArray[i] == value) {return i;}
	}
	return -1;
}

/* Removes an item at position index by shifting later elements left.
* Returns true iff 0 <= index < size.
*/
template <class T>
bool Array<T>::remove(const int index){

	if (index < 0 || index > mLen){return false;}

	if (0 <= index && index < mLen){
		for (int i = index; i < mLen - 1; i++){
		mArray[i] = mArray[i + 1];
	}
		Array(mArray, --mLen);
		return true;
}
}

/* Retrieves the element at position pos */
template <class T>
T& Array<T>::operator[](const int pos) const{

	return mArray[pos];

}

/*return true with array and list are same*/
template <class T>
bool Array<T>::operator==(Array<T> &list) const {

	int sizeChecker = 0;
	for (int i = 0; i < list.getLength(); i++){
		sizeChecker++;}

	if (sizeChecker != mLen) {return false;}
	
		for(int j = 0; j < mLen; j++){
			if (list[j] != this->mArray[j]){return false;}
	        }

	return true;
    
}


template <class T>
void Array<T>::bubbleSort(){
	for (int i = 0; i < mLen -1; i++){
	for (int j = 0; j < mLen - i -1; j++){

	if (mArray[j] > mArray[j + 1]){
		int tmp = mArray[j];
		mArray[j] = mArray[j +1];
		mArray[j + 1] = tmp;

}
}
}
}
//use indexOf
template <class T>
int Array<T>::binarySearch(const T &value){
	int Low = 0;
	int high = mLen;
	while (Low <= high) {
		int mid = (Low + high) / 2;
		if (mArray[mid] == value) {return mid;}
		else if (mArray[mid] < value) {Low = mid + 1;}
		else {high= mid - 1;}
		mid = ((Low + high) / 2);

	}   
	return -1;
}

template <class T>
Array<T>::~Array() {
	delete[] mArray;
}

#endif
