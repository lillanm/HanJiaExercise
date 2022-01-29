#include <stdio.h>

typedef struct student
{
    char stuNum[20];
    int setNum;
    int passNum;
}student;

int main()
{
    int N, M;
    int i, j;
    int m[1000];
    student p[1000];
    scanf("%d", &N);
    for (i = 0; i < N; i++)
    {
        scanf("%s", &p[i].stuNum);
        scanf(" %d", &p[i].setNum);
        scanf(" %d", &p[i].passNum);
    }
    scanf("%d", &M);
    for (j = 0; j < M; j++)
    {
        scanf(" %d", &m[j]);
    }
    for (i = 0; i < M; i++)
    {
        for (j = 0; j < N; j++)
        {
            if (m[i] == p[j].setNum)
            {
                printf("%s %d\n", p[j].stuNum, p[j].passNum);
            }
        }
    }
}
