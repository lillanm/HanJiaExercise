#include<stdio.h>
#include<math.h> 

//˵ʵ������˼·������д���е����鷳�����������Լ�д
//���еĴ��룬�ݹ飬�����ַ��˻��ǿ����ͺ�
int GCD(int a, int b)//�����Լ�� 
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
		divisor = GCD(abs(nume), abs(deno));//divisorΪ�������
		if (divisor) {
			nume /= divisor;//����Լ�� 
			deno /= divisor;//��ĸԼ��   
		}
	}
	if (nume && nume / deno == 0) printf("%d/%d\n", nume, deno);
	else if (nume % deno == 0) printf("%d\n", nume / deno);
	else printf("%d %d/%d\n", nume / deno, nume % deno, deno);
	return 0;
}
