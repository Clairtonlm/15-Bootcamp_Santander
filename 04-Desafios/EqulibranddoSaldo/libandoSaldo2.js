// Solicita o saldo atual, valor do depósito e valor da retirada ao usuário
const saldoAtual = parseFloat(prompt("Digite o saldo atual da conta bancária:"));
const valorDeposito = parseFloat(prompt("Digite o valor do depósito:"));
const valorRetirada = parseFloat(prompt("Digite o valor da retirada:"));

// Calcula o novo saldo após as transações
const saldoAtualizado = saldoAtual + valorDeposito - valorRetirada;

// Exibe o saldo atualizado com uma casa decimal
alert("Saldo atualizado: " + saldoAtualizado.toFixed(1));
