#include <iostream>
#include <algorithm>
#include <string>
#include <cmath>
#include <complex>
#include <stdio.h>
#include <ctime>
#include <iomanip>
#include<time.h>
#include<array>
#include <string.h>
using namespace std;
#ifndef ONLINE_JUDGE
#define debug(x) cerr<<#x<<"-->"<<x<<"\n";
#else
#define debug(x)
#endif

typedef long long ll;
void time(double time_taken){
	cout<<"Time Taken for Programme to Run is "<<fixed<<time_taken<<setprecision(5);
}
void fastIO(){
ios_base::sync_with_stdio(false);
cin.tie(NULL);
}



int main(){
#ifndef ONLINE_JUDGE
  freopen("input.txt", "r", stdin);
  freopen("output.txt", "w", stdout);
  freopen("error.txt","w",stderr);
#endif
clock_t start, end;
start = clock();
fastIO();
//CODE HERE!

end = clock();
double time_taken = (double(end - start) / double(CLOCKS_PER_SEC));
time(time_taken);
}
