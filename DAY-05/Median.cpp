#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;

double findMedian(vector<int> &arr) {
    sort(arr.begin(), arr.end()); 

    int n = arr.size();
    if (n % 2 == 1) {
        return arr[n / 2]; 
    } else {
        return (arr[n / 2 - 1] + arr[n / 2]) / 2.0; 
    }
}

int main()
 {
    vector<int> array = {3, 1, 2, 4, 5}; 

    double median = findMedian(array);
    cout << "Median: " << median << endl;

}