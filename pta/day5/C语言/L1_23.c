//这也是一道简单的分支循环题
#include<stdio.h>
#include<string.h>
int main()
{
	char s[10050];
	int arr[4] = { 0,0,0,0 };
	scanf("%s", s);
	int len = strlen(s);
	for (int i = 0; i < len; i++)
	{
		if (s[i] == 'G' || s[i] == 'g') arr[0]++;
		if (s[i] == 'P' || s[i] == 'p') arr[1]++;
		if (s[i] == 'L' || s[i] == 'l') arr[2]++;
		if (s[i] == 'T' || s[i] == 't') arr[3]++;
	}
	while (arr[0] + arr[1] + arr[2] + arr[3])
	{
		if (arr[0] > 0)
		{
			printf("G");
			arr[0]--;
		}
		if (arr[1] > 0)
		{
			printf("P");
			arr[1]--;
		}
		if (arr[2] > 0)
		{
			printf("L");
			arr[2]--;
		}
		if (arr[3] > 0)
		{
			printf("T");
			arr[3]--;
		}
	}
}
