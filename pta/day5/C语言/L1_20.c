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
			//避免有些只有一个人的朋友圈重复添加产生的影响
			if (n != 1)
				a[m] += n;
		}

	}

	scanf("%d", &K);
	int w = K;
	while (w--)
	{
		scanf("%d", &m);

		if (a[m] == 0)//没有开朋友圈或自恋狂  
		{
			if (sum != 0) printf(" ");
			printf("%05d", m);//注意输出格式

			a[m] = -1;//避免多次被检测
			sum++;
		}
	}

	if (sum == 0) printf("No one is handsome");
	printf("\n");

	return 0;
}


