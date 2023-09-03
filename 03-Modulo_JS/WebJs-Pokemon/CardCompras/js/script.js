const quantityElement = document.getElementById('quantity');
const increaseButton = document.getElementById('increase');
const decreaseButton = document.getElementById('decrease');

increaseButton.addEventListener('click', () => {
    let quantity = parseInt(quantityElement.innerText);
    quantity++;
    quantityElement.innerText = quantity;
});

decreaseButton.addEventListener('click', () => {
    let quantity = parseInt(quantityElement.innerText);
    if (quantity > 1) {
        quantity--;
        quantityElement.innerText = quantity;
    }
});

const addToCartButton = document.getElementById('addToCart');
addToCartButton.addEventListener('click', () => {
    const quantity = parseInt(quantityElement.innerText);
    alert(`Adicionado ${quantity} ao carrinho.`);
});

const calculateShippingButton = document.getElementById('calculateShipping');
calculateShippingButton.addEventListener('click', () => {
    const cep = document.getElementById('cep').value;
    alert(`Calculando frete para CEP: ${cep}`);
});
