#include<stdio.h>
int main(void) {
	int a, b;
	scanf("%d %d", &a, &b);
	int sum = 0;
	int flag = 0;
	for (int i = a; i <= b; i++) {
		sum += i;
		printf("%5d", i);
		flag++;

		if (flag % 5 == 0 && flag != 0) {
			printf("\n");
		}
	}
	if (flag % 5 != 0) {
		printf("\n");
	}
	printf("Sum = %d", sum);
	return 0;
}