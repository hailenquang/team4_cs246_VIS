#include<bits/stdc++.h>
using namespace std;
int main()
{
	int k,n ;
	cout<<"nhap n ";
	cin>>n;
	cout<<"nhao k";
	cin>>k;
	double s=1,S=1,s2=1;
	if(k<n<25){
	for(int i=1;i<=n;i++)
	s=s*i;
	for(int a=1;a<=k;a++)
	S=S*a;
	for(int b=1;b<=(n-k);b++)
	s2=s2*b;
	double kn=(s)/(S*s2);
	double nk=(s)/(s2*S);
	cout<<"c(k,n)="<<kn;
	cout<<"\n c(n-k,n)="<<nk;
	
}
    
	
	
	
	
}
