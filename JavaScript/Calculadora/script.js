let numbers_stack = [];
let operator_stack = [];
let number_complete = false;

function appendToDisplay(value) {
    let display = document.getElementById("display");
    if (number_complete) 
        clearDisplay();
    if (!(display.value == '0' && value == '0') && 
    (value != '.' || display.value.indexOf('.') < 0)) {
        if (display.value == '0' && value != '.') {
            display.value = value;
        } else {
            display.value += value;
        }
    }
    number_complete = false;
}

function appendOperator(value) {
    let display = document.getElementById("display");
    if (value === '√') {
        let number = parseFloat(display.value);
        display.value = Math.sqrt(number);
    } else if (value === '^') {
        let number = parseFloat(display.value);
        display.value = Math.pow(number, 2);
    } else if (value === '%') {
        let number = parseFloat(display.value);
        display.value = number / 100;
    } else {
        operator(value);
    }
}

function operator(value) {
    if (!number_complete) {
        addNumberToStack();
        while (operator_stack.length > 0 && !precedence(topOfOperatorStack(), value)) {
            let result = partialCalculate();
            addResultToStack(result);
        }
    } else {
        getOperatorFromStack(value);
    }
    addOperatorToStack(value);
    addToExpression(value); 
}

function calculate() {
    addNumberToStack();
    let result = 0;
    while (operator_stack.length > 0) {
        result = partialCalculate();
        addResultToStack(result);
    }
    document.getElementById("display").value = result;
    addToExpression("= " + result); 
}

function clearDisplay() {
    document.getElementById("display").value = "";
    number_complete = false;
}

function backspace() {
    var displayValue = document.getElementById("display").value;
    document.getElementById("display").value = displayValue.substring(
        0, displayValue.length - 1
    );
}

function addNumberToStack() {
    let number = document.getElementById("display").value;
    number_complete = true;
    numbers_stack.push(number);
}

function addResultToStack(number) {
    numbers_stack.push(number);
}

function addOperatorToStack(value) {
    operator_stack.push(value);
}

function getOperatorFromStack() {
    return operator_stack.pop();
}

function partialCalculate() {
    let n2 = numbers_stack.pop();
    let n1 = numbers_stack.pop();
    let op = getOperatorFromStack();
    let result;
    if (op === '√') {
        result = Math.sqrt(n2);
    } else if (op === '^') {
        result = Math.pow(n1, n2);
    } else if (op === '%') {
        result = n1 * (n2 / 100);
    } else {
        result = eval(n1 + op + n2);
    }
    return result;
}

function precedence(op1, op2) {
    let operators = new Map([
        ['+', 1],
        ['-', 1],
        ['*', 2],
        ['/', 2],
        ['^', 3],
        ['√', 3],
        ['%', 3]
    ]);
    return operators.get(op2) > operators.get(op1); 
}

function topOfOperatorStack() {
    return operator_stack[operator_stack.length-1];
}

function addToExpression(entry) {
    let expression = document.getElementById("expression");
    expression.innerText += entry + " ";
}
