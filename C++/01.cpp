#include<iostream>
using namespace std;
int main()
{
	double a;
	double b;
	cin>>a;
	int c = a/250;
	switch(c)
		{
			case 0: b = a*1;break;
			case 1: b = a*0.98;break;
			case 2:
			case 3: b = a*0.95;break;
			case 4:
			case 5:
			case 6:
			case 7:b = a*0.92;break;
			case 8:
			case 9:
			case 10:
			case 11: b = a*0.9;break;
			default:b = a*0.85;break;
		}
		cout<<"运费="<<b; 
	return 0;
}