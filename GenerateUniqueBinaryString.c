#include <stdio.h>

/*
 * generate_str - Divide and Conquer method to generate unique binary strings
 */
void generate_str(char *str, int pos)
{
  /* Base case: check if reaches the end of input string */
  if (str[pos] == '\0')
  {
    printf("%s\n", str);
    return;
  }
  
  /* When meets ?, there are 2 different posibilities */
  if (str[pos] == '?')
  {
    /* Case 0: make this char to '0' and move to next char */
    str[pos] = '0';
    generate_str(str, pos + 1);
    
    /* Case 1: make this char to '1' and move to next char */
    str[pos] = '1';
    generate_str(str, pos + 1);
    
    /* Change this char back to '?' */
    str[pos] = '?';
  }
  /* When meets other characters, keep going */
  else
  {
    generate_str(str, pos + 1);
  }
}

int main(void)
{
  char test[] = "10?1?";
  generate_str(test, 0);
  
  return 0;
}
