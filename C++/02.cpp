#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
	int a;
	int n;
	cin>>a>>n;
	double c = 0;
	double sum = 0;
	for(int x=1;x<=n;x++){
		c = c*10+a;
		sum += c;
        cout<<c;
		if(x<n){
			cout<<"+";
	    }else{
            cout<<"+"<<sum<<endl;
        }
}
}