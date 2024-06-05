document.addEventListener("DOMContentLoaded", () => {
    const display = document.getElementById('display');
    const expressionElement = document.getElementById('expression');
    let expression = '';

    function appendToDisplay(value) {
        display.value += value;
    }

    function appendOperator(operator) {
        expression += display.value + operator;
        expressionElement.innerText = expression;
        display.value = '';
    }

    function clearDisplay() {
        display.value = '';
        expression = '';
        expressionElement.innerText = '';
    }

    function backspace() {
        display.value = display.value.slice(0, -1);
    }

    function calculate() {
        expression += display.value;
        expressionElement.innerText = expression;

        try {
            const result = evalExpression(expression);
            display.value = result;
        } catch (error) {
            display.value = 'Erro';
        }

        expression = '';
    }

    function evalExpression(expr) {
        
        expr = expr.replace(/÷/g, '/')
                   .replace(/x/g, '*')
                   .replace(/√/g, 'Math.sqrt')
                   .replace(/\^/g, '**')
                   .replace(/%/g, '/100*');

        return Function('"use strict"; return (' + expr + ')')();
    }

    window.appendToDisplay = appendToDisplay;
    window.appendOperator = appendOperator;
    window.clearDisplay = clearDisplay;
    window.backspace = backspace;
    window.calculate = calculate;
});
