# MVP Application
This is my personal project to learn spring boot based development. This is a beginner level coding. So other developers who are like me trying out stuffs like me can use this to practice.
## Prerequites
### Postgres Installation
#### Pull Docker image
```bash
docker pull postgres
```
#### Run Docker image
```bash
docker run --name some-postgres -e POSTGRES_PASSWORD=mysecretpassword -p 5432:5432 -d postgres
```