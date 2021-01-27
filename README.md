# Caesar-Cipher-Encrypt-n-Decrypt
## Algorithm for Caesar Cipher:
### Input:

A String of lower case letters, called Text.
An Integer between 0-25 denoting the required shift.
Procedure:

Traverse the given text one character at a time .
For each character, transform the given character as per the rule, depending on whether we’re encrypting or decrypting the text.
Return the new string generated.
Program that receives a Text (string) and Shift value( integer) and returns the encrypted text.

<img src="https://www2.seas.gwu.edu/~simhaweb/cs1111/classwork/module14/figures/caesarpicture.PNG">

## How to decrypt?
We can either write another function decrypt similar to encrypt, that’ll apply the given shift in the opposite direction to decrypt the original text. However we can use the cyclic property of the cipher under modulo , hence we can simply observe

###          Cipher(n) = De-cipher(26-n)
<img src="https://www.geeksforgeeks.org/wp-content/ql-cache/quicklatex.com-2fa18340a62f44efc5fc32cb361a047e_l3.svg">
