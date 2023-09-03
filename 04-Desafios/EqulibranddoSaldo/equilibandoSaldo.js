// Solicita o saldo atual, valor do depósito e valor da retirada ao usuário
// Função para ler uma linha de entrada do usuário
function gets() {
    return prompt(); // No navegador, o prompt() funciona como entrada de texto
  }
  
  // Solicita o saldo atual, valor do depósito e valor da retirada ao usuário
  const saldoAtual = parseFloat(gets());
  const valorDeposito = parseFloat(gets());
  const valorRetirada = parseFloat(gets());
  
  // Calcula o novo saldo após as transações
  const saldoAtualizado = saldoAtual + valorDeposito - valorRetirada;
  
  // Imprime o saldo atualizado com uma casa decimal
  function print(message) {
    console.log(message); // No navegador, isso imprime no console
  }
  
  print("Saldo atualizado: " + saldoAtualizado.toFixed(1));
  