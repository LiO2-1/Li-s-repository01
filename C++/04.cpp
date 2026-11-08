#include<iostream>
using namespace std;

    bool bei (int a ,int b){
	    if(a%b==0)
		    return true;
	    else
		    return false;
    }

int main()
{
   int a,b;
   cin>>a>>b;
   if(bei(a,b)){
    cout<<"是";
   }else{
    cout<<"否";
   }
}

