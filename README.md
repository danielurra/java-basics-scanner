# java-basics-scanner
Scanner allows you to read input from the user via the console
## Scanner in action
<img width="289" alt="scanner-01" src="https://github.com/danielurra/java-basics-scanner/assets/51704179/8150af58-f6e3-460a-9b6d-bef108646898"><br>

## Grab the code
```java
package package_scanner;

import java.util.Scanner;

public class classScanner {
    public static void main(String[] args) {
        System.out.println("Please enter your name: ");
        Scanner dannyScanner = new Scanner(System.in);
        String nombreIngresado = dannyScanner.nextLine();

        System.out.println("Hello, " + nombreIngresado);
    }
}
```
