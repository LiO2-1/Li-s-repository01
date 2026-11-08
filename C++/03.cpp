#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
    int a;
    cin>>a;
    if(a==1){
        cout<<"false";
    }else if (a==2)
    {
        cout<<"true";
    }else{
        for(int x =2 ; x<a ; x++){
            if (a%x==0){
                    cout<<"false";
                    return 0;
                }
        }
        cout<<"true";
}
}