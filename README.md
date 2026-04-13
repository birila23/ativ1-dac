## Atividade 1 - Desenvolvimento de Aplicações Corporativas 
👩🏻‍💻 Desenvolvido por Ana Beatriz Queiroz de Almeida
### - Pré-requisitos

- Java 21
- Maven
- Docker 
### Como rodar

#### Subir os bancos de dados

```bash
docker-compose up -d
```
O PostgreSQL vai estar na porta: `5432` 

MongoDB na porta: `27017`.

A aplicação estará disponível em `http://localhost:8080/data`.
### - Endpoints

#### Salvar dado

**POST** `/exemplos`

Body:

```json
{
  "code": "123",
  "text": "Texto de exemplo",
  "confirmed": true
}
```
Para testar se funcionou no **postgreSQL**, no terminal digite:
```
 docker exec -it postgres_db psql -U admin -d mydb
```
```
SELECT * FROM tb_data;
```
e para testar no **mongoDB**
```
 docker exec -it mongo_db mongosh
```
```
db.TbData.find().pretty()
```
### Parar os bancos

```bash
docker-compose down
```
