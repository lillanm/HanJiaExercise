#include<stdio.h>
int main()
{

	int a[100000] = { 0 };
	int N, n, m, K, i;

	int sum = 0;

	scanf("%d", &N);
	int N1 = N;
	while (N1--)
	{
		scanf("%d", &n);
		for (i = 1; i <= n; i++)
		{
			scanf("%d", &m);
			//������Щֻ��һ���˵�����Ȧ�ظ���Ӳ�����Ӱ��
			if (n != 1)
				a[m] += n;
		}

	}

	scanf("%d", &K);
	int w = K;
	while (w--)
	{
		scanf("%d", &m);

		if (a[m] == 0)//û�п�����Ȧ��������  
		{
			if (sum != 0) printf(" ");
			printf("%05d", m);//ע�������ʽ

			a[m] = -1;//�����α����
			sum++;
		}
	}

	if (sum == 0) printf("No one is handsome");
	printf("\n");

	return 0;
}


