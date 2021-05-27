# Spring-api-condominio
### O projeto tem como objetivo deixar uma api para estudantes de front end realizarem a implementação do front e com os testes podendo serem realizado na propria máquina.

## O projeto contém os seguintes recursos.
- Java 11
- Banco de dados em memoria H2
- JPA e o Hibernate
- SwaggerII para documentar todo o projeto


## End points para listar os dados dos usuarios

# GET
http://localhost:8080/usuarios      - Retorna todos os usuarios cadastrados
http://localhost:8080/usuarios/{id} - Retorna o usuario através do id
http://localhost:8080/usuarios?nome=usuario

Retorno esperado nos testes
tests["consulta usuarios"] = responseCode.code === 200;

-retorno do GET

    [
        {
            "nome": "admin",
            "email": "maxwell@gmail.com",
            "telefone": "90909090"
        },
        {
            "nome": "jose",
            "email": "jose@gmail.com",
            "telefone": "90909090"
        },
        {
            "nome": "maria",
            "email": "maria@gmail.com",
            "telefone": "90909090"
        },
        {
            "nome": "seinao",
            "email": "seinao@gmail.com",
            "telefone": "90909090"
        }
    ]

# POST

http://localhost:8080/usuarios  Obs: o veiculo ele pode ser vinculado ao usuario no momento do cadastro do usuario ou em outro endpoint que será 
disponibilizado em breve.

    {
        "nome":"maxwell",
        "email":"maxwell@gmail.com",
        "telefone": "90909090"
        "veiculo":[
            {
                "placa":"placa",
                "cor":"cor",
                "modelo":"modelo"
            }
        ]
    }



