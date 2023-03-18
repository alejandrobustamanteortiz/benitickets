
## TABLA 3 FILAS Y 8 COLUMNAS


![[Pasted image 20230318091600.png]]


```java
<div class="tableCalculator">  
  
    <table>  
        <thead>  
                <tr>  
                    <td>1</td>  
                    <td>2</td>  
                    <td>3</td>  
                </tr>  
                <tr>  
                    <td>1</td>  
                    <td>2</td>  
                    <td>3</td>  
                </tr>  
                <tr>  
  
                    <td>1</td>  
                    <td>2</td>  
                    <td>3</td>  
                </tr>  
                <tr>  
                    <td>1</td>  
                    <td>2</td>  
                    <td>3</td>  
                </tr>  
                <tr>  
                    <td>1</td>  
                    <td>2</td>  
                    <td>3</td>  
                </tr>  
                <tr>  
                    <td>1</td>  
                    <td>2</td>  
                    <td>3</td>  
                </tr>  
                <tr>  
                    <td>1</td>  
                    <td>2</td>  
                    <td>3</td>  
                </tr>  
                <tr>  
                    <td>1</td>  
                    <td>2</td>  
                    <td>3</td>  
                </tr>  
        </thead>  
        <tbody>  
  
        </tbody>  
    </table>  
  
</div>
```

## Estructura recomendada


```java

<div class="tableCalculator">  
  
    <table th:style="'border: 1px solid black;'">  
        <thead>  
        <tr>  
            <td th:scope="col">TypeBill</td>  
            <td th:scoope="col">Quantity</td>  
            <td th:scoope="col">Total</td>  
        </tr>  
  
        </thead>  
        <tbody>  
  
        <tr th:each="customer: ${customers}">  
            <td th:text="${customer.id}"></td>  
            <td th:text="${customer.id}"></td>  
            <td th:text="${customer.id}"></td>  
        </tr>  
        </tbody>  
    </table>  
  
</div>
```

En el thead se incluyen los encabezados

En el tbody se incluyen los datos