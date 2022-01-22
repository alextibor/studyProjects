AGENDA = {
    "guilherme": {
        "tel": "99999-1010",
        "email": "contato@solyd.com.br",
        "endereco": "av. 1"
    },
    "maria": {
        "tel": "99229-2020",
        "email": "maria@solyd.com.br",
        "endereco": "av. 2"
    },
    "joao": {
        "tel": "98267-6060",
        "email": "joao@solyd.com.br",
        "endereco": "av. 3"
    },
}

AGENDA['guilherme']['endereco'] = "Rua das nações"

AGENDA['lucas'] = {
    "tel": "98882-2189",
    "email": "lucal@solyd.com.br",
    "endereco": "av. josé bonifacio",
}

AGENDA.pop("guilherme")

for contato in AGENDA:
    print(contato)

print(AGENDA['lucas'])
