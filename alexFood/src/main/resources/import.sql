INSERT INTO cozinha (id, nome) VALUES (1, 'Tailandesa');
INSERT INTO cozinha (id, nome) VALUES (2, 'Indiana');
INSERT INTO cozinha (id, nome) VALUES (3, 'Brasileira');

INSERT INTO restaurante (nome, taxa_frete, cozinha_id) VALUES ('ThaiBox', '5.00', 1);
INSERT INTO restaurante (nome, taxa_frete, cozinha_id) VALUES ('TukTuk Indian', '5.00', 2);
INSERT INTO restaurante (nome, taxa_frete, cozinha_id) VALUES ('Paladar', '5.00', 3);

INSERT INTO forma_pagamento (descricao) VALUES ('A VISTA');
INSERT INTO forma_pagamento (descricao) VALUES ('CREDITO');
INSERT INTO estado (nome) VALUES ('MinasGerais');
INSERT INTO cidade (nome) VALUES ('Uberlandia');
INSERT INTO permissao (descricao, nome) VALUES ('ANVISA','LIBERADO');

