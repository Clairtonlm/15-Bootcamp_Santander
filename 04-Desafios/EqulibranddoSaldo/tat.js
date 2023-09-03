const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

// Solicita o saldo atual, valor do depósito e valor da retirada ao usuário
rl.question("Digite o saldo atual da conta bancária: ", (saldoAtual) => {
  rl.question("Digite o valor do depósito: ", (valorDeposito) => {
    rl.question("Digite o valor da retirada: ", (valorRetirada) => {
      // Converte os valores de entrada em números
      saldoAtual = parseFloat(saldoAtual);
      valorDeposito = parseFloat(valorDeposito);
      valorRetirada = parseFloat(valorRetirada);

      // Calcula o novo saldo após as transações
      const saldoAtualizado = saldoAtual + valorDeposito - valorRetirada;

      // Imprime o saldo atualizado com uma casa decimal
      console.log("Saldo atualizado: " + saldoAtualizado.toFixed(1));

      rl.close();
    });
  });
});
