#include <stdio.h>
struct poly
{
    int coeff;
    int exp;
};
void main()
{
    int n1, n2;
    printf("Enter number of terms in polynomial1:");
    scanf("%d", &n1);
    struct poly p1[n1];
    printf("Enter terms for first polynomial (coeff exp): \n");
    for (int i = 0; i < n1; i++)
    {
        printf("Term %d:", i + 1);
        scanf("%d %d", &p1[i].coeff, &p1[i].exp);
    }
    printf("\n");
    printf("Enter number of terms in polynomial2:");
    scanf("%d", &n2);
    struct poly p2[n2];
    printf("Enter terms for second polynomial (coeff exp): \n");
    for (int i = 0; i < n2; i++)
    {
        printf("Term %d:", i + 1);
        scanf("%d %d", &p2[i].coeff, &p2[i].exp);
    }
    // Maximum number of terms in the result is n1 + n2
    struct poly result[n1 + n2];
    int index1 = 0, index2 = 0, indexR = 0;

    // Add the polynomials
    while (index1 < n1 && index2 < n2)
    {
        if (p1[index1].exp > p2[index2].exp)
        {
            result[indexR++] = p1[index1++];
        } else if (p1[index1].exp < p2[index2].exp)
        {
            result[indexR++] = p2[index2++];
        } else
        {
            result[indexR].exp = p1[index1].exp;
            result[indexR].coeff = p1[index1].coeff + p2[index2].coeff;
            indexR++;
            index1++;
            index2++;
        }
    }

    // Copy remaining terms from poly1, if any
    while (index1 < n1) {
        result[indexR++] = p1[index1++];
    }

    // Copy remaining terms from poly2, if any
    while (index2 < n2)
    {
        result[indexR++] = p2[index2++];
    }

    // Print the result
    printf("The resulting polynomial is:");
    for (int i = 0; i < indexR; i++)
    {
        if (result[i].exp == 0)
        {
            printf("%d", result[i].coeff);
        } else
        {
            printf("%dx^%d", result[i].coeff, result[i].exp);  // Otherwise, print as usual
        }

        if (i != indexR - 1 && result[i + 1].coeff > 0)
        {
            printf(" + ");
        } else if (i != indexR - 1 && result[i + 1].coeff < 0)
        {
            printf(" ");
        }
    }
    printf("\n");
}
