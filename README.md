### Informações
 - Banco de dados utilizado: H2 memória.

####
Endpoint: http://localhost:8080/transaction

````
POST /transaction HTTP/1.1
Host: localhost:8080
Content-Type: application/json
cache-control: no-cache
{
	"date": "01/01/2019",
	"time": "13:52:33",
	"value": 100.00,
	"cardApplication": "DEBITO",
	"status": "SUCCESS"
}
````

####
Endpoint: http://localhost:8080/transaction/all

````
GET /transacon/all HTTP/1.1
Host: localhost:8080
Content-Type: applicaon/json
cache-control: no-cache
````

####
Endpoint: http://localhost:8080/transaction

````
PUT /transaction/all HTTP/1.1
Host: localhost:8080
Content-Type: application/json
cache-control: no-cache
{
  "id": 1,
  "date": "01/01/2019",
  "time": "13:52:33",
  "value": 290.00,
  "cardApplication": "CREDITO",
  "status": "SUCCESS"
}
````