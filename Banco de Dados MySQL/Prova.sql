# Prova - Questão 1

select fun_id, vnc_fun_id, vnc_id, vnc_vac_id, vac_id, fun_nome, vnc_data, vac_descricao
from funcionarios, vacinacoes, vacinas
where fun_id = vnc_fun_id and vac_id = vnc_vac_id
order by fun_nome asc, vnc_data asc, vac_descricao;

# Prova - Questão 2

select fun_id, lot_fun_id, lot_id, lot_uni_id, uni_id, cli_id, cli_nome_fantasia, fun_nome, lot_data, uni_nome
from funcionarios, lotacoes, unidades, clientes
where fun_id = lot_fun_id and uni_id = lot_uni_id and cli_id = uni_cli_id
order by cli_nome_fantasia asc, fun_nome asc, uni_nome;

# Prova - Questao 3

select fun_id, lot_fun_id, lot_id, lot_uni_id, uni_id, cli_id, cli_nome_fantasia, fun_nome, lot_data, uni_nome, vnc_data, vac_descricao
from funcionarios, lotacoes, unidades, clientes, vacinacoes, vacinas
where fun_id = lot_fun_id and uni_id = lot_uni_id and cli_id = uni_cli_id and fun_id = vnc_fun_id and vac_id = vnc_vac_id
order by cli_nome_fantasia asc, fun_nome asc, uni_nome;