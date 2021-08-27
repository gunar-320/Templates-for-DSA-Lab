#include <iostream>
#include <algorithm>
#include <string>
#include <cmath>
#include <complex>
#include <stdio.h>
#include <ctime>
#include <iomanip>
#include<math.h>
#define debug(x) cout<<#x<<"-->"<<x<<"\n";
using namespace std;
typedef long long ll;
void time(double time_taken){
    cout<<"Time Taken for Programme to Run is "<<fixed<<time_taken<<setprecision(5)<<"\n";
}

void swap(int x1,int y1){
  int temp = x1;
  x1=y1;
  y1=temp;
}
int main(){
#ifndef ONLINE_JUDGE
  freopen("input.txt", "r", stdin);
  freopen("output.txt", "w", stdout);
#endif

time_t start,end;
time(&start);
ios_base::sync_with_stdio(false);
cin.tie(NULL);
//CODE HERE
int t;
cin>>t;
debug(t);
cout<<t<<"\n";
time(&end);
double time_taken = double(end-start);
time_taken=time_taken/1000;
time(time_taken);


}
