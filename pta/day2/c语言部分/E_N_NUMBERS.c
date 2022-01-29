#include<stdio.h>
#include<math.h> 

//说实话我有思路但不会写，有点嫌麻烦，改天我再自己写
//大佬的代码，递归，我这种凡人还是看看就好
int GCD(int a, int b)//求最大公约数 
{
	if (a == 0) return 0;
	else return (b == 0) ? a : GCD(b, a % b);
}
int main()
{
	int n, a, b, nume, deno, divisor, lcm;
	scanf("%d%d/%d", &n, &nume, &deno);
	divisor = GCD(nume, deno);
	if (divisor) { nume /= divisor; deno /= divisor; }
	for (int i = 1; i < n; i++)
	{
		scanf("%d/%d", &a, &b);
		lcm = deno * b / GCD(deno, b);
		nume = nume * lcm / deno + a * lcm / b; deno = lcm;
		divisor = GCD(abs(nume), abs(deno));//divisor为最大公因数
		if (divisor) {
			nume /= divisor;//分子约分 
			deno /= divisor;//分母约分   
		}
	}
	if (nume && nume / deno == 0) printf("%d/%d\n", nume, deno);
	else if (nume % deno == 0) printf("%d\n", nume / deno);
	else printf("%d %d/%d\n", nume / deno, nume % deno, deno);
	return 0;
}
