***Api Documentation***
----
**Zadanie 2 - String Validation**
----
* **URL**
 <_http://localhost:8080/checkType/value={string}_>
 * **URL to ASCII**
 https://pl.wikipedia.org/wiki/ASCII#Tabela_kodów_ASCII
----
* **Response:**
<_Code:_>
* Check Lowercase:<br />
 get.chars().anyMatch((x) -> x >= 97 && x <= 122)
* Check UpperCase:<br />
 get.chars().anyMatch((x) -> x >= 65 && x <= 90)
* Check Digital:<br />
get.chars().anyMatch((x) -> x >=48&& x <= 57)
* Check Special symbols:<br />
  get.chars().anyMatch((x) -> (x >= 0 && x <= 47) ||(x >= 58 && x <= 64)|| (x >= 91 && x <= 96)||(x >= 123 && x <= 126) )
----
* **Example of usage:**<br />
Request:/checkType/value=WWQDjdWWQ!#$()Djd<br />
Resualt{<br />
    String have: Lowercase UpperCase special symbols<br />
}
